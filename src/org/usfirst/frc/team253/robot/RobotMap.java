package org.usfirst.frc.team253.robot;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// Ports on the roboRio
	//public static final int driveMotorLeft = 2;
	//public static final int driveMotorLeft_Back = 3 ;
	///public static final int driveMotorRight = 0;
	//public static final int driveMotorRight_Back = 1;
	public static final int driveMotorLeft = 8;
	public static final int driveMotorLeft_Back = 6 ;
	public static final int driveMotorRight = 7;
	public static final int driveMotorRight_Back = 9;

	// Multiplier used to correct the direction of motors
	public static final int driveMotorLeftDir = -1;
	public static final int driveMotorRightDir = 1;

	// Multiplier used for slower speed control
	public static final double CREEP_SPEED = 0.5;
	public static final double CREEP_SPEED_ULTRA = .125;

	
	//Controlling the Elevator
	
	//public static final double sachitLifterMotor  = 4;
	public static Victor sachitLifterMotor;
    public static AnalogPotentiometer sachitLifterPotentiometer;
  
    
	
	
}


	
	//I don't know if this works. Look on Google/Chief Delphi/Robot Builder.
	//public RobotDrive drivetrain = new RobotDrive(FRONT_MOTOR_LEFT, BACK_MOTOR_LEFT, FRONT_MOTOR_RIGHT, BACK_MOTOR_RIGHT);
	
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
