package org.usfirst.frc.team1829.robot.subsystems;

import org.usfirst.frc.team1829.robot.commands.DefaultPickupCommand;
import org.usfirst.frc.team1829.robot.commands.DefaultShooterCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HiShooter extends Subsystem {

	private CANTalon highMotor;
	private DigitalInput opticalSensor;
	
	public HiShooter(){
		highMotor = new CANTalon(3);
		//opticalSensor = new DigitalInput(0);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DefaultShooterCommand());
	}
	//set collector motor speed
	public void set(double speed){
	
	highMotor.set(speed);
	}
	//if sensor reads true we have the ball, otherwise it does not
	public boolean hasBall() {
		
		return opticalSensor.get();
	}
}
