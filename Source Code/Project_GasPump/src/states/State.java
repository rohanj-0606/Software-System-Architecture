//Main State class

package states;

import mda.MDA;
import output.Output;

public class State {
		Output op;  //object of Output class
		int stateID;
		MDA mda; //object of MDA class
		
		// Declaration of all the functions of all 8 state classes.
		public int getStateID() {
			return stateID;
		}
		
		public void setStateID(int stateID) {
			this.stateID = stateID;
		}
		
		
		public Output getOp() {
			return op;
		}

		public void setOp(Output op) {
			this.op = op;
		}
		

		public void Activate(){
			
		}
		public void Start(){
			
		}
		public void PayCash(){
			
		}
		public void PayCredit(){
			
		}
		public void Approved(){
			
		}
		public void Reject(){
			
		}
		public void Cancel(){
			
		}
		public void Pump(){
			
		}
		public void StopPump(){
			
		}
		public void Receipt(){
			
		}
		public void NoReceipt(){
			
		}
		public void SelectGas(int g){
			
		}
		public void StartPump(){
			
		}
}
