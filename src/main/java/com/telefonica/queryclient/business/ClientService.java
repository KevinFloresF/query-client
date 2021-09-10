package com.telefonica.queryclient.business;

import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.Request.FindMobileRequest;


import java.util.List;


public interface ClientService {

    public List<MobileDTO> findClient(FindMobileRequest findMobileRequest);


}
