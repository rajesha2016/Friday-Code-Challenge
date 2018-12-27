package StepDefinitions;

import com.cucumber.listener.Reporter;

import InputAddressManipulation.AddressLogic;
import cucumber.api.java8.En;

/**
 * @author r.moharana
 * this class holds steps gluecode of feature file
 */
public class FridayAddressTaskSteps implements En{
	
	AddressLogic address=new AddressLogic();
	
	public FridayAddressTaskSteps(){
		
		Given("^User has input address string (.*) and get Json output$", (String inputAddressString) -> {
		    
			if(inputAddressString.length()>0){
				
				address.verifyPattern(inputAddressString);
				
			}else{
				
				Reporter.addStepLog("Input address "+inputAddressString+" has no characters.Empty string");
			}
		   
		});

	}
	
	
}
