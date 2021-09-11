package com.telefonica.queryclient.model.dto;

import com.telefonica.queryclient.model.entity.Plan;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanDTO {

    private Long id;
    private String name;
    private Double price;

    public PlanDTO(Plan plan) {
        this(plan.getId(), plan.getName(), plan.getPrice());
    }
}