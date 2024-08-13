package com.reward.demoreward.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class LoyaltyPointsDto {
    private Long id; // or any appropriate type for your identifier

    private int totalPoints;
    private int homePoints;
    private int dropOffPoints;
    private int machinePoints;


}
