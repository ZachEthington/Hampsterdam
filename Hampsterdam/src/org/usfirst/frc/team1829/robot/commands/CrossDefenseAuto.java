package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CrossDefenseAuto extends Command {

	private long myTime;

	public CrossDefenseAuto() {
		requires(Robot.getcurrentDrive());
	}

	@Override
	protected void initialize() {
		//sets current time to varibale myTime
		myTime = System.currentTimeMillis();
		//sets finish time to 3 seconds
		myTime += 4000;
	}

	@Override
	protected void execute() {
		Robot.getcurrentDrive().Arcade(0.75,  0.05);
	}

	@Override
	protected boolean isFinished() {
		return System.currentTimeMillis() >= myTime;
	}

	@Override
	protected void end() {
		//stops robot at end of execute method
		Robot.getcurrentDrive().Arcade(0.0,  0.0);
	}

	@Override
	protected void interrupted() {

	}
}
