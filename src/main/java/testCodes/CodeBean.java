package testCodes;

import org.springframework.stereotype.Component;

@Component
public class CodeBean 
{
	private String flightname;
	private String flightnumber;
	public CodeBean() 
	{
		
	}
	public CodeBean(String flightname, String flightnumber) 
	{
		super();
		this.flightname = flightname;
		this.flightnumber = flightnumber;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	@Override
	public String toString() {
		return "CodeBean [flightname=" + flightname + ", flightnumber=" + flightnumber + "]";
	}
	
}
