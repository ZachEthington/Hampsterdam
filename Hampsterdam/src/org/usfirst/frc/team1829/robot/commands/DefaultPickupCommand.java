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
		//turns on collector, assume positive sucks in
	}

	@Override
	protected void execute() {
		myCollector.set(0);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		//myCollector.set(0.0);
	}

	@Override
	protected void interrupted() {

	}
}
