//Activate function is used in S_init State
package states;
import output.Output;
public class S_init extends State{
	

public void Activate()
{
	System.out.println("Gas pump is activated");
	Output.storeData(); //storeData of Output class is called which is used to save any new data in this state.
}


}
