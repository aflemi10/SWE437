// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// JUnit for Thermostat.java
//
// NOT COMPLETE (SEPT 2014)

import org.junit.*;
import static org.junit.Assert.*;

public class ThermostatTest
{
   private Thermostat thermo;
   private ProgrammedSettings settings;

   @Before // Set up - Called before every test method.
   public void setUp()
   {
      thermo   = new Thermostat();
      settings = new ProgrammedSettings();
      thermo.setThresholdDiff (1);
   }

   // if (((curTemp < dTemp - thresholdDiff) || (Override && curTemp < overTemp - thresholdDiff)) && (timeSinceLastRun > minLag))
   // Predicate: (a || (b && c)) && d

   @Test public void testTTTT()
   {
      settings.setSetting (Period.MORNING, DayType.WEEKDAY, 70);
      thermo.setPeriod (Period.MORNING);
      thermo.setDay (DayType.WEEKDAY);
      thermo.setCurrentTemp (68); //clause a
      thermo.setTimeSinceLastRun (10); //clause d
      thermo.setMinLag (5); //clause d
      thermo.setOverride (true); //clause b
      thermo.setOverTemp (72); //clause c
      assertTrue (thermo.turnHeaterOn (settings));
   }

   @Test public void testFFFF()
   {
      settings.setSetting (Period.MORNING, DayType.WEEKDAY, 70);
      thermo.setPeriod (Period.MORNING);
      thermo.setDay (DayType.WEEKDAY);
      thermo.setCurrentTemp (70);
      thermo.setTimeSinceLastRun (7);
      thermo.setMinLag (7);
      thermo.setOverride (false);
      thermo.setOverTemp (70);
      assertFalse (thermo.turnHeaterOn (settings));
   }

   @Test public void testPCtrue()
   {
      // Partial test for method turnHeaterOn() in class Thermostat
      // Criterion: PC
      // Value: True
      // Predicate: lines 28-30
      // Expected Output: true

      // Instantiate needed objects
      thermo   = new Thermostat();
      settings = new ProgrammedSettings();
      // Setting internal variable dTemp
      settings.setSetting (Period.MORNING, DayType.WEEKDAY, 69);
      thermo.setPeriod (Period.MORNING);
      thermo.setDay (DayType.WEEKDAY);
      // Clause a: curTemp < dTemp - thresholdDiff : true
      thermo.setCurrentTemp (63);
      thermo.setThresholdDiff (5);
      // Clause b: Override : true
      thermo.setOverride (true);
      // Clause c: curTemp < overTemp - thresholdDiff : true
      thermo.setOverTemp (70);
      // Clause d: timeSinceLastRun.greaterThan (minLag) : true
      thermo.setMinLag (10);
      thermo.setTimeSinceLastRun (12);
      // Run the test
      assertTrue (thermo.turnHeaterOn (settings));
   }
   
   
   /* test for predicate if(override && regulator)
    * a: override
    * b: regulator
    */
    
   @Test public void testOverrideRegulator_Tt() {
	// Instantiate needed objects
	      thermo   = new Thermostat();
	      settings = new ProgrammedSettings();
	      // Setting internal variable dTemp
	      settings.setSetting (Period.MORNING, DayType.WEEKDAY, 69);
	      thermo.setPeriod (Period.MORNING);
	      thermo.setDay (DayType.WEEKDAY);
	
	      thermo.setCurrentTemp (63);
	      thermo.setThresholdDiff (5);

	
	      thermo.setOverTemp (70);
	   
	      thermo.setMinLag (10);
	      thermo.setTimeSinceLastRun (12);
	      
	      //a and b are both true
	      thermo.setOverride (true);
	      thermo.setRegulator(true);
	      
	      thermo.turnHeaterOn(settings);
	      
	      assertEquals(thermo.getRunTime(), (63-70)/2); //timeneeded = (currTemp - overTemp)/2
   }
   
   /* test for predicate if(override && regulator)
    * a: override
    * b: regulator
    */
   
   @Test public void testOverrideRegulator_Ft() {
	// Instantiate needed objects
	      thermo   = new Thermostat();
	      settings = new ProgrammedSettings();
	      // Setting internal variable dTemp
	      settings.setSetting (Period.MORNING, DayType.WEEKDAY, 69);
	      thermo.setPeriod (Period.MORNING);
	      thermo.setDay (DayType.WEEKDAY);
	      // Clause a: curTemp < dTemp - thresholdDiff : true
	      thermo.setCurrentTemp (63);
	      thermo.setThresholdDiff (5);
	      // Clause c: curTemp < overTemp - thresholdDiff : true
	      thermo.setOverTemp (70);
	      // Clause d: timeSinceLastRun.greaterThan (minLag) : true
	      thermo.setMinLag (10);
	      thermo.setTimeSinceLastRun (12);
	      
	      thermo.setOverride(false); //a is false
	      thermo.setRegulator(true);
	      
	      thermo.turnHeaterOn(settings);
	      
	      assertEquals(thermo.getRunTime(), (63-69)); //timeneeded = currTemp - Dtemp
   }
   
   /* test for predicate if(override && regulator)
    * a: override
    * b: regulator
    */
   
   @Test public void testOverrideRegulator_tF() {
		// Instantiate needed objects
		      thermo   = new Thermostat();
		      settings = new ProgrammedSettings();
		      // Setting internal variable dTemp
		      settings.setSetting (Period.MORNING, DayType.WEEKDAY, 69);
		      thermo.setPeriod (Period.MORNING);
		      thermo.setDay (DayType.WEEKDAY);
		      // Clause a: curTemp < dTemp - thresholdDiff : true
		      thermo.setCurrentTemp (63);
		      thermo.setThresholdDiff (5);
		      // Clause c: curTemp < overTemp - thresholdDiff : true
		      thermo.setOverTemp (70);
		      // Clause d: timeSinceLastRun.greaterThan (minLag) : true
		      thermo.setMinLag (10);
		      thermo.setTimeSinceLastRun (12);
		      
		      thermo.setOverride(true); 
		      thermo.setRegulator(false); //b is false
		      
		      thermo.turnHeaterOn(settings);
		      
		      assertEquals(thermo.getRunTime(), (63-70)); //timeneeded = currTemp - overTemp
	   }
   
}