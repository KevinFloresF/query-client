package com.telefonica.queryclient.model.entity;


import lombok.*;


import javax.persistence.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Plan")
public class Plan {


    @Id
    @Column(name = "planId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private  String name;
    @Column(name="price")
    private Double price;




}
