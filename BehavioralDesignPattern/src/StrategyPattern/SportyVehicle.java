package StrategyPattern;

import StrategyPattern.Strategy.SportyDriveStrategy;

public class SportyVehicle extends Vehicle{
    SportyVehicle() {
        super(new SportyDriveStrategy());
    }
}
