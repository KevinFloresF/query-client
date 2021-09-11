package com.telefonica.queryclient.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ClientStatus {

    private String code;
    private String message;
}
