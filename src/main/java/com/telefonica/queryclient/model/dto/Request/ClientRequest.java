package com.telefonica.queryclient.model.dto.Request;

import com.telefonica.queryclient.util.ClientConstants;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class ClientRequest implements Serializable {

    public static long serialVersionUID = ClientConstants.SERIAL_VERSION;

    private String typeDocument;
    private String numberDocument;

    private Date beginDate;
    private Date endDate;


}
