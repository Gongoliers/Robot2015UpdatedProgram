package org.usfirst.frc5112.Robot2015UpdatedProgram.subsystems;

import org.usfirst.frc5112.Robot2015UpdatedProgram.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gripper extends Subsystem {

	public Solenoid gripperSolenoid = RobotMap.gripper;
	
    public void initDefaultCommand() {
    	
    	
    	
    }
    
    public void openGripper() {
    	
    	gripperSolenoid.set(false);
    	
    }
    
    public void closeGripper() {
    	
    	gripperSolenoid.set(true);
    	
    }
    
}

