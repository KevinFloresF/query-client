package com.telefonica.queryclient.model.dto;

import lombok.*;

import java.util.List;

@Data
@Builder

public class ClientDTO {

    private Long idClient;
    private String name;
    private String typeDocument;
    private String numberDocument;
    private String datebirth;
    private List<MobileDTO> mobileList;
}
