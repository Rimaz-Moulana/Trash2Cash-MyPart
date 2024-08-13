package com.reward.demoreward.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String phoneNumber;
    private String imageLink;

    @OneToMany(mappedBy = "user")
    private List<LoyaltyPoints> loyaltyPoints;

    @OneToMany(mappedBy = "user")
    private List<PersonalOffer> personalOffers;

    @OneToMany(mappedBy = "user")
    private List<Address> addresses;
}
