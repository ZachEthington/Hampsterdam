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
		// TODO Auto-generated method stub
		//turns on collector, assume positive sucks in
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		myHiShooter.set(0);
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
