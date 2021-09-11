package com.telefonica.queryclient.model.dto;

import com.telefonica.queryclient.model.entity.Ofert;
import com.telefonica.queryclient.util.ClientConstants;
import lombok.*;

import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfertDTO implements Serializable {

    public static long serialVersionUID = ClientConstants.SERIAL_VERSION;

    private Long id;
    private  String code;
    private String description;
    private Timestamp beginDate;
    private Timestamp endDate;

  public OfertDTO(Ofert ofert){
      this(ofert.getId(), ofert.getCode(),ofert.getDescription(),ofert.getBeginDate(),ofert.getEndDate());}

}
