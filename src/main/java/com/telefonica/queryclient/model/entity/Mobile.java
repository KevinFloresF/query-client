package com.telefonica.queryclient.model.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Mobile")
public class Mobile {

    @Id
    @Column(name = "mobileId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="number")
   private  String number;
    @Column(name="state")
    private String status;
    @Column(name="type")
    private String type;

    @OneToOne(cascade = CascadeType.DETACH, orphanRemoval = false)
    @JoinColumn(name="planFK")
    private Plan plan;

    @OneToOne(cascade = CascadeType.DETACH, orphanRemoval = false)
    @JoinColumn(name="clientFk")
    private Client client;

    @ManyToMany(cascade = CascadeType.DETACH )
    @JoinTable(name = "Ofert_Mobile",
        joinColumns = @JoinColumn(name = "ofertFk"),
        inverseJoinColumns = @JoinColumn(name = "mobileFk"))
   private List<Ofert> oferts;


}


