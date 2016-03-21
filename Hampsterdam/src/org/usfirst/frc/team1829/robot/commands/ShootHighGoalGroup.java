package org.usfirst.frc.team1829.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class ShootHighGoalGroup extends CommandGroup {
    
    public  ShootHighGoalGroup() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	//addSequential(new PickupBallCommand());
    	addParallel(new ShootLowGoalCommand());/* Starts turning the Collector CANTalon away from the High Shooter wheels so that it can spin up to speed*/
    	addSequential(new WaitCommand(0.025)); // tells the Command Group to wait for .025 seconds before it begins anything else 
    	addParallel(new DefaultPickupCommand());// sets the default LowShooter to 0
    	addParallel(new ShootHiGoalCommand());// Initiates the motor for shooting high
    	addSequential(new WaitCommand(3));// allows high goal motor to spin up to speed for 3 seconds
    	addParallel(new PickupBallCommand());//Begins pushing the ball towards to high shooter wheels
    	addSequential(new WaitCommand(3));// tells the Command Group to wait for 3 seconds before it begins anything else
    	addParallel(new DefaultPickupCommand());// sets the default PickupCommand to 0
    	addParallel(new DefaultShooterCommand());// sets the default ShooterCommand to 0
    }
}
