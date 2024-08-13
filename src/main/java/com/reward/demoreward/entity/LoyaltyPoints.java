package com.reward.demoreward.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class LoyaltyPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalPoints;
    private int homePoints;
    private int dropOffPoints;
    private int machinePoints;

    @ManyToOne
    @JoinColumn(name= "user_id", nullable = false)
    private User user;
}
