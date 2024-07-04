package com.docker.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 7/3/2024
 * Created time : 11:13 PM
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Welcome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String firstName;
}


