package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OperateJoystick extends Command{

	//constructor for command instance
	public OperateJoystick() {
		requires (Robot.getcurrentDrive());
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		if( Robot.myJoystick.getRawButton(4)) {
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * 1.0, Robot.myJoystick.getX() * 1);
		}
		else {
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * .80, Robot.myJoystick.getX() * 0.80);
		}

		if(Robot.myJoystick.getRawButton(11)) {
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * 0.0, Robot.myJoystick.getX() * .1);
		}
		else {
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * .80, Robot.myJoystick.getX() * 0.80);
		}

		if(Robot.myJoystick.getRawButton(12)) {
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * 0.0, Robot.myJoystick.getX() * -.1);
		}
		else {
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * .80, Robot.myJoystick.getX() * 0.80);
		}
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
