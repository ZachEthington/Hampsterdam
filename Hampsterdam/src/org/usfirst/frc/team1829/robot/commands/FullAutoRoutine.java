package org.usfirst.frc.team1829.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class FullAutoRoutine extends CommandGroup {

	public	FullAutoRoutine() {
		// Add Commands here:
		// e.g. addSequential(new Command1());
		//		addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		//		addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.

		addParallel(new BasicAutonomousDriveCommand());
		addSequential(new WaitCommand(6500));
		addParallel(new CrossDefenseAuto());
		//addParallel(new AutonomusTurn());
		//addParallel(new ShootLowGoalCommand());
	}
}
