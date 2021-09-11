package com.telefonica.queryclient.enumeration;

import com.telefonica.queryclient.model.dto.Response.ClientStatus;
import lombok.Getter;

@Getter
public enum ClientStatusEnum {

    OK("0000", "Proceso exitoso.")
    , FAIL("9000", "Proceso con errores.");

    private ClientStatus status;

    ClientStatusEnum(String code, String message){
        status = new ClientStatus(code, message);}
}
