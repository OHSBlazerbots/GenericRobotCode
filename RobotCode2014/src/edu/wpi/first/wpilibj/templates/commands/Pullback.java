/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.RobotValues;

/**
 * Open the latch and pull the shooter back.
 * @author blazerbots
 */
public class Pullback extends CommandBase {
    
    public Pullback() {
        //We need the shooter to be able to pullback
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println(this.getClass().getName() + " : " + System.currentTimeMillis());
        //Open up so that the bar can enter
        shooter.setServoAngle(RobotValues.SERVO_UNLATCH);
        //Run the shooter pullback
        shooter.runShooter(.5);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //The motor will run until the button is released
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
