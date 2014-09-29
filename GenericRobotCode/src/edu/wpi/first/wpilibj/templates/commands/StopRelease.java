/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 * Stop unwinding the pullback cord.
 * @author blazerbots
 */
public class StopRelease extends CommandBase {
    
    public StopRelease() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println(this.getClass().getName());
        //Stop shooter
        shooter.stopShooter();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //Do once
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