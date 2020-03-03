/*
Authors: Allen Fleming && Jordan Brown && Joseph Seiler
Class: SWE 437
 */

// Import Java Libraries
import java.util.*;

public class conversion
{
   int roundTo;

   @FunctionalInterface
   interface Converter{
      public float convertFunction(float num);
   }


   public static float myRound(float inFloat, int roundTo){
      int n;
      n = Math.round(inFloat * (float)Math.pow(10,roundTo));
      return (float) (n / (float)Math.pow(10,roundTo));
   }

   public static float castAndRound(String inString, int roundTo){
      float num1;
      num1 = (Float.valueOf(inString).floatValue());
      return myRound(num1, roundTo);
   }

   public static float convert(String inString,Converter cf,int roundTo){
      float num1,num2;
      num1=castAndRound(inString, roundTo);
      num2=cf.convertFunction(num1);
      return myRound(num2, roundTo);
   }

   public static int getRoundTo(){
     int roundTo = -1;
     while((roundTo < 0) || (roundTo > 4)){
      System.out.print("Round to how many decimal places? (0-4)\n-> ");
      roundTo = Integer.parseInt(getInput());
      if((roundTo < 0) || (roundTo > 4)){
        System.out.print("Can only round to decimal places 0-4. Try again\n");
      }
     }
     return roundTo;
   }

   /** *****************************************************
    *  Conversion methods below
    *  14 methods, 2 for each pair of units
   ********************************************************* */
   public static float convertF2C (String inputVal, int roundTo)
   {  // Convert farenheit to celsius
      Converter cF = (num)->((float) ( ( (num-32.0) * 5.0) / 9.0));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertC2F (String inputVal, int roundTo)
   {  // Convert celsius to farenheit
      Converter cF = (num)->((float) ( (num * 9.0 / 5.0) + 32.0));
      return convert(inputVal,cF,roundTo);
   }

   // small distance
   public static float convertIn2Cm (String inputVal, int roundTo)
   {  // Convert inches to centimeters
      Converter cF = (num)->((float) (num * 2.54));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertCm2In (String inputVal, int roundTo)
   {  // Convert centimeters to inches
      Converter cF = (num)->((float) (num * 0.3937));
      return convert(inputVal,cF,roundTo);
   }

   // medium distance
   public static float convertF2M (String inputVal, int roundTo)
   {  // Convert feet to meters
      Converter cF = (num)->((float) (num * 0.3048));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertM2F (String inputVal, int roundTo)
   {  // Convert meters to feet
      Converter cF = (num)->((float) (num / 0.3048));
      return convert(inputVal,cF,roundTo);
   }

   // large distance
   public static float convertM2K (String inputVal, int roundTo)
   {  // Convert miles to kilometers
      Converter cF = (num)->((float) (num * 1.609));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertK2M (String inputVal, int roundTo)
   {  // Convert kilometers to miles
      Converter cF = (num)->((float) (num * 0.6214));
      return convert(inputVal,cF,roundTo);
   }

   // volume
   public static float convertG2L (String inputVal, int roundTo)
   {  // Convert gallons to liters
      Converter cF = (num)->((float) (num * 3.785));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertL2G (String inputVal, int roundTo)
   {  // Convert liters to gallons
      Converter cF = (num)->((float) (num / 3.785));
      return convert(inputVal,cF,roundTo);
   }

   // small weight
   public static float convertOz2G (String inputVal, int roundTo)
   {  // Convert ounces to grams
      Converter cF = (num)->((float) (num * 28.35));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertG2Oz (String inputVal, int roundTo)
   {  // Convert grams to ounces
      Converter cF = (num)->((float) (num / 28.35));
      return convert(inputVal,cF,roundTo);
   }

   // medium weight
   public static float convertLb2K (String inputVal, int roundTo)
   {  // Convert pounds to kilograms
      Converter cF = (num)->((float) (num * 0.4536));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertK2Lb (String inputVal, int roundTo)
   {  // Convert kilograms to pounds
      Converter cF = (num)->((float) (num * 2.205));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertMPH2KPH(String inputVal, int roundTo)
   {
      Converter cF = (num)->((float) (num * 1.6093));
      return convert(inputVal,cF,roundTo);
   }

   public static float convertKPH2MPH(String inputVal, int roundTo){
      Converter cF = (num)->((float) (num / 1.6093));
      return convert(inputVal,cF,roundTo);
   }

   public static String getInput(){
      Scanner sc = new Scanner(System.in);
      return (sc.nextLine());
   }

   public static void tempMenu(int roundVal){
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
               System.out.println(input+" Farenheit = "+convertF2C(input,roundVal)+" Celsius");
               quitFlag=true;
               break;
            case "2":
               System.out.println("Enter a Celsius value to be converted to Farenheit");
               input=getInput();
               System.out.println(input+" Celsius = "+convertC2F(input,roundVal)+" Farenheit");
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

   public static void distanceMenu(int roundVal){
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
               System.out.println(input+" Inches = "+convertIn2Cm(input,roundVal)+" Centimeters");
               quitFlag=true;
               break;
            case "2":
               System.out.println("Enter a Centimeters value to be converted to Inches");
               input=getInput();
               System.out.println(input+" Centimeters = "+convertCm2In(input,roundVal)+" Inches");
               quitFlag=true;
               break;
            case "3":
               System.out.println("Enter a Foot value to be converted to Meters");
               input=getInput();
               System.out.println(input+" Feet = "+convertF2M(input,roundVal)+" Meters");
               quitFlag=true;
               break;
            case "4":
               System.out.println("Enter a Meter value to be converted to Feet");
               input=getInput();
               System.out.println(input+" Meters = "+convertM2F(input,roundVal)+" Feet");
               quitFlag=true;
               break;
            case "5":
               System.out.println("Enter a Mile value to be converted to Kilometers");
               input=getInput();
               System.out.println(input+" Miles = "+convertM2K(input,roundVal)+" Kilometers");
               quitFlag=true;
               break;
            case "6":
               System.out.println("Enter a Kilometer value to be converted to Miles");
               input=getInput();
               System.out.println(input+" Kilometers = "+convertK2M(input,roundVal)+" Miles");
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


   public static void volumeMenu(int roundVal){
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
               System.out.println(input+" Gallons = "+convertG2L(input,roundVal)+" Liters");
               quitFlag=true;
               break;
            case "2":
               System.out.println("Enter a Liter value to be converted to Gallons");
               input=getInput();
               System.out.println(input+" Liters = "+convertL2G(input,roundVal)+" Gallons");
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

   public static void speedMenu(int roundVal){
      System.out.println("1-Miles per hour to Kilometers per hour");
      System.out.println("2-Kilometers per hour to Miles per hour");
      System.out.println("q-Quit");
      boolean quitFlag=false;
      String input = "";

      while (!quitFlag){
         input = getInput();
         switch(input){
            case "1":
               System.out.println("Enter an MPH value to be converted to KPH");
               input=getInput();
               System.out.println(input+" MPH = "+convertMPH2KPH(input,roundVal)+" KPH");
               quitFlag=true;
               break;
            case "2":
               System.out.println("Enter a KPH value to be converted to MPH");
               input=getInput();
               System.out.println(input+" KPH = "+convertKPH2MPH(input,roundVal)+" MPH");
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

   public static void massMenu(int roundVal){
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
               System.out.println(input+" Ounces = "+convertOz2G(input,roundVal)+" Grams");
               quitFlag=true;
               break;
            case "2":
               System.out.println("Enter a Gram value to be converted to Ounces");
               input=getInput();
               System.out.println(input+" Grams = "+convertG2Oz(input,roundVal)+" Ounces");
               quitFlag=true;
               break;
            case "3":
               System.out.println("Enter a Pound value to be converted to Kilograms");
               input=getInput();
               System.out.println(input+" Pounds = "+convertLb2K(input,roundVal)+" Kilograms");
               quitFlag=true;
               break;
            case "4":
               System.out.println("Enter a Kilogram value to be converted to Pounds");
               input=getInput();
               System.out.println(input+" Kilograms = "+convertK2Lb(input,roundVal)+" Pounds");
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

   public static void  printMenu()
   {
      System.out.println("\nHello, what kind of units would you like to convert?");
      System.out.println("1-Temperature");
      System.out.println("2-Distance");
      System.out.println("3-Volume");
      System.out.println("4-Mass");
      System.out.println("5-Speed");
      System.out.println("6-Change how many decimal places to round to.");
      System.out.println("q-Quit");
   }


   public static void main (String[] args){
      int roundVal=0;
      boolean quitFlag=false;
      String input = "";
      while (!quitFlag){
         printMenu();
         input = getInput();
         switch(input){
            case "1":
               tempMenu(roundVal);
               break;
            case "2":
               distanceMenu(roundVal);
               break;
            case "3":
               volumeMenu(roundVal);
               break;
            case "4":
               massMenu(roundVal);
               break;
            case "5":
               speedMenu(roundVal);
               break;
            case "6":
               roundVal=getRoundTo();
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
