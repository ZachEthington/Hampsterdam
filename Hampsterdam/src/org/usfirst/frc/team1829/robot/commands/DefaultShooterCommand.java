package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;
import org.usfirst.frc.team1829.robot.subsystems.Collector;
import org.usfirst.frc.team1829.robot.subsystems.HiShooter;

import edu.wpi.first.wpilibj.command.Command;

public class DefaultShooterCommand extends Command {

	private HiShooter myHiShooter;

	public DefaultShooterCommand() {
		requires(myHiShooter = Robot.getHiShooter());
	}

	@Override
	protected void initialize() {
		//turns on collector, assume positive sucks in
	}

	@Override
	protected void execute() {
		myHiShooter.set(0);
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
