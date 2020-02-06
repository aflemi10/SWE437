/*
Authors: Allen Fleming && Jordan Brown
Class: SWE 437
 */

// Import Java Libraries
import java.util.*;

public class conversion
{

public static void  printMenu()
{
   System.out.println("\nHello, what kind of units would you like to convert?");
   System.out.println("1-Temperature");
   System.out.println("2-Distance");
   System.out.println("3-Volume");
   System.out.println("4-Mass");
   System.out.println("q-Quit");
}

/** *****************************************************
 *  Conversion methods below
 *  14 methods, 2 for each pair of units
********************************************************* */
private static float convertF2C (String FAsStr)
{  // Convert farenheit to celsius
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf(FAsStr).floatValue());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) ( ( (num1-32.0) * 5.0) / 9.0);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return (num2);
}

private static float convertC2F (String CAsStr)
{  // Convert celsius to farenheit
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (CAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) ( (num1 * 9.0 / 5.0) + 32.0);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// small distance
private static float convertIn2Cm (String inAsStr)
{  // Convert inches to centimeters
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (inAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 2.54);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private static float convertCm2In (String cmAsStr)
{  // Convert centimeters to inches
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (cmAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 0.3937);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// medium distance
private static float convertF2M (String ftAsStr)
{  // Convert feet to meters
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (ftAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 0.3048);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private static float convertM2F (String mAsStr)
{  // Convert meters to feet
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (mAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 / 0.6048);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// large distance
private static float convertM2K (String miAsStr)
{  // Convert miles to kilometers
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (miAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 1.609);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private static float convertK2M (String kmAsStr)
{  // Convert kilometers to miles
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (kmAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 0.6214);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// volume
private static float convertG2L (String galAsStr)
{  // Convert gallons to liters
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (galAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 3.785);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private static float convertL2G (String LAsStr)
{  // Convert liters to gallons
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (LAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 / 3.785);
   return(num2);
}

// small weight
private static float convertOz2G (String ozAsStr)
{  // Convert ounces to grams
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (ozAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 28.35);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private static float convertG2Oz (String gAsStr)
{  // Convert grams to ounces
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (gAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 / 28.35);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// medium weight
private static float convertLb2K (String lbAsStr)
{  // Convert pounds to kilograms
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (lbAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 0.4536);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private static float convertK2Lb (String kgAsStr)
{  // Convert kilograms to pounds
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (kgAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 2.205);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

public static String getInput(){
   Scanner sc = new Scanner(System.in);
   return (sc.nextLine());
}

public static void tempMenu(){
   System.out.println("1-Farenheit to Celsius");
   System.out.println("2-Celsius to Farenheit");
   System.out.println("q-Quit");
   boolean quitFlag=false;
   String input = "";

   while (!quitFlag){
      input = getInput();
      switch(input){
         case "1":
            System.out.println("Enter a Farenheit value to be converted to celsius");
            input=getInput();
            System.out.println(input+" Farenheit = "+convertF2C(input)+" Celsius");
            quitFlag=true;
            break;
         case "2":
            System.out.println("Enter a Celsius value to be converted to Farenheit");
            input=getInput();
            System.out.println(input+" Celsius = "+convertC2F(input)+" Farenheit");
            quitFlag=true;
            break;
         case "q":
            quitFlag=true;
            break;
         default:
            System.out.println("Invalid command entered");
            System.out.println("1-Farenheit to Celsius");
            System.out.println("2-Celsius to Farenheit");
            System.out.println("q-Quit");
         }
   }
}

public static void distanceMenu(){
   System.out.println("1-Inches to Centimeters");
   System.out.println("2-Centimeters to Inches");
   System.out.println("3-Feet to Meters");
   System.out.println("4-Meters to Feet");
   System.out.println("5-Miles to Kilometers");
   System.out.println("6-Kilometers to Meters");
   System.out.println("q-Quit");

   boolean quitFlag=false;
   String input = "";

   while (!quitFlag){
      input = getInput();
      switch(input){
         case "1":
            System.out.println("Enter an Inches value to be converted to Centimeters");
            input=getInput();
            System.out.println(input+" Inches = "+convertIn2Cm(input)+" Centimeters");
            quitFlag=true;
            break;
         case "2":
            System.out.println("Enter a Centimeters value to be converted to Inches");
            input=getInput();
            System.out.println(input+" Centimeters = "+convertCm2In(input)+" Inches");
            quitFlag=true;
            break;
         case "3":
            System.out.println("Enter a Foot value to be converted to Meters");
            input=getInput();
            System.out.println(input+" Feet = "+convertF2M(input)+" Meters");
            quitFlag=true;
            break;
         case "4":
            System.out.println("Enter a Meter value to be converted to Feet");
            input=getInput();
            System.out.println(input+" Meters = "+convertM2F(input)+" Feet");
            quitFlag=true;
            break;
         case "5":
            System.out.println("Enter a Mile value to be converted to Kilometers");
            input=getInput();
            System.out.println(input+" Miles = "+convertM2K(input)+" Kilometers");
            quitFlag=true;
            break;
         case "6":
            System.out.println("Enter a Kilometer value to be converted to Miles");
            input=getInput();
            System.out.println(input+" Kilometers = "+convertK2M(input)+" Miles");
            quitFlag=true;
            break;
         case "q":
            quitFlag=true;
            break;
         default:
            System.out.println("Invalid command entered");
            System.out.println("1-Inches to Centimeters");
            System.out.println("2-Centimeters to Inches");
            System.out.println("3-Feet to Meters");
            System.out.println("4-Meters to Feet");
            System.out.println("5-Miles to Kilometers");
            System.out.println("6-Kilometers to Meters");
            System.out.println("q-Quit");
         }
   }
}

public static void volumeMenu(){
   System.out.println("1-Gallons to Liters");
   System.out.println("2-Liters to Gallons");
   System.out.println("q-Quit");
   boolean quitFlag=false;
   String input = "";

   while (!quitFlag){
      input = getInput();
      switch(input){
         case "1":
            System.out.println("Enter a Gallon value to be converted to Liters");
            input=getInput();
            System.out.println(input+" Gallons = "+convertG2L(input)+" Liters");
            quitFlag=true;
            break;
         case "2":
            System.out.println("Enter a Liter value to be converted to Gallons");
            input=getInput();
            System.out.println(input+" Liters = "+convertL2G(input)+" Gallons");
            quitFlag=true;
            break;
         case "q":
            quitFlag=true;
            break;
         default:
            System.out.println("Invalid command entered");
            System.out.println("1-Gallons to Liters");
            System.out.println("2-Liters to Gallons");
            System.out.println("q-Quit");
         }
   }
}

public static void massMenu(){
   System.out.println("1-Ounces to Grams");
   System.out.println("2-Grams to Ounces");
   System.out.println("3-Pounds to Kilograms");
   System.out.println("4-Kilograms to Pounds");
   System.out.println("q-Quit");
   boolean quitFlag=false;
   String input = "";

   while (!quitFlag){
      input = getInput();
      switch(input){
         case "1":
            System.out.println("Enter an Ounce value to be converted to Grams");
            input=getInput();
            System.out.println(input+" Ounces = "+convertOz2G(input)+" Grams");
            quitFlag=true;
            break;
         case "2":
            System.out.println("Enter a Gram value to be converted to Ounces");
            input=getInput();
            System.out.println(input+" Grams = "+convertG2Oz(input)+" Ounces");
            quitFlag=true;
            break;
         case "3":
            System.out.println("Enter a Pound value to be converted to Kilograms");
            input=getInput();
            System.out.println(input+" Pounds = "+convertLb2K(input)+" Kilograms");
            quitFlag=true;
            break;
         case "4":
            System.out.println("Enter a Kilogram value to be converted to Pounds");
            input=getInput();
            System.out.println(input+" Kilograms = "+convertK2Lb(input)+" Pounds");
            quitFlag=true;
            break;
         case "q":
            quitFlag=true;
            break;
         default:
            System.out.println("Invalid command entered");
            System.out.println("1-Ounces to Grams");
            System.out.println("2-Grams to Ounces");
            System.out.println("3-Pounds to Kilograms");
            System.out.println("4-Kilograms to Pounds");
            System.out.println("q-Quit");
         }
   }
}

public static void main (String[] args){
   boolean quitFlag=false;
   String input = "";
   while (!quitFlag){
      printMenu();
      input = getInput();
      switch(input){
         case "1":
            tempMenu();
            break;
         case "2":
            distanceMenu();
            break;
         case "3":
            volumeMenu();
            break;
         case "4":
            massMenu();
            break;
         case "q":
            quitFlag=true;
            break;
         default:
            System.out.println("Invalid command entered.\n");
            break;
      }
   }
}
}

