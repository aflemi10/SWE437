/* SWE437 Junit Test
 * 
 * Jordan Brown
 * Allen Fleming
 * Joseph Seiler
 * 
 *  The input domain and the Observability and Controllability assessments are in the Part1.docx
 *  file on GitHub.
 */


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestConversionTest {

	@Test
	public void roundingTest() {
		
		assertEquals(12.2568,conversion.myRound((float)12.256789, 4),0.00001);
	}

	@Test
	public void testFahrenAndCelcius() {
		float num1, num2;
		num1 = (float)45.32;	
		num2 = conversion.convertF2C("45.32",4);
		
		assertEquals(num1, conversion.convertC2F(String.valueOf(num2),4),0.00001);
	}
	
	@Test
	public void testCentiAndInches() {
		float num1, num2;
		num1 = (float)200;	
		num2 = conversion.convertCm2In("200",4);
		
		assertEquals(num1, conversion.convertIn2Cm(String.valueOf(num2),4),0.00001);
	}
	
	@Test
	/* FAILED */
	public void testFeetAndMeters() {
		float num1, num2;
		num1 = (float)3;	
		num2 = conversion.convertF2M("3",4);
		
		assertEquals(num1, conversion.convertM2F(String.valueOf(num2),4),0.00001);
	}
	
	@Test
	public void testMilesAndKilometers() {
		float num1, num2;
		num1 = (float)20;	
		num2 = conversion.convertM2K("20",4);
		
		assertEquals(num1, conversion.convertK2M(String.valueOf(num2),4),0.00001);
	}
	
	@Test
	public void testGallonsAndLiters() {
		float num1, num2;
		num1 = (float)300;	
		num2 = conversion.convertG2L("300",4);
		
		assertEquals(num1, conversion.convertL2G(String.valueOf(num2),4),0.00001);
	}
	
	@Test
	/* FAILED */
	public void testGramsAndOz() {
		float num1, num2;
		num1 = (float)52.854;	
		num2 = conversion.convertG2L("52.854",4);
		
		assertEquals(num1, conversion.convertL2G(String.valueOf(num2),4),0.00001);
	}
	
	@Test
	public void testPoundsToKilograms() {
		float num1, num2;
		num1 = (float)5.23;	
		num2 = conversion.convertLb2K("5.23",4);
		
		assertEquals(num1, conversion.convertK2Lb(String.valueOf(num2),4),0.00001);
	}
	
	@Test
	public void testMphAndKph() {
		float num1, num2;
		num1 = (float)95;	
		num2 = conversion.convertMPH2KPH("95",4);
		
		assertEquals(num1, conversion.convertKPH2MPH(String.valueOf(num2),4),0.00001);
	}

	@Test
	public void testMpgAndKpl() {
		float num1, num2;
		num1 = (float)95;
		num2 = conversion.convertMPG2KPL("95",4);

		assertEquals(num1, conversion.convertKPH2MPH(String.valueOf(num2),4),0.00001);
	}

	@Test
	public void testKelvinAndCelsius(){
		float num1, num2;
		num1 = (float)95;
		num2 = conversion.convertK2C("95",4);

		assertEquals(num1, conversion.convertKPH2MPH(String.valueOf(num2),4),0.00001);
	}
	
	@Test
	/* Test passes for multiple values tested */
	public void testGetRoundValFromUser() {
		int roundVal = conversion.getRoundTo();
		
		assertEquals(-16.111, conversion.convertF2C("3", roundVal),0.00001);
	}

}
