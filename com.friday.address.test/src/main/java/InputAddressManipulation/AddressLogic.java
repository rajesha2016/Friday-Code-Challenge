package InputAddressManipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;
import org.junit.Assert;

import com.cucumber.listener.Reporter;


/**
 * @author r.moharana
 * class handles address logic. It takes input string from FridayAddressTaskSteps.java and find the combination based on the pattern
 */
public class AddressLogic {
	
	private String street;
	private String houseNumber;
	
	// this Regular expression is designed based on the task inputs and it can handle similar input address line
	private String patternRegex="(?i)\\A((No\\s?)?(\\d+\\s+[A-Z](\\s|$)|\\d+([A-Z])(\\s|$)|\\d+))|((No\\s?)?(\\d+\\s+([A-Z])(\\s|$)|\\d+([A-Z])(\\s|$)|\\d+))$";
	
	
	/**
	 * @param givenInputString: Input address e.g: Auf der Vogelwiese 23 b
	 * this method verify pattern based on the regex and display them in JSON format
	 */
	public void verifyPattern(String givenInputString){
		
		try{
			
			Pattern pattern=Pattern.compile(patternRegex);
			Matcher matcher=pattern.matcher(givenInputString);
			
			if(matcher.find()){
				
				houseNumber=matcher.group(0).trim();
				street=givenInputString.replace(houseNumber, "").replaceAll("[^a-zA-Z0-9 ]+", "").trim();
				Assert.assertTrue("Invalid Address line '"+givenInputString+"'.Street name is missing", street.length()>0);
				
				jsonOutput(givenInputString,houseNumber,street);
				
			}else{
					
				Reporter.addStepLog("Invalid address line '"+givenInputString+"'.House Number is missing");
			}
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	/**
	 * @param houseNumber
	 * @param street
	 * JSON output
	 */
	@SuppressWarnings("unchecked")
	public void jsonOutput(String inputAddress,String houseNumber,String street){
		
		JSONObject jobj=new JSONObject();
		jobj.put("street", street);
		jobj.put("housenumber", houseNumber);
		
		Reporter.addStepLog("JSON output for given intput address '"+inputAddress+"' is : "+jobj);
		
	}

}
