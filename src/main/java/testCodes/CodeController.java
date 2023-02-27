package testCodes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController 
{
	@Autowired
	public CodeService codeservice;
	
	@GetMapping("searchFlight")
	public List<CodeBean> allFlights()
	{
		return codeservice.allFlights();
	}
	
	
	@GetMapping("searchFlight/flightnumber")
	public CodeBean searchFlight(@PathVariable String flightnumber)
	{
		return codeservice.searchFlight(flightnumber);
	}
//	@GetMapping("searchPassenger")
//	public void searchPassenger()
//	{
//		codeservice.searchPassenger();
//	}
}
