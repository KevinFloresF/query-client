package com.telefonica.queryclient.model.dto.Response;

import com.telefonica.queryclient.model.dto.ClientDTO;

import com.telefonica.queryclient.util.ClientConstants;
import lombok.*;


import java.io.Serializable;

@Data
@Builder
public class FindByTypeDocumentAndNumDocResponse implements Serializable {

    public static long serialVersionUID = ClientConstants.SERIAL_VERSION;
    private ClientDTO clients;


}
