package com.telefonica.queryclient.model.dto;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanDTO {

    private String id;
    private String name;
    private Double price;

}