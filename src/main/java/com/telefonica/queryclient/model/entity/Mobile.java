package com.telefonica.queryclient.model.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  Integer number;
    private boolean status;
    private String type;
    private String planName;

    @ManyToOne(cascade = CascadeType.DETACH, optional = false )
    @JoinColumn(name = "offer_id")
    private List<Offer> offers;


}


