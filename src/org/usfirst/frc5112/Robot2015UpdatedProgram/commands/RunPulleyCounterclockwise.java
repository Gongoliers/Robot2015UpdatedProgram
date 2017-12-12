package org.usfirst.frc5112.Robot2015UpdatedProgram.commands;

import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;
import org.usfirst.frc5112.Robot2015UpdatedProgram.subsystems.Pulley;

import edu.wpi.first.wpilibj.command.Command;

public class RunPulleyCounterclockwise extends Command {

    public RunPulleyCounterclockwise() {
    	requires(new Pulley());
    }

    protected void initialize() {
    	Robot.pulley.stop();
    }

    protected void execute() {
    	Robot.pulley.runCounterclockwise(Robot.pulley.speedValue);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.pulley.stop();
    }

    protected void interrupted() {
    	Robot.pulley.stop();
    }
}
