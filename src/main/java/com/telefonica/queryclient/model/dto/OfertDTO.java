package com.telefonica.queryclient.model.dto;

import com.telefonica.queryclient.model.entity.Ofert;
import com.telefonica.queryclient.util.ClientConstants;
import lombok.*;

import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

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
    private Date beginDate;
    private Date endDate;

  public OfertDTO(Ofert ofert){
      this(ofert.getId(), ofert.getCode(),ofert.getDescription(),ofert.getBeginDate(),ofert.getEndDate());}

}
