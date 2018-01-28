//importing all the required packages for the main class 'Main.java'
package Driver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import Input.GP1;
import abstractFactory.*;
import datastore.DataStore;
import Input.*;
import mda.*;
import output.*;
import states.*;

public class Main {
	private static Scanner sc;

	public static void main(String[] args ) throws NumberFormatException, IOException{
		int ch;
		
		sc = new Scanner(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//Displaying Menu to select GasPumps option.
		System.out.println("Select choice:: \n1.GasPump1\n2.GasPump2\n3.Exit");
		System.out.println("Enter choice");
		ch=sc.nextInt();
		//creating objects of all the 8 states.
		S_init sinit=new S_init();
		 S0 s0=new S0();
		 S1 s1=new S1();
		 S2 s2=new S2();
		 S3 s3=new S3();
		 S4 s4=new S4();
		 S5 s5=new S5();
		 S6 s6=new S6();
		//creating array of states for MDA
		State[] s=new State[8];
		s[0]=sinit;
		s[1]=s0;
		s[2]=s1;
		s[3]=s2;
		s[4]=s3;
		s[5]=s4;
		s[6]=s5;
		s[7]=s6;
		
		MDA mda=new MDA(); //MDA object is created here.
		Output op=new Output(); //output object is created here.
		DataStore ds=new DataStore(); //DataSource object is created here.
		
		switch(ch){
		// Case 1. GasPump 2 is selected
		case 1: GP1 gp1=new GP1();
		System.out.println("Gas Pump 1 has been selected!");
		
				CF1 cf1=new CF1(); //concrete factory 1 object is created here.
				ds=cf1.getData();
				gp1.setMda(mda); //setting MDA of GasPump 1.
				gp1.setAf(cf1);//setting concrete factory 1 for GasPump1
				ds=cf1.getData(); //calling 'getData' function of Concrete factory 2 in 'ds'.
				gp1.setDs(ds); //setting DataStore for GasPump1
				//Setting of state IDS of all 8 states.
				sinit.setStateID(0);
				s0.setStateID(1);
				s1.setStateID(2);
				s2.setStateID(3);
				s3.setStateID(4);
				s4.setStateID(5);
				s5.setStateID(6);
				s6.setStateID(7);
				//passing of output object(op) to all the states.
				sinit.setOp(op);
				s0.setOp(op);
				s1.setOp(op);
				s2.setOp(op);
				s3.setOp(op);
				s4.setOp(op);
				s5.setOp(op);
				s6.setOp(op);
				
				op.setDs(ds); //setting datastore of output class
				op.setAf(cf1); //setting abstract factory for output class.
				mda.initalizeStates(s); //initializing states of MDA.
				mda.setStates(sinit); //setting states of MDA class.
	
				
				while(ch!=0){
					//Displaying Menu of GasPump1
					System.out.println("__________________MENU_____________");
					System.out.println("1. Activate");
					System.out.println("2. Start");
					System.out.println("3. PayCredit");
					System.out.println("4. Approved");
					System.out.println("5. Reject");
					System.out.println("6. Cancel");
					System.out.println("7. Regular");
					System.out.println("8. SUPER");
					System.out.println("9. StartPump");
					System.out.println("10. Pump");
					System.out.println("11. StopPump");
					System.out.println("0. Exit");

					int choice=sc.nextInt();
					
					float regPrice,supPrice;
					switch(choice){
					case 1: 
						//Accepting values of regular and super gas from the user.
						System.out.println("Enter value of regular gas:");
						regPrice=Float.parseFloat(bf.readLine());
						System.out.println("Enter value of super gas:");
						supPrice=Float.parseFloat(bf.readLine());	
						//calling 'Activate' function of GasPump 1.
						gp1.Activate(regPrice, supPrice);
	
						break;
					
					case 2: 
						//calling 'Start' function of GasPump 1 to start the GasPump 1.
						gp1.Start();
					
						break;
					case 3:
						//calling 'PayCredit' function of GasPump 2 if credit payment is option selected.
						gp1.PayCredit();
					
						break;
					case 4:
						//Calling 'Approved' function of GasPump 1 if credit card is approved.
						gp1.Aprroved();
						
						break;
					case 5:
						//Calling 'Reject' function of GasPump 1 if transaction is rejected.
						gp1.Reject();
						break;
					case 6:
						//Calling 'Cancel' function of GasPump 1 to cancel operation.
						gp1.Cancel();
						break;
					case 7: 
						//Calling 'Regular' function of GasPump 1 if regular gas has been selected by user.
						gp1.Regular();
					
							break;
					case 8: 
						//Calling 'Super' function of GasPump 1 if super gas has been selected by user.
						gp1.Super();
					
							break;
					case 9:
						//Calling 'StartPump' function of GasPump 1 to start the pump..
						gp1.StartPump();
						
						break;
					case 10:
						//Calling 'PumpGallon' function of GasPump 1 to start pumping gas in Gallons.
						gp1.PumpGallon();
					
						break;
					case 11:
						//Calling 'StopFunction' function of GasPump 1 to stop pump.
						gp1.StopPump();
						break;
						
					case 0: 
						//To Exit the system.
						System.exit(0);

				default:
					System.out.println("Enter Correct choice");
					
					}
				}
		
				
		
		
	case 2:
		// Case 2. GasPump 2 is selected
		GP2 gp2=new GP2();
	System.out.println("Gas Pump 2 has been selected!");
			
			CF2 cf2=new CF2(); //concrete factory 2 object is created here.
			ds=cf2.getData(); //calling 'getData' function of Concrete factory 2 in 'ds'.
			gp2.setMda(mda); //setting of mda of GasPump2 class.
			gp2.setAf(cf2); //setting abstract factory for GasPump2
			gp2.setDs(ds); //setting of DataStore for GasPump2.
			//Setting of State IDS of all 8 states.
			sinit.setStateID(0);
			s0.setStateID(1);
			s1.setStateID(2);
			s2.setStateID(3);
			s3.setStateID(4);
			s4.setStateID(5);
			s5.setStateID(6);
			s6.setStateID(7);
			//passing of output object(op) to all the states.
			sinit.setOp(op);
			s0.setOp(op);
			s1.setOp(op);
			s2.setOp(op);
			s3.setOp(op);
			s4.setOp(op);
			s5.setOp(op);
			s6.setOp(op);
			
			op.setDs(ds); //seting datastore of output class.
			op.setAf(cf2); //setting abstract factory for Concrete factory 2.
			mda.initalizeStates(s); //Initializing states for MDA.
			mda.setStates(sinit); // Setting states for MDA.

			
			while(ch!=0)
				//Displaying Menu for GasPump2
			{
				System.out.println("__________________MENU_____________");
				System.out.println("1. Activate");
				System.out.println("2. Start");
				System.out.println("3. PayCash");
				System.out.println("4. Cancel");
				System.out.println("5. Regular");
				System.out.println("6. Super");
				System.out.println("7. Premium");
				System.out.println("8. StartPump");
				System.out.println("9. Pump");
				System.out.println("10. StopPump");
				System.out.println("0. Exit");
				int choice=sc.nextInt();
				
				float regPrice,supPrice,premPrice;
				switch(choice){
				case 1: 
					//Accepting values of regular, super gas and premium gas from the user.
					System.out.println("Enter value of regular gas:");
					regPrice=Float.parseFloat(bf.readLine());
					//regPrice=30;
					System.out.println("Enter value of super gas:");
					supPrice=Float.parseFloat(bf.readLine());	
					//supPrice=40;	
					System.out.println("Enter value of premium gas:");
					premPrice=Float.parseFloat(bf.readLine());	
					//calling 'Activate' function of GasPump 2.
					gp2.Activate(supPrice, regPrice, premPrice);

					break;
				
				case 2: 
					//calling 'Start' function of GasPump 2 to start the GasPump 2.
					gp2.Start();
				
					break;
				case 3:
					float cash;
					//Accepting value of cash amount from the user.
					System.out.println("Enter Cash Amount::");
					cash=Float.parseFloat(bf.readLine());
					//Calling 'PayCash' function of GasPump 2 to store the cash amount taken from the user.
					gp2.PayCash(cash);				
					break;
					

				case 4:
					//Calling 'Cancel' function of GasPump 2 to cancel operation.
					gp2.Cancel();
					break;
				case 5:
					//Calling 'Regular' function of GasPump 2 if regular gas has been selected by user.
					gp2.Regular();
				
						break;
				case 6: 
					//Calling 'Super' function of GasPump 2 if super gas has been selected by user.
					gp2.Super();
				
						break;
				case 7: 
					//Calling 'Premium' function of GasPump 2 if premium gas has been selected by user.
					gp2.Premium();
					break;
					
				case 8:
					//Calling 'StarPump' function of GasPump 2 to start the pump.
					gp2.StartPump();
					
					break;
				case 9:
					//Calling 'PumpLitre' function of GasPump 2 to start the pumping the gas in Litres.
					gp2.PumpLitre();
				
					break;
				case 10:
					//Calling 'StopPump' function of GasPump 2 to stop the pump.
					gp2.StopPump();
					char c;
					
				//Asking user to print the receipt or not.
					System.out.println("Do you want to print receipt(Y|N)::");
					c=sc.next().charAt(0);
					if(c=='y'||c=='Y')	{
						//calling 'Receipt' function of GasPump 2 to print the receipt.
						gp2.Receipt();
						
					}
					else if(c=='N'||c=='n'){
						//calling 'NOReceipt' function of GasPump 2 to print the receipt.
						gp2.NoReceipt();
					}
					break;
					//Exiting the System.
				case 0: System.exit(0);
			default:
				System.out.println("Enter Correct choice");
	}
			}
			
			//Exiting the System.
	case 3: System.exit(0);
		}
	
	}
}


	
