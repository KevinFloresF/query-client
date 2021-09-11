package com.telefonica.queryclient.model.dto;

import com.telefonica.queryclient.model.entity.Client;
import com.telefonica.queryclient.util.ClientConstants;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
@Builder

public class ClientDTO implements Serializable {

    public static long serialVersionUID = ClientConstants.SERIAL_VERSION;

    public ClientDTO(Client client)
    {
        this(client.getIdClient(), client.getName(), client.getTypeDocument(), client.getNumberDocument(), client.getDatebirth(), client.getMobiles().stream().map(MobileDTO::new).collect(Collectors.toList()));  }

    private Long idClient;
    private String name;
    private String typeDocument;
    private String numberDocument;
    private String datebirth;
    private List<MobileDTO> mobileList;
}
