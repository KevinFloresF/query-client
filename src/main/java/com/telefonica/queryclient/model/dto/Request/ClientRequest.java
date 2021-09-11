package com.telefonica.queryclient.model.dto.Request;

import com.telefonica.queryclient.util.ClientConstants;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class ClientRequest implements Serializable {

    public static long serialVersionUID = ClientConstants.SERIAL_VERSION;

    private String typeDocument;
    private String numberDocument;

    private Timestamp beginDate;
    private Timestamp endDate;


}
