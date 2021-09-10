package com.telefonica.queryclient.business;

import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.Request.Request;
import com.telefonica.queryclient.model.dto.Response.Response;

import java.util.List;

public interface ClientService {

    public List<MobileDTO> consultarClient(Request request);


}
