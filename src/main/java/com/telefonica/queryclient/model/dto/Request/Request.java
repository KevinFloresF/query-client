package com.telefonica.queryclient.model.dto.Request;

import com.telefonica.queryclient.model.entity.Mobile;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Request {

    private String typeDocument;
    private String numberDocument;



}
