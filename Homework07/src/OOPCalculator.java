import java.util.Scanner; 
import java.util.InputMismatchException; 
public class OOPCalculator {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System. in );  
		OOPCalculator calc = new OOPCalculator(); 
		while (calc.askCalcChoice() != 5) { 
			calc.askTwoValues();   
			calc.displayResults(); 
		}
		calc.displayResults(); 
		sc.close(); 
		
}

	private void displayResults() {
		// TODO Auto-generated method stub
		
	}

	private void askTwoValues() {
		// TODO Auto-generated method stub
		
	}

	private int askCalcChoice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
class OOPCalculator1{
  private Scanner readInput;
  private float[] twoFloats = { 0.0f, 0.0f }; 
  private String operation = ""; 
  public OOPCalculator1(Scanner readInput) {  
	  this.readInput = readInput;}
	  private void printMenu() {   
		  System. out .println("Welcome to John Doe's OOP Calculator\n");
		  System. out .println("    1. Addition");  
		  System. out .println("    2. Subtraction");  
		  System. out .println("    3. Multiplication");
		  System. out .println("    4. Division");  
		  System. out .println("    5. Exit\n");   
		  System. out .print("What would you like to do? ");
	  }
	  public int askCalcChoice() { 
		  char userInput=' ';   
		  int choiceNumber = 0;  
		  boolean notDone = true; 
		  while (notDone) {   
			  printMenu();   
			  try { 
				  userInput = readInput.nextLine().charAt(0);    
				  switch (userInput) {    
				  case '1':     
				  case 'A':     
				  case 'a':      
				 operation = "Adding"; 
				 choiceNumber = 1;    
				 notDone = false;    
				 break;
				 
				  case '2':    
				  case 'S':   
				  case 's':    
				 operation = "Subtracting"; 
				 choiceNumber = 2;      
				 notDone = false;     
				 break; 
				  case '3':     
				  case 'M':     
				  case 'm':
				 operation = "Multiplying";     
				 choiceNumber = 3;     
				 notDone = false;      
				 break;
				  case '4':    
				  case 'D':    
				  case 'd': 
				  operation = "Dividing";    
				  choiceNumber = 4;   
				 notDone = false;
				 break;
				 case '5':    
				 case 'X':    
				 case 'x':
				 operation = "Exit";     
				 choiceNumber = 5; 
				 notDone = false;     
				 break;     
			 default:      
				 notDone = true; 
		         System.out .println("You have not entered " +              
				                     "a number between 1 and 5 " +              
				                     "or (A, S, M, D, X) . Try again.");
		         
		         continue;     
		         } // end of switch
			  } catch (final InputMismatchException e) { 
				  System.out .println("You have entered an " +                
			                        "invalid input. Try again.");
				  continue;    }  
			  }   
		  return choiceNumber;  } // end of method askCalcChoice() 
	  
	  public void askTwoValues() { 
		  float firstFloat=0.0f, secondFloat=0.0f; 	 
					  
		  int numRead=0; 
		   while (true) {   
			   numRead = 0; 
			System.out.printf("Please enter two numbers for %s,", operation);    
			System.out .print(" separated by a space: "); 
			   try { 
				   firstFloat = readInput.nextFloat();    
				   numRead += 1; 
				   if ((secondFloat = readInput.nextFloat()) != 0) {    
					   break;
				   } else if (operation.equals("Dividing")) {      
					   System. out .println("You can't divide by zero."); 
					   continue; 
				   }
			   }catch (final InputMismatchException e) {    
				   System. out .println("You have entered an " +
						   "invalid input."); 
				   readInput.nextLine();    
				   continue; 
			   }
		   }
		   twoFloats[0] = firstFloat;  
		   twoFloats[1] = secondFloat; 
	  }
	  public void displayResults() {   
		  float results = 0.0f; 
	      System. out .printf("Results of %s ", operation); 
	      switch (operation) { 
	      case "Adding": 	   
	    	  results = twoFloats[0] + twoFloats[1];  
	    	  break;  
	    	  case "Subtracting":   
	    		  results = twoFloats[0] - twoFloats[1];
	    	  break;  
	    	  case "Multiplying": 
	    		  results = twoFloats[0] * twoFloats[1];   
	    		  break;  
	    		  case "Dividing":  
	    		  results = twoFloats[0] / twoFloats[1];
	    		  
	    		  break;   
	       default:   
	    		  break; 
	      }
	      System.out.printf(" %5.2f and %5.2f is %5.2f\n", twoFloats[0],
	    		  twoFloats[1], results); 
	      readInput.nextLine();  
	      System. out.println("Press enter to continue ..");
	      while (!readInput.nextLine().equals("")); 
	  }
	  public void displayBye() { 
		  System.out .println("\nThank you for using Johne Doe's OOP Calculator." 
				  + "\nPress enter to end.."); 
		  while (!readInput.nextLine().equals("")) ;
	    		  
				   }
			  
		  
  }
	  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	  
	  
	  
	  
  
		
