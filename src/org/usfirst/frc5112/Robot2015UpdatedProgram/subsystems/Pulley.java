package org.usfirst.frc5112.Robot2015UpdatedProgram.subsystems;

import org.usfirst.frc5112.Robot2015UpdatedProgram.RobotMap;
import org.usfirst.frc5112.Robot2015UpdatedProgram.commands.StopPulley;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pulley extends Subsystem {
    private final SpeedController pulleyMotorController = RobotMap.pulleypulleyMotorController;

    public void initDefaultCommand() {
    	setDefaultCommand(new StopPulley());
    }
    
    public void stop() {
    	pulleyMotorController.stopMotor();
    }
}

