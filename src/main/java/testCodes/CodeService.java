package testCodes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CodeService 
{
	@Autowired
	 static List<CodeBean> flightlist=new ArrayList<CodeBean>();
	
	 static 
	 {
		 flightlist.add(new CodeBean("IndigoAirlines","IA1010"));
		 flightlist.add(new CodeBean("SpiceJet","SJ8899"));
	 }
	 
	 
	 public List<CodeBean> allFlights() 
	 	{
			return flightlist;	
		}
	
	public CodeBean searchFlight(String flightnumber) 
	{
		for(CodeBean flight:flightlist)
		{
			if(flight.getFlightnumber().equals(flightnumber))
			return flight;
		}
		return null;
		
	}

//	public void searchPassenger() 
//	{
//		
//	}

}
