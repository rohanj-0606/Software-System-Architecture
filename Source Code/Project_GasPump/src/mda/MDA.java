//Main MDA Class.
package mda;
import states.*;
public class MDA {

	State curr; //object of State Class
	State[] s=new State[8]; //creating array of states
	
	int present_state;
	
	public void initalizeStates(State[] st) //Initialization of states
	{
		s=st;
	}
	
	public void setStates(State a) //function to set the current state
    {
     curr = a;
    }	
	
	//Following functions are MDA Events which executes based on the current state and changes to a different state after the execution.
	public void Activate() 
	{
		 present_state=curr.getStateID();
		if(present_state==0){
			curr.Activate();
			curr=s[1];
		}
		
	}

	public void Start() {
		 present_state=curr.getStateID();
		if(present_state==1){
			curr.Start();
			curr=s[2];
		}
		
	}

	public void PayCash() {
		 present_state=curr.getStateID();
		if(present_state==2){
			curr.PayCash();
			curr=s[4];
		}
		
	}

	public void Cancel() {
		 present_state=curr.getStateID();
		if(present_state==4){
			curr.Cancel();
			curr=s[1];
		}
		
	}

	public void SelectGas(int g) {
		 present_state=curr.getStateID();
		if(present_state==4){
			curr.SelectGas(g);
			curr=s[5];
		}

	}

	public void PayCredit() {
		 present_state=curr.getStateID();
		if(present_state==2){
			curr.PayCredit();
			curr=s[3];
			
		}
	}

	public void Approved() {
		 present_state=curr.getStateID();
		if(present_state==3){
			curr.Approved();
			curr=s[4];
		}
		
	}

	public void Reject() {
		 present_state=curr.getStateID();
		if(present_state==3){
			curr.Reject();
			curr=s[4];
		}
		
	}

	public void Pump() {
		 present_state=curr.getStateID();
		if(present_state==6){
			curr.Pump();
			curr=s[6];
			//System.out.println(ds.getG());
		}
	}

	public void StartPump() {
		 present_state=curr.getStateID();
		if(present_state==5){
			curr.StartPump();
			curr=s[6];
		}		
	}

	public void StopPump() {
		 present_state=curr.getStateID();
		if(present_state==6){
			curr.StopPump();
			curr=s[7];
		}		
	}

	public void Receipt() {
		 present_state=curr.getStateID();
		if(present_state==7){
			curr.Receipt();
			curr=s[1];
		}		
	}

	public void NoReceipt() {
		 present_state=curr.getStateID();
		if(present_state==7){
			curr.NoReceipt();
			curr=s[1];
		}		
		
	}

}
