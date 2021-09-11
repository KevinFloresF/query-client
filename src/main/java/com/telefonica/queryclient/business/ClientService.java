package com.telefonica.queryclient.business;

import com.telefonica.queryclient.model.dto.ClientDTO;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.Request.ClientRequest;


import java.util.List;


public interface ClientService {

    public List<MobileDTO> findClient(ClientRequest clientRequest);

    public List<ClientDTO> findClientsByDate(ClientRequest clientRequest);

}
