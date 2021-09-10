package com.telefonica.queryclient.model.dto;

import lombok.*;

import javax.persistence.Column;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfertDTO {

    private Long id;
    private  String code;
    private String description;
    private Timestamp beginDate;
    private Timestamp endDate;

}
