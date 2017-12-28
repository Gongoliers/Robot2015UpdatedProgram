package org.usfirst.frc5112.Robot2015UpdatedProgram.gripperCommands;

import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OpenGripper extends Command {

    public OpenGripper() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	Robot.gripper.openGripper();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
