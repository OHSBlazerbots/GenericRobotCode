/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Cycle shooter with times modified for testing purposes.
 * @author blazerbots
 */
public class TestCycleShooter extends CommandBase {
    
    public TestCycleShooter() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //Put data
        double pullback = SmartDashboard.getNumber("PullbackConfig", 6.0);
        double unwind = SmartDashboard.getNumber("UnwindConfig", 6.0);
        double pullbackSpeed = SmartDashboard.getNumber("PullbackSpeed", .5);
        double unwindSpeed = SmartDashboard.getNumber("UnwindSpeed", .5);
        //Fire
        shooter.setServoAngle(110);
        //Wait
        Timer.delay(5);
        //Pullback
        shooter.runShooter(pullbackSpeed, pullback);
        //Latch
        shooter.setServoAngle(15);
        Timer.delay(5);
        //Unwind
        shooter.runShooter(-unwindSpeed, unwind);
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
