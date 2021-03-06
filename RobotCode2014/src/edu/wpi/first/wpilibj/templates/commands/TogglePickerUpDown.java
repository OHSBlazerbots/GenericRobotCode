/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 * Change the picker's position.
 * @author blazerbots
 */
public class TogglePickerUpDown extends CommandBase {
 
    public TogglePickerUpDown() {
        requires(picker);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //If picker is up, put it down, else pull it up
        if(picker.getExtendedState())
        {
            picker.pickerUp();
        }
        else{
            picker.pickerDown();
        }
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
