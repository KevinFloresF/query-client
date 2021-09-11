package com.telefonica.queryclient.model.entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

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
    private Date beginDate;
    @Column(name="end_date")
    private Date endDate;


}
