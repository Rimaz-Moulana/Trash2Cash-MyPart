package com.reward.demoreward.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class PersonalOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String discounts;

    @ManyToOne
    @JoinColumn(name= "user_id", nullable = false)
    private User user;


}
