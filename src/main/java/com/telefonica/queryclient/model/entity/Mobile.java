package com.telefonica.queryclient.model.entity;


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
    @Column(name="planFK")
    private Long planName;

    @ManyToMany(cascade = CascadeType.DETACH )
    @JoinColumn(name = "ofertId")
   private List<Ofert> oferts;


}


