package com.dfesh.co.hotelreservations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@Entity
@Table(name = "room")
public class Room implements Serializable {

    @Serial
    private static final long serialVersionUID = 8686094137432692018L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tipo")
    private String type;

    @Column(name = "price")
    private BigDecimal price;

}
