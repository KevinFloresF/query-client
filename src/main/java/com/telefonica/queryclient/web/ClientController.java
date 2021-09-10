package com.telefonica.queryclient.web;

import com.telefonica.queryclient.business.ClientService;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.Request.FindMobileRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ClientController {


    private final ClientService clientservice;

    @GetMapping(value = "/buscar", produces = (MediaType.APPLICATION_JSON_VALUE))
    public List<MobileDTO> getMobilesList(FindMobileRequest findMobileRequest) {

        return clientservice.findClient(findMobileRequest);

    }

}
