package com.telefonica.queryclient.model.dto;

import com.telefonica.queryclient.model.entity.Client;
import com.telefonica.queryclient.model.entity.Mobile;
import com.telefonica.queryclient.util.ClientConstants;
import lombok.*;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileDTO implements Serializable {

    public static long serialVersionUID = ClientConstants.SERIAL_VERSION;

    private Long id;
    private String number;
    private boolean status;
    private String type;
    private PlanDTO planDTO;
    private List<OfertDTO> ofertList;

    public MobileDTO(Mobile mobile) {
        this(mobile.getId(), mobile.getNumber(), mobile.isStatus(), mobile.getType(), new PlanDTO(mobile.getPlan()), mobile.getOferts().stream().map(OfertDTO::new).collect(Collectors.toList()));
    }

}
