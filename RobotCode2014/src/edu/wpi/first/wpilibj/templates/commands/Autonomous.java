package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitUntilCommand;

/**
 * This is the autonomous command.
 * Drive forward and shoot.
 * @author jmuller4
 */
public class Autonomous extends CommandGroup {

    public Autonomous() {
        //Is the target hot?
        boolean hot = CommandBase.network.getNetworkVariable("BLOB_COUNT") > 0;
        //Drive forward  1 second = 4 feet
        addSequential(new DriveForward(1.75, .75));
        //Go back to 0 degrees
        //addSequential(new ToggleAutoTurn());
        if(!hot)
        {
            addSequential(new WaitUntilCommand(6));
        }
        //addSequential(new Turn(90));
        
        //Shoot
        addSequential(new CycleShooter());
    }
}