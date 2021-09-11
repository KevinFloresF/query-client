package com.telefonica.queryclient.business.impl;

import com.telefonica.queryclient.assembler.Assembler;
import com.telefonica.queryclient.business.ClientService;
import com.telefonica.queryclient.model.dto.ClientDTO;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.OfertDTO;
import com.telefonica.queryclient.model.dto.Request.ClientRequest;
import com.telefonica.queryclient.model.entity.Client;
import com.telefonica.queryclient.model.entity.Mobile;
import com.telefonica.queryclient.model.entity.Ofert;
import com.telefonica.queryclient.repository.ClientRepository;
import com.telefonica.queryclient.repository.MobileRepository;
import com.telefonica.queryclient.repository.OfertRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private static final Logger LOG = LogManager.getLogger();

    private final ClientRepository clientRepository;

    private final MobileRepository mobileRepository;

    private final OfertRepository ofertRepository;


    @Override
    @Cacheable(value = "findByTypeDocAndNumDoc",keyGenerator = "customKeyGenerator",  unless = "#result.size()==1")
    public List<MobileDTO> findClient(ClientRequest clientRequest){
        LOG.info("Find Client by Type Doc and Number Document of {}", clientRequest.toString());
        return mobileRepository.findByTypedocumentAndNumberDocument(clientRequest.getTypeDocument(), clientRequest.getNumberDocument()).
                stream().map(x -> Assembler.mapMobileToMobileDTO(x)).collect(Collectors.toList());

    }

    @Override
    @Cacheable (value = "findClientsByDate",keyGenerator = "customKeyGenerator",  unless = "#result.size()==1")
    public List<ClientDTO> findClientsByDate(ClientRequest clientRequest) {
        LOG.info("Find Client By Dates {}", clientRequest.toString());

        List<Client> clients = clientRepository.findAll();

        List<ClientDTO> clientsDTO = clients.stream()
                // Mas de 3 lineas mobiles activas
                .filter(
                        client -> client.getMobiles()
                                .stream()
                                .filter(mobile ->  mobile.isStatus())
                                .collect(Collectors.toList()).size() >= 3)
                // Seteamos los valor en un client
                .map(client -> {
                  client.setMobiles(client.getMobiles().stream().
                          filter(mobile -> mobile.isStatus()).collect(Collectors.toList()));

                    return client;
                })
                .map(client -> {
                    List<Mobile> mobiles = client.getMobiles();
                    mobiles.forEach(mobile -> {
                        mobile.setOferts(mobile.getOferts().stream().
                                filter(offert -> clientRequest.getBeginDate().before(offert.getEndDate())
                                        && offert.getEndDate().before(clientRequest.getEndDate()))
                                .sorted(Comparator.comparing(Ofert::getEndDate)).collect(Collectors.toList()));
                    });
                    client.setMobiles(mobiles.stream().filter(mobile -> !mobile.getOferts().isEmpty()).collect(Collectors.toList()));

                    client.setMobiles(client.getMobiles()
                            .stream()
                            .map(mobile -> {
                        if (!mobile.getOferts().isEmpty())
                        {
                            mobile.setOferts(Arrays.asList(mobile.getOferts().get(0)));
                        }
                        return mobile;
                    }).collect(Collectors.toList()));



                    return client;
                })
                .map(ClientDTO::new)
                .collect(Collectors.toList());

        return clientsDTO;


    }

}
