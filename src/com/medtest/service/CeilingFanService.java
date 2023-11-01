package com.medtest.service;

public class CeilingFanService {
    private int currentSpeed;
    private boolean isReversed;

    public CeilingFanService() {
        this.currentSpeed = 0;
        this.isReversed = false;
    }

    public void pullSpeedCord() {
        if (currentSpeed == 3) {
            currentSpeed = 0;
        } else {
            currentSpeed++;
        }
    }

    public void pullDirectionCord() {
        isReversed = !isReversed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }


    public String getDirection() {
        return isReversed ? "Reverse" : "Forward";
    }


}
