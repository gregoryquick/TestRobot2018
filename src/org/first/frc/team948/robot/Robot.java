package org.first.frc.team948.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {
	
	
	@Override
	public void robotInit() {
		System.out.println("\nRobot init\n");
		
	}
	
	public void periodicAll() {
		
	}
	
	@Override
	public void disabledInit() {
		
	}
	
	@Override
	public void disabledPeriodic() {
		periodicAll();
		Scheduler.getInstance().run();
	}
	
	@Override
	public void autonomousInit() {
		
	}
	
	@Override
	public void autonomousPeriodic() {
		
	}
	
	@Override
	public void teleopInit() {
		
	}
	
	@Override
	public void teleopPeriodic() {
	
	}
	
	@Override
	public void testPeriodic() {
		
	}
	

}
