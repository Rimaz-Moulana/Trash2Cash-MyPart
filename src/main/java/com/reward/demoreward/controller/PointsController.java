package com.reward.demoreward.controller;

import com.reward.demoreward.dto.LoyaltyPointsDto;
import com.reward.demoreward.service.LoyaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/points")
public class PointsController {

    @Autowired
    private LoyaltyService pointsService;

    // PUT Mapping to update points by user ID
    @PutMapping("/{userId}")
    public ResponseEntity<Void> updatePoints(@PathVariable Long userId, @RequestBody LoyaltyPointsDto pointsDto) {
        pointsService.updatePoints(userId, pointsDto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    // GET Mapping to retrieve points by user ID
    @GetMapping("/{userId}")
    public ResponseEntity<LoyaltyPointsDto> getPointsByUserId(@PathVariable Long userId) {
        LoyaltyPointsDto pointsDto = pointsService.getPointsByUserId(userId);
        if (pointsDto != null) {
            return ResponseEntity.ok(pointsDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
