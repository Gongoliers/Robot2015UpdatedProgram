package org.usfirst.frc5112.Robot2015UpdatedProgram.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;

public class AutonomousCommand extends Command {

    public AutonomousCommand() {
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.stop();
    	Robot.pulley.stop();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
