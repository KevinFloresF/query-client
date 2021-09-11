package com.telefonica.queryclient.model.dto.response;

import com.telefonica.queryclient.util.ClientConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class ClientResponse <C> implements Serializable {

    public static long serialVersionUID = ClientConstants.SERIAL_VERSION;

    private ClientStatus status;
    private C data;

    public ClientResponse(ClientStatus status){
        this.status = status;}
}
