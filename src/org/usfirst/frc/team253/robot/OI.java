package org.usfirst.frc.team253.robot;


import org.usfirst.frc.team253.robot.subsystems.TankDriveCreep;
import org.usfirst.frc.team253.robot.commands.LiftDown;
import org.usfirst.frc.team253.robot.commands.LiftOpen;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {

	private Joystick joyLeft = new Joystick(0);
	private Joystick joyRight = new Joystick(0);

	public Joystick getJoyLeft() {
		return joyLeft;
	}

	public Joystick getJoyRight() {
		return joyRight;
	}

	public OI() {
		JoystickButton triggerRight = new JoystickButton(joyRight, 1);
		JoystickButton triggerLeft = new JoystickButton(joyLeft, 1);
		JoystickButton left2 = new JoystickButton(joyLeft, 2);
		JoystickButton right2 = new JoystickButton(joyRight, 2);
		JoystickButton PumpAir = new JoystickButton(joyRight, 3);

		triggerLeft.whileHeld(new LiftDown());
		
		triggerRight.whileHeld(new LiftOpen());
		left2.whileHeld(new TankDriveCreep(RobotMap.CREEP_SPEED_ULTRA));
		right2.whileHeld(new TankDriveCreep(RobotMap.CREEP_SPEED_ULTRA));
		
		
		
		
    
        
      // triggerLeft = new JoystickButton(joyLeft, 1);
       //triggerLeft.whileHeld(new LiftDown());
       
        
       //triggerRight = new JoystickButton(joyRight, 1);
       //triggerRight.whileHeld(new LiftOpen());

	    
        // SmartDashboard Buttons
       

        //SmartDashboard.putData("LiftDown", new LiftDown());

        //SmartDashboard.putData("LiftOpen", new LiftOpen());
		
	}
}

	
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


