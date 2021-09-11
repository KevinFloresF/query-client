package com.telefonica.queryclient.web;

import com.telefonica.queryclient.business.ClientService;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.Request.ClientRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ClientController {


    private final ClientService clientservice;

    @GetMapping(value = "/buscar", produces = (MediaType.APPLICATION_JSON_VALUE))

    public ResponseEntity<?> getMobilesList(ClientRequest clientRequest) {

         return ResponseEntity.ok().body(clientservice.findClient(clientRequest));


    }

    @GetMapping(value = "/buscarFecha", produces = (MediaType.APPLICATION_JSON_VALUE))
    public ResponseEntity<?> getClientsByDate(ClientRequest clientRequest) {

        return ResponseEntity.ok().body(clientservice.findClientsByDate(clientRequest));

    }

}
