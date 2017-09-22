package assignment1_3;
import java.util.Scanner;

public class AssignmentQ3 {
	
	public static void main(String args[]){
		
		System.out.println("Please enter two byte numbers !!");
		//Initialize input variables
		byte byteNum1,byteNum2;
		//Instantiating Scanner object
		Scanner userInput=new Scanner(System.in);
		try{
			//Taking input from user			
			byteNum1=userInput.nextByte();
			byteNum2=userInput.nextByte();
			//Printing bitwise AND result
			System.out.println("Bitwise AND Result  :"+(byteNum1&byteNum2));
			//Converting byte to boolean
			boolean myBool1 = (byteNum1!=0);
			boolean myBool2= (byteNum2!=0);
			//Printing Logical AND result
			System.out.println("Logical AND Result :"+((myBool1)&&(myBool2)));
				
		
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		finally{
			//closing Scanner object
			userInput.close();
		}
		
		
	}
	

}
