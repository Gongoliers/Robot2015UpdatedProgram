package org.usfirst.frc5112.Robot2015UpdatedProgram.drivetrainCommands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;

public class StopDrivetrain extends Command {

    public StopDrivetrain() {
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
