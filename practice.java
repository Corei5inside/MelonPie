import java.util.Scanner;
public class practice {
    public static void main (String[] args) {
   practice.main();
   //BOOTER
}
 //MAIN MENU
 public static void main () {
 Scanner input1 = new Scanner(System.in);
  System.out.println("\nBasicCal for Java\nCorei5Inside \nInput \"Addition\", \"Subtraction\", \"Division\", or \"Multiplication\"\nExit to exit.\n");
  String CAL = input1.nextLine(); //INPUTTER

  if(CAL.equalsIgnoreCase("Exit")) {
    exit(); 
  }
  else if(CAL.equalsIgnoreCase("Addition")) {
    addition(); 
  }
  else if(CAL.equalsIgnoreCase("Subtraction")){
    subtraction();
  }
  else if(CAL.equalsIgnoreCase("Division")){
    division();
  }
  else if(CAL.equalsIgnoreCase("Multiplication")){
    multiplication();
  }
  else {
    System.out.println("Try again.\n");
    again();
  }
 }
















 
   //EXITS THE PROGRAM
   private static void exit() {
    System.exit(0);
   }
    private static void again() {
      try {
    Thread.sleep(2000);
     } catch (InterruptedException exception) { //this pauses for 2 seconds, interruptedexeception is intercepted here
     Thread.currentThread().interrupt();
     }
    practice.main();
   }
    //ADDITION SECTION
    private static void addition () {
      Scanner input2 = new Scanner(System.in);
    System.out.println("Input number 1: ");
    int a = input2.nextInt();
    System.out.println("Input number 2: ");
    int b = input2.nextInt();
    System.out.println(a + " + " + b + " = " + (a+b));
    try {
    Thread.sleep(2000);
     } catch (InterruptedException exception) { //this pauses for 2 seconds, interruptedexeception is intercepted here
     Thread.currentThread().interrupt();
     }
    practice.main();
 }
     private static void subtraction () {
      Scanner input3 = new Scanner(System.in);
    System.out.println("Input number 1: ");
    int a = input3.nextInt();
    System.out.println("Input number 2: ");
    int b = input3.nextInt();
    System.out.println(a + " - " + b + " = " + (a-b));
    try {
    Thread.sleep(2000);
     } catch (InterruptedException exception) { //this pauses for 2 seconds, interruptedexeception is intercepted here
     Thread.currentThread().interrupt();
     }
    practice.main();
 }
    private static void division () {
      Scanner input3 = new Scanner(System.in);
    System.out.println("Input number 1: ");
    int a = input3.nextInt();
    System.out.println("Input number 2: ");
    int b = input3.nextInt();
    System.out.println(a + " / " + b + " = " + (a/b));
    try {
    Thread.sleep(2000);
     } catch (InterruptedException exception) { //this pauses for 2 seconds, interruptedexeception is intercepted here
     Thread.currentThread().interrupt();
     }
    practice.main();
 }
    private static void multiplication () {
      Scanner input4 = new Scanner(System.in);
    System.out.println("Input number 1: ");
    int a = input4.nextInt();
    System.out.println("Input number 2: ");
    int b = input4.nextInt();
    System.out.println(a + " x " + b + " = " + (a*b));
    try {
    Thread.sleep(2000);
     } catch (InterruptedException exception) { //this pauses for 2 seconds, interruptedexeception is intercepted here
     Thread.currentThread().interrupt();
     }
    practice.main();
 }
   
}

