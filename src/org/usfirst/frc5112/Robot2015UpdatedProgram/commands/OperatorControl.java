package org.usfirst.frc5112.Robot2015UpdatedProgram.commands;

import org.usfirst.frc5112.Robot2015UpdatedProgram.OI;
import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OperatorControl extends Command {

    public OperatorControl() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.operatorControl(OI.joystick);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drivetrain.stop();
    }

    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
