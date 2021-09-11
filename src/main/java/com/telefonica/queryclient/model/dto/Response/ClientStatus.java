package com.telefonica.queryclient.model.dto.Response;

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
