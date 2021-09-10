package com.telefonica.queryclient.business.impl;

import com.telefonica.queryclient.assembler.Assembler;
import com.telefonica.queryclient.business.ClientService;
import com.telefonica.queryclient.model.dto.ClientDTO;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.OferTDTO;
import com.telefonica.queryclient.model.dto.Request.Request;
import com.telefonica.queryclient.model.dto.Response.Response;
import com.telefonica.queryclient.model.entity.Mobile;
import com.telefonica.queryclient.repository.ClientRepository;
import com.telefonica.queryclient.repository.MobileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    private final MobileRepository mobileRepository;


    @Override
    public List<MobileDTO> consultarClient(Request request){

        List<MobileDTO> mobiles = mobileRepository.findByTypedocumentAndNumberDocument(request.getTypeDocument(), request.getNumberDocument()).
                stream().map(x -> Assembler.mapMobileToMobileDTO(x)).collect(Collectors.toList());
        return mobiles ;

//        Response resp = new Response();
//        List<MobileDTO> mobilesResp = new ArrayList<>();
//
//        ClientDTO clientResp = clientRepository.findByTypeDocumentAndNumberDocument(request.getTypeDocument(), request.getNumberDocument()).
//                stream().map(x -> Assembler.mapClientToClientDTO(x)).findFirst().orElse(null);
//
//        List<MobileDTO> mobiles = mobileRepository.findByTypedocumentAndNumberDocument(request.getTypeDocument(), request.getNumberDocument()).
//                stream().map(x -> Assembler.mapMobileToMobileDTO(x)).collect(Collectors.toList());
//
//        List<OferTDTO> ofertList = new ArrayList<>();
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
