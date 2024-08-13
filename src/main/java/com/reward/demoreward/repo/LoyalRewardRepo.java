package com.reward.demoreward.repo;

import com.reward.demoreward.entity.LoyaltyPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface LoyalRewardRepo extends JpaRepository<LoyaltyPoints, Long> {
    LoyaltyPoints findByUserId(Long userId);

}
