package org.usfirst.frc5112.Robot2015UpdatedProgram.subsystems;

import org.usfirst.frc5112.Robot2015UpdatedProgram.RobotMap;
import org.usfirst.frc5112.Robot2015UpdatedProgram.commands.OperatorControl;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

	private final RobotDrive robotDrive = RobotMap.robotDrive;

	public void initDefaultCommand() {
		setDefaultCommand(new OperatorControl());
	}

	public void stop() {
		robotDrive.stopMotor();
	}

	public void forwards(double speed) {
		robotDrive.drive(.5, 0);
	}

	public void backwards(double speed) {
		forwards(-speed);
	}

	public void operatorControl(Joystick joystick) {
		robotDrive.arcadeDrive(lessSensitive(joystick), joystick.getZ());
//		robotDrive.arcadeDrive(joystick.getY(), joystick.getZ());
	}
	
	public double lessSensitive(Joystick stick) {
		double returnValue;
		if ((stick.getY()) <= .1 && stick.getY() >= -0.1) {
			returnValue = 0.00;
		} else {
			if (stick.getY() > 0.1) {
				returnValue = (stick.getY() - 0.1) * (10/9);
			} else {
				returnValue = (stick.getY() + 0.1) * (10/9);
			}
		}
		return returnValue;
	}
}
