/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2020 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;;

public class Robot extends TimedRobot {
  private Compressor com = new Compressor();
  private Solenoid s1 = new Solenoid(3);
  private DoubleSolenoid d1 = new DoubleSolenoid(1,0);
  private Joystick xBox = new Joystick(0);

  @Override
  public void robotInit() {
  }

  @Override
  public void robotPeriodic()
  {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    com.setClosedLoopControl(true);
  }

  @Override
  public void teleopPeriodic() {
    if(xBox.getRawButton(1)){
      d1.set(DoubleSolenoid.Value.kForward);
    }
    else if(xBox.getRawButton(2)){
      d1.set(DoubleSolenoid.Value.kReverse);
    }
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }
  
  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }
}
