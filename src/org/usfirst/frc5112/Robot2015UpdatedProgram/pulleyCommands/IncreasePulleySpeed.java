package org.usfirst.frc5112.Robot2015UpdatedProgram.pulleyCommands;

import org.usfirst.frc5112.Robot2015UpdatedProgram.Robot;
import org.usfirst.frc5112.Robot2015UpdatedProgram.subsystems.Pulley;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class IncreasePulleySpeed extends Command {

    public IncreasePulleySpeed() {
    	requires(new Pulley());
    }

    protected void initialize() {    	
    }

    protected void execute() {
    	Robot.pulley.increasePulleySpeedVariable(Robot.pulley.interval);
        SmartDashboard.putNumber("Pulley Current Speed Value is: ", Robot.pulley.speedValue);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
