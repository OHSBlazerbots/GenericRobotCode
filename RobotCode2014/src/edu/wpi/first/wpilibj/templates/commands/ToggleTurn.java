/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author blazerbots
 */
public class ToggleTurn extends CommandBase{

    public ToggleTurn()
    {
        requires(chassis);
    }
    protected void initialize() {
        chassis.toggleOnlyTurn();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
