package com.telefonica.queryclient.assembler;

import com.telefonica.queryclient.model.dto.ClientDTO;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.OfertDTO;
import com.telefonica.queryclient.model.dto.PlanDTO;
import com.telefonica.queryclient.model.entity.Client;
import com.telefonica.queryclient.model.entity.Mobile;
import com.telefonica.queryclient.model.entity.Ofert;
import com.telefonica.queryclient.model.entity.Plan;

import java.util.stream.Collectors;

public class Assembler {

    public static ClientDTO mapClientToClientDTO(Client client) {
        return ClientDTO.builder()
                .idClient(client.getIdClient())
                .name(client.getName())
                .typeDocument(client.getTypeDocument())
                .numberDocument(client.getNumberDocument())
                .datebirth(client.getDatebirth())
                .mobileList(client.getMobiles().stream().map(x -> Assembler.mapMobileToMobileDTO(x)).collect(Collectors.toList()))
                .build();
    }

    public static MobileDTO mapMobileToMobileDTO(Mobile mobile) {
        return MobileDTO.builder()
                .number(mobile.getNumber())
                .status(mobile.getStatus())
                .type(mobile.getType())
                .planDTO(Assembler.mapPlanToPlanDTO((mobile.getPlan())))
                .ofertList(mobile.getOferts().stream().map(x -> Assembler.mapOfertToOfertDTO(x)).collect(Collectors.toList()))
                .build();
    }

    public static OfertDTO mapOfertToOfertDTO(Ofert ofert) {
        return OfertDTO.builder()
                .code(ofert.getCode())
                .description(ofert.getDescription())
                .beginDate(ofert.getBeginDate())
                .endDate(ofert.getEndDate()).build();
    }
    public static PlanDTO mapPlanToPlanDTO(Plan plan ){
        return PlanDTO.builder()
                .name(plan.getName())
                .price(plan.getPrice())
                .build();
    }
}
