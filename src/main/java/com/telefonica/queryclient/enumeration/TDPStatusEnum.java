package com.telefonica.queryclient.enumeration;

import com.telefonica.queryclient.model.dto.response.TDPStatus;
import lombok.Getter;

@Getter
public enum TDPStatusEnum {

    OK("0000", "Proceso exitoso.")
    , FAIL("9000", "Proceso con errores.");

    private TDPStatus status;

    TDPStatusEnum(String code, String message){
        status = new TDPStatus(code, message);}
}
