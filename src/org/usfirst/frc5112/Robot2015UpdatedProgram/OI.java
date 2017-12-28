package org.usfirst.frc5112.Robot2015UpdatedProgram;

import org.usfirst.frc5112.Robot2015UpdatedProgram.autonomousCommands.*;
import org.usfirst.frc5112.Robot2015UpdatedProgram.drivetrainCommands.DrivetrainBackwards;
import org.usfirst.frc5112.Robot2015UpdatedProgram.drivetrainCommands.DrivetrainForwards;
import org.usfirst.frc5112.Robot2015UpdatedProgram.drivetrainCommands.StopDrivetrain;
import org.usfirst.frc5112.Robot2015UpdatedProgram.gripperCommands.CloseGripper;
import org.usfirst.frc5112.Robot2015UpdatedProgram.gripperCommands.OpenGripper;
import org.usfirst.frc5112.Robot2015UpdatedProgram.pulleyCommands.DecreasePulleySpeed;
import org.usfirst.frc5112.Robot2015UpdatedProgram.pulleyCommands.IncreasePulleySpeed;
import org.usfirst.frc5112.Robot2015UpdatedProgram.pulleyCommands.RunPulleyClockwise;
import org.usfirst.frc5112.Robot2015UpdatedProgram.pulleyCommands.RunPulleyCounterclockwise;
import org.usfirst.frc5112.Robot2015UpdatedProgram.pulleyCommands.StopPulley;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

public class OI {

	//JoystickButtons and Joystick
	public JoystickButton joystickButtonOne;
    public JoystickButton joystickButtonTwo;
    public JoystickButton joystickButtonThree;
    public JoystickButton joystickButtonFour;
	public JoystickButton joystickButtonFive;
	public JoystickButton joystickButtonSix;
	public JoystickButton joystickButtonSeven;
	public JoystickButton joystickButtonEight;
    public JoystickButton joystickButtonEleven;
    public JoystickButton joystickButtonTwelve;
    
	public static Joystick joystick;

    public OI() {
    	//Joystick
        joystick = new Joystick(0);
        
        //Pulley Movement Buttons
        joystickButtonSeven = new JoystickButton(joystick, 7);
        joystickButtonSeven.whileHeld(new RunPulleyClockwise());
        joystickButtonEight = new JoystickButton(joystick, 8);
        joystickButtonEight.whileHeld(new RunPulleyCounterclockwise());
        
        //Speed Changers
        joystickButtonSix = new JoystickButton(joystick, 6);
        joystickButtonSix.whenPressed(new DecreasePulleySpeed());
        joystickButtonFive = new JoystickButton(joystick, 5);
        joystickButtonFive.whenPressed(new IncreasePulleySpeed());
     
        //Drivetrain Movement Buttons
        joystickButtonFour = new JoystickButton(joystick, 1);
        joystickButtonFour.whileHeld(new DrivetrainBackwards());
        joystickButtonThree = new JoystickButton(joystick, 1);
        joystickButtonThree.whileHeld(new DrivetrainForwards());
        joystickButtonTwo = new JoystickButton(joystick, 1);
        joystickButtonTwo.whileHeld(new StopDrivetrain());
       
        // Pulley Stop Button
        joystickButtonOne = new JoystickButton(joystick, 1);
        joystickButtonOne.whileHeld(new StopPulley());
        
        // Gripper
        joystickButtonEleven = new JoystickButton(joystick, 11);
        joystickButtonEleven.whenPressed(new OpenGripper());
        joystickButtonTwelve = new JoystickButton(joystick, 12);
        joystickButtonTwelve.whenPressed(new CloseGripper());

        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("StopDrivetrain", new StopDrivetrain());
        SmartDashboard.putData("DrivetrainForwards", new DrivetrainForwards());
        SmartDashboard.putData("DrivetrainBackwards", new DrivetrainBackwards());
        SmartDashboard.putData("StopPulley", new StopPulley());
        SmartDashboard.putData("DecreasePulleySpeed", new DecreasePulleySpeed());
        SmartDashboard.putData("IncreasePulleySpeed", new IncreasePulleySpeed());
        SmartDashboard.putData("RunPulleyClockwise", new RunPulleyClockwise());
        SmartDashboard.putData("RunPulleyCounterClockwise", new RunPulleyCounterclockwise());
        
        
        SmartDashboard.putNumber("Pulley Current Speed Value is: ", Robot.pulley.speedValue);
    }

    public Joystick getjoystick() {
        return joystick;
    }
}

