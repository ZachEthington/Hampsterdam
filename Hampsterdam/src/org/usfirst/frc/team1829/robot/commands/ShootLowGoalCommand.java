package org.usfirst.frc.team1829.robot.commands;
import org.usfirst.frc.team1829.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootLowGoalCommand extends Command {

    public ShootLowGoalCommand() {
        // Use requires() here to declare subsystem dependencies
      requires(Robot.getCollector());  // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//Robot.getCollector().set(-1.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.getCollector().set(-1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end(){
    	Robot.getCollector().set(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
