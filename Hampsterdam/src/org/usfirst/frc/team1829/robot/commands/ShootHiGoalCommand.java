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
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		Robot.getHiShooter().set(-.65);
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
