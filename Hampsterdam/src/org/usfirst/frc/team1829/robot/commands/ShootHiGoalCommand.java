package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;
import org.usfirst.frc.team1829.robot.subsystems.Collector;
import org.usfirst.frc.team1829.robot.subsystems.HiShooter;

import edu.wpi.first.wpilibj.command.Command;

public class ShootHiGoalCommand extends Command {

	public ShootHiGoalCommand() {
		requires(Robot.getHiShooter());
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		Robot.getHiShooter().set(-.65);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {

	}

	@Override
	protected void interrupted() {

	}
}
