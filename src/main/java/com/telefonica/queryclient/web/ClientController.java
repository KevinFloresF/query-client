package com.telefonica.queryclient.web;

import com.telefonica.queryclient.business.ClientService;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.Request.Request;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;
import java.util.List;

@RestController
@RequestMapping
public class ClientController {

    @Autowired
    private ClientService clientservice;

    @PostMapping
    public List<MobileDTO> getMobilesList(@RequestBody Request request) {

        return clientservice.consultarClient(request);
    }

}
