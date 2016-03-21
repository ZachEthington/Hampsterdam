package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;
import org.usfirst.frc.team1829.robot.subsystems.Collector;

import edu.wpi.first.wpilibj.command.Command;

public class DefaultPickupCommand extends Command {
 	
	private Collector myCollector;
	
	public DefaultPickupCommand() {
		requires(myCollector = Robot.getCollector());
		
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//turns on collector, assume positive sucks in
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		myCollector.set(0);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		//myCollector.set(0.0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
