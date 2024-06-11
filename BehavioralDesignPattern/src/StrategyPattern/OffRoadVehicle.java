package StrategyPattern;

import StrategyPattern.Strategy.SportyDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportyDriveStrategy());
    }
}
