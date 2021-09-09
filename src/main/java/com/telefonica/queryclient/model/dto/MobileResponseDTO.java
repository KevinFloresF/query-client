package com.telefonica.queryclient.model.dto;

import com.telefonica.queryclient.model.entity.Client;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileResponseDTO {

    private Long id;
    private  Integer number;
    private boolean status;
    private String type;
    private String planName;
    private List<Client> clients;

}
