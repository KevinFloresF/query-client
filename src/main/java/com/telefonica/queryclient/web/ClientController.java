package com.telefonica.queryclient.web;

import com.telefonica.queryclient.business.ClientService;
import com.telefonica.queryclient.enumeration.TDPStatusEnum;
import com.telefonica.queryclient.model.dto.ClientDTO;
import com.telefonica.queryclient.model.dto.MobileDTO;
import com.telefonica.queryclient.model.dto.request.ClientRequest;
import com.telefonica.queryclient.model.dto.response.TDPResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientservice;

    @GetMapping(value = "/buscar", produces = (MediaType.APPLICATION_JSON_VALUE))

    public ResponseEntity<?> getMobilesList(ClientRequest clientRequest) {

        List<MobileDTO> clients = clientservice.findClient(clientRequest);
        TDPResponse<List<MobileDTO>> response = new TDPResponse<List<MobileDTO>>(TDPStatusEnum.OK.getStatus(), clients);
        return ResponseEntity.ok().body(response);


    }
    @GetMapping(value = "/buscarFecha", produces = (MediaType.APPLICATION_JSON_VALUE))
    public ResponseEntity<?> getClientsByDate(ClientRequest clientRequest) {

        List<ClientDTO> clients = clientservice.findClientsByDate(clientRequest);
        TDPResponse<List<ClientDTO>> response = new TDPResponse<List<ClientDTO>>(TDPStatusEnum.OK.getStatus(), clients);
        return ResponseEntity.ok().body(response);

    }

}
