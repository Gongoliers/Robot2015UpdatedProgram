package org.usfirst.frc5112.Robot2015UpdatedProgram;

import org.usfirst.frc5112.Robot2015UpdatedProgram.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

public class OI {

	public JoystickButton joystickButtonOne;
    public JoystickButton joystickButtonTwo;
    public JoystickButton joystickButtonThree;
    public JoystickButton joystickButtonFour;
    public static Joystick joystick;

    public OI() {
        joystick = new Joystick(0);
        
        joystickButtonFour = new JoystickButton(joystick, 1);
        joystickButtonFour.whileHeld(new DrivetrainBackwards());
        joystickButtonThree = new JoystickButton(joystick, 1);
        joystickButtonThree.whileHeld(new DrivetrainForwards());
        joystickButtonTwo = new JoystickButton(joystick, 1);
        joystickButtonTwo.whileHeld(new StopDrivetrain());
        joystickButtonOne = new JoystickButton(joystick, 1);
        joystickButtonOne.whileHeld(new StopPulley());

        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("stopDrivetrain", new StopDrivetrain());
        SmartDashboard.putData("drivetrainForwards", new DrivetrainForwards());
        SmartDashboard.putData("drivetrainBackwards", new DrivetrainBackwards());
        SmartDashboard.putData("stopPulley", new StopPulley());
    }

    public Joystick getjoystick() {
        return joystick;
    }

}

