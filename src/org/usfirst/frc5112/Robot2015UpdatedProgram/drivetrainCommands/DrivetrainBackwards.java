package org.usfirst.frc5112.Robot2015UpdatedProgram.drivetrainCommands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;

public class DrivetrainBackwards extends Command {

    public DrivetrainBackwards() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.stop();
    }

    protected void execute() {
    	Robot.drivetrain.forwards(.25);
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
