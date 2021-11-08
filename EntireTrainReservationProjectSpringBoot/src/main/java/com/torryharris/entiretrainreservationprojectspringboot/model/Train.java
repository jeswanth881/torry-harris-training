package com.torryharris.entiretrainreservationprojectspringboot.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Train {
    @Id
    private int trainId;
    private String trainName;
    private String sourcePoint;
    private String destinationPoint;
    private double ticketPrize;
}
