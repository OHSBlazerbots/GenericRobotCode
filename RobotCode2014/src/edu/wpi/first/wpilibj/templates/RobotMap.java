package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    //PWM
    public static final int FRONT_LEFT_MOTOR = 7;
    public static final int REAR_LEFT_MOTOR = 3;
    public static final int FRONT_RIGHT_MOTOR = 8;
    public static final int REAR_RIGHT_MOTOR = 4;
    public static final int SHOOTER_PICKUP = 5;
    public static final int SERVO_PORT = 6;
    

    // Analog
    public static final int GYRO_PORT = 1;
    public static final int SONAR_PORT = 2;

    // Joysticks
    public static final int JOYSTICK_PORT = 2;
    public static final int JOYSTICK2_PORT = 1;

    // O/I
    public static final int COMPRESSOR_SENSOR = 9;

    //Relays
    public static final int COMPRESSOR = 2;
    public static final int PICKER_SPIKE = 1;
    public static final int SHOOTER_SPIKE = 8;

    //Pneumatics
    public static final int SOLENOID_FORWARD = 1;
    public static final int SOLENOID_BACK = 2;
    public static final int SOLENOID2_FORWARD = 3;
    public static final int SOLENOID2_BACK = 4;

}
