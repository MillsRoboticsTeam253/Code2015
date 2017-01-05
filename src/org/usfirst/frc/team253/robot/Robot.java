
package org.usfirst.frc.team253.robot;

import org.usfirst.frc.team253.robot.commands.Drivetrain;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team253.robot.commands.Drivetrain;
import org.usfirst.frc.team253.robot.commands.LiftOpen;
//import org.usfirst.frc.team253.robot.subsystems.SachitLift;
import org.usfirst.frc.team253.robot.subsystems.SachitLift;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Solenoid;

import java.util.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static SachitLift sachitLift;
	public static Drivetrain drivetraintank;
	public static OI oi;
	public static Victor victor;
	public static Compressor c;
	Joystick stick;

	Command autonomousCommand;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		sachitLift = new SachitLift();
		drivetraintank = new Drivetrain();
		oi = new OI();
	
		
	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		
	}

	public void autonomousInit() {
		// schedule the autonomous command (example)
		//if (autonomousCommand != null)
			//autonomousCommand.start();
		Robot.drivetraintank.setLeft(1.0);
    	Robot.drivetraintank.setLeft_Back(1.0);
    	Robot.drivetraintank.setRight(1.0);
    	Robot.drivetraintank.setRight_Back(1.0);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		//Scheduler.getInstance().run();
		Robot.drivetraintank.setLeft(1.0);
    	Robot.drivetraintank.setLeft_Back(1.0);
    	Robot.drivetraintank.setRight(1.0);
    	Robot.drivetraintank.setRight_Back(1.0);
    	Timer.delay(3);
		
		
	}

	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	 	
	}

	/**
	 * This function is called when the disabled button is hit. You can use it
	 * to reset subsystems before shutting down.
	 */
	public void disabledInit() {

	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() { 	Scheduler.getInstance().run();
    }
		
		
		//Robot.drivetraintank.setLeft(1.0);
	//Robot.drivetraintank.setLeft_Back(1.0);
	//Robot.drivetraintank.setRight(1.0);
	//Robot.drivetraintank.setRight_Back(1.0);
		
		//}
	
	
	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {
		LiveWindow.run();
	}

	public static void main(String[] args) {
		sachitLift = new SachitLift();
	}
}
