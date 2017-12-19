package org.usfirst.frc5112.Robot2015UpdatedProgram.subsystems;

import org.usfirst.frc5112.Robot2015UpdatedProgram.RobotMap;
import org.usfirst.frc5112.Robot2015UpdatedProgram.drivetrainCommands.OperatorControl;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

	private final SpeedController leftFrontMotorController = RobotMap.drivetrainleftFrontMotorController;
	private final SpeedController leftRearMotorController = RobotMap.drivetrainleftRearMotorController;
	private final SpeedController rightRearMotorController = RobotMap.drivetrainrightRearMotorController;
	private final SpeedController rightFrontMotorController = RobotMap.drivetrainrightFrontMotorController;
	private final RobotDrive robotDrive = RobotMap.drivetrainRobotDrive41;

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
		if (joystick.getY() >= 0.1 || joystick.getY() <= -0.1) {
			if (joystick.getY() > 0) {
				robotDrive.arcadeDrive((joystick.getY() - 0.1) * (10/9), joystick.getZ());		
			} else {
				robotDrive.arcadeDrive((joystick.getY() + 0.1) * (10/9), joystick.getZ());						
			}
		} else {
			robotDrive.arcadeDrive(0, joystick.getZ());
		}
	
	}
	
	public void moveLeft(Joystick joystick) {
		leftFrontMotorController.set(joystick.getX());
		leftRearMotorController.set(joystick.getX() * -1);
		rightFrontMotorController.set(joystick.getX() * -1);
		rightRearMotorController.set(joystick.getX());
	}
	
	public void moveRight(Joystick joystick) {
		leftFrontMotorController.set(joystick.getX() * -1);
		leftRearMotorController.set(joystick.getX());
		rightFrontMotorController.set(joystick.getX());
		rightRearMotorController.set(joystick.getX() * -1);
	}
}
