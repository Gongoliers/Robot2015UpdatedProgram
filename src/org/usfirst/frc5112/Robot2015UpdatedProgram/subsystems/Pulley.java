package org.usfirst.frc5112.Robot2015UpdatedProgram.subsystems;

import org.usfirst.frc5112.Robot2015UpdatedProgram.RobotMap;
import org.usfirst.frc5112.Robot2015UpdatedProgram.commands.*;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Pulley extends Subsystem {

    private final SpeedController pulleyMotorController = RobotMap.pulleypulleyMotorController;
	public double speedValue = 0.00;
	public double interval = 0.025;

    public void initDefaultCommand() {
    	setDefaultCommand(new StopPulley());
    }
    
    public void stop() {
    	pulleyMotorController.stopMotor();
    }
    
    public void runClockwise(double speed) {
    	pulleyMotorController.set(speed);
    }
    
    public void runCounterclockwise(double speed) {
    	runClockwise(-speed);
    }
    
    public void increasePulleySpeedVariable(double amount) {
    	if (speedValue > 1.0) {
    		speedValue = 1.0;
		} else if(speedValue < 0) {
			speedValue = 0;
		} else {
	    	speedValue = speedValue + amount;			
		}
    }
    
    public void decreasePulleySpeedVariable(double amount) {
    	increasePulleySpeedVariable(-amount);
    }
}