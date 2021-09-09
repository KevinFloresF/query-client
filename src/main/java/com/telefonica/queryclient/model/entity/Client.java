package com.telefonica.queryclient.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column (name="name")
    private String name;
    @Column(name="asd")
    private String documentType;
    @Column(name="asd")
    private Long DocumentNum;
    @Column(name="asd")
    private Date Birthdate;
    @OneToMany(cascade = CascadeType.DETACH, orphanRemoval = false)
    @JoinColumn(name = "mobile_id")
    private List<Mobile> mobiles;
}
