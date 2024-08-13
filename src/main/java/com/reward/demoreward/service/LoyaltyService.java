package com.reward.demoreward.service;

import com.reward.demoreward.dto.LoyaltyPointsDto;
import com.reward.demoreward.entity.LoyaltyPoints;
import com.reward.demoreward.repo.LoyalRewardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class LoyaltyService {

    @Autowired
    private LoyalRewardRepo loyalRewardRepo;

    public void updatePoints(Long userId, LoyaltyPointsDto pointsDto) {
            LoyaltyPoints points = loyalRewardRepo.findByUserId(userId);
            points.setTotalPoints(pointsDto.getTotalPoints());
            points.setHomePoints(pointsDto.getHomePoints());
            points.setDropOffPoints(pointsDto.getDropOffPoints());
            points.setMachinePoints(pointsDto.getMachinePoints());
            loyalRewardRepo.save(points);
   }

    public LoyaltyPointsDto getPointsByUserId(Long userId) {
        LoyaltyPoints points = loyalRewardRepo.findByUserId(userId);
         if (points != null) {
             LoyaltyPointsDto pointsDto = new LoyaltyPointsDto();
             pointsDto.setTotalPoints(points.getTotalPoints());
             pointsDto.setHomePoints(points.getHomePoints());
             pointsDto.setDropOffPoints(points.getDropOffPoints());
             pointsDto.setMachinePoints(points.getMachinePoints());
             return pointsDto;
         } else {
             return null;
         }

    }
}
