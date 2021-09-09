package com.telefonica.queryclient.model.dto;

import com.telefonica.queryclient.model.entity.Mobile;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class ClientRequestDTO {

    private String name;
    private String documentType;
    private Long DocumentNum;
    private Date Birthdate;
    private List<Mobile> mobiles;


}
