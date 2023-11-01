package com.medtest.controller;

import com.medtest.service.CeilingFanService;

public class CeilingFanController {

    private CeilingFanService ceilingFanService;

    public CeilingFanController(CeilingFanService ceilingFanService){
        this.ceilingFanService = ceilingFanService;
    }

    public void pullSpeedCord(){
        ceilingFanService.pullSpeedCord();
    }

    public void pullDirectionCord(){
        ceilingFanService.pullDirectionCord();;
    }

    public void getStatus() {
        System.out.println("The fan is spinning in the " + ceilingFanService.getDirection() + " direction at a speed of " + ceilingFanService.getCurrentSpeed());
    }
}
