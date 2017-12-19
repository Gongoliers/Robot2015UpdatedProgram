package org.usfirst.frc5112.Robot2015UpdatedProgram;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
    public static SpeedController drivetrainleftFrontMotorController;
    public static SpeedController drivetrainleftRearMotorController;
    public static SpeedController drivetrainrightRearMotorController;
    public static SpeedController drivetrainrightFrontMotorController;
    public static Solenoid gripper;
    public static RobotDrive robotDrive;
    public static SpeedController pulleypulleyMotorController;

    public static void init() {
        drivetrainleftFrontMotorController = new Victor(2);
        LiveWindow.addActuator("Drivetrain", "leftFrontMotorController", (Victor) drivetrainleftFrontMotorController);
        
        drivetrainleftRearMotorController = new Victor(1);
        LiveWindow.addActuator("Drivetrain", "leftRearMotorController", (Victor) drivetrainleftRearMotorController);
        
        drivetrainrightRearMotorController = new Victor(0);
        LiveWindow.addActuator("Drivetrain", "rightRearMotorController", (Victor) drivetrainrightRearMotorController);
        
        drivetrainrightFrontMotorController = new Victor(3);
        LiveWindow.addActuator("Drivetrain", "rightFrontMotorController", (Victor) drivetrainrightFrontMotorController);
        
        robotDrive = new RobotDrive(drivetrainleftFrontMotorController, drivetrainleftRearMotorController,
              drivetrainrightFrontMotorController, drivetrainrightRearMotorController);
        
        robotDrive.setSafetyEnabled(true);
        robotDrive.setExpiration(0.1);
        robotDrive.setSensitivity(0.5);
        robotDrive.setMaxOutput(1.0);

        robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        pulleypulleyMotorController = new Jaguar(4);
        LiveWindow.addActuator("Pulley", "pulleyMotorController", (Jaguar) pulleypulleyMotorController);
        
        gripper = new Solenoid(0);
    }
}
