package com.telefonica.queryclient.model.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Offer {

    @Id

    private Long cod;
    private String descript;
    private Date startDate;
    private Date endDate;

}
