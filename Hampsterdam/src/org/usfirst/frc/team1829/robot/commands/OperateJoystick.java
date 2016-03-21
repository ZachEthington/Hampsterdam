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
		// TODO Auto-generated method stub runs when instantiated
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub runs like while loop until killed
		if( Robot.myJoystick.getRawButton(4))
		Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * 1.0, Robot.myJoystick.getX() * 1);
		
		else
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * .80, Robot.myJoystick.getX() * 0.80);
		
		
		if(Robot.myJoystick.getRawButton(11))
		Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * 0.0, Robot.myJoystick.getX() * .1);
		
		else
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * .80, Robot.myJoystick.getX() * 0.80);
		
		if(Robot.myJoystick.getRawButton(12))
		Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * 0.0, Robot.myJoystick.getX() * -.1);
		
		else
			Robot.getcurrentDrive().Arcade(Robot.myJoystick.getY() * .80, Robot.myJoystick.getX() * 0.80);
			
			
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub runs to inform status of current command running and returns status
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub updates when isFinished function returns true
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub runs when command is killed instead of returning true from isFinished
		
	}

}
