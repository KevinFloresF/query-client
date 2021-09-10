package com.telefonica.queryclient.assembler;

import com.telefonica.queryclient.model.dto.ClientDTO;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.entity.Client;
import com.telefonica.queryclient.model.entity.Mobile;

public class Assembler {

    public static ClientDTO mapClientToClientDTO(Client client) {
        return ClientDTO.builder()
                .idClient(client.getIdClient())
                .name(client.getName())
                .typeDocument(client.getTypeDocument())
                .numberDocument(client.getNumberDocument())
                .datebirth(client.getDatebirth()).build();
    }

    public static MobileDTO mapMobileToMobileDTO(Mobile mobile) {
        return MobileDTO.builder()
                .number(mobile.getNumber())
                .status(mobile.getStatus())
                .type(mobile.getType())
                .planName(mobile.getPlanName()).build();
    }
}
