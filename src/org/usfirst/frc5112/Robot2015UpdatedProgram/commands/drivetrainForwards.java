package org.usfirst.frc5112.Robot2015UpdatedProgram.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;

public class DrivetrainForwards extends Command {

    public DrivetrainForwards() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.stop();
    }

    protected void execute() {
    	Robot.drivetrain.backwards(.25);
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
