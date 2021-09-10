package com.telefonica.queryclient.business.impl;

import com.telefonica.queryclient.assembler.Assembler;
import com.telefonica.queryclient.business.ClientService;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.Request.FindMobileRequest;
import com.telefonica.queryclient.repository.ClientRepository;
import com.telefonica.queryclient.repository.MobileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    private final MobileRepository mobileRepository;


    @Override
    public List<MobileDTO> findClient(FindMobileRequest findMobileRequest){

        return mobileRepository.findByTypedocumentAndNumberDocument(findMobileRequest.getTypeDocument(), findMobileRequest.getNumberDocument()).
                stream().map(x -> Assembler.mapMobileToMobileDTO(x)).collect(Collectors.toList());


//        Response resp = new Response();
//        List<MobileDTO> mobilesResp = new ArrayList<>();
//
//        ClientDTO clientResp = clientRepository.findByTypeDocumentAndNumberDocument(findMobileRequest.getTypeDocument(), findMobileRequest.getNumberDocument()).
//                stream().map(x -> Assembler.mapClientToClientDTO(x)).findFirst().orElse(null);
//
//        List<MobileDTO> mobiles = mobileRepository.findByTypedocumentAndNumberDocument(findMobileRequest.getTypeDocument(), findMobileRequest.getNumberDocument()).
//                stream().map(x -> Assembler.mapMobileToMobileDTO(x)).collect(Collectors.toList());
//
//        List<OfertDTO> ofertList = new ArrayList<>();
//
//        for (MobileDTO movil :  mobiles) {
//            MobileDTO mv = new MobileDTO();
//            mv.setOfertList(ofertList.stream().filter(x-> x.getMobilefk().equalsIgnoreCase(movil.getNumber())).collect(Collectors.toList()));
//            mobilesResp.add(mv);
//        }
//
//
//
//        clientResp.setMobileList(mobilesResp);
//
//        resp.setClients(clientResp);


    }

}
