package com.telefonica.queryclient.model.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Ofert")
public class Ofert {

    @Id
    @Column(name = "ofertId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="code")
    private  String code;
    @Column(name="description")
    private String description;
    @Column(name="begin_date")
    private String beginDate;
    @Column(name="end_date")
    private Long endDate;

}
