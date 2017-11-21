package org.usfirst.frc5112.Robot2015UpdatedProgram.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;

public class stopDrivetrain extends Command {

    public stopDrivetrain() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.stop();
    }

    protected void execute() {
    	Robot.drivetrain.stop();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    	Robot.drivetrain.stop();
    }

    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
