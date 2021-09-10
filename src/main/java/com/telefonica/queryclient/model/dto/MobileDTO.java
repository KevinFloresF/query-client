package com.telefonica.queryclient.model.dto;

import com.telefonica.queryclient.model.entity.Client;
import lombok.*;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileDTO {

    private Long id;
    private String number;
    private String status;
    private String type;
    private PlanDTO planDTO;
    private List<OfertDTO> ofertList;

}
