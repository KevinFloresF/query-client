package com.telefonica.queryclient.model.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class OferTDTO {

    private Long id;
    private  String code;
    private String description;
    private String beginDate;
    private String endDate;
    private String mobilefk;
}
