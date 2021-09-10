package com.telefonica.queryclient.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Client")
public class Client {

    @Id
    @Column(name = "clientId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column (name="name")
    private String name;
    @Column(name="type_document")
    private String typeDocument;
    @Column(name="number_document")
    private String numberDocument;
    @Column(name="datebirth")
    private String datebirth;

    @ManyToMany(cascade = CascadeType.DETACH)
   @JoinColumn(name = "mobileId")
   private List<Mobile> mobiles;
}
