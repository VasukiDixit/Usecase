package testcases;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;
import java.time.LocalDate;

public class Ticket {
	Train t=new Train(1002,"shatabdi express","banglore","chennai",2500);
	int counter=100;
	String pnr;
	LocalDate TravelDate;
	Train train;
	public Ticket(LocalDate travelDate, Train train) {

	TravelDate = travelDate;
		this.train = train;
	}
	
		
public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}


	public String getPnr() {
		return pnr;
	}


	public void setPnr(String pnr) {
		this.pnr = pnr;
	}


	public LocalDate getTravelDate() {
		return TravelDate;
	}


	public void setTravelDate(LocalDate travelDate) {
		TravelDate = travelDate;
	}


	public Train getTrain() {
		return train;
	}


	public void setTrain(Train train) {
		this.train = train;
	}


	public TreeMap<Passenger, Integer> getPassenger() {
		return passenger;
	}


	public void setPassenger(TreeMap<Passenger, Integer> passenger) {
		this.passenger = passenger;
	}


public String generatePNR() {
			String S=String.valueOf(t.getSource().charAt(0));
			String S1=String.valueOf(t.getDestination().charAt(0));
			String date=TravelDate.format(DateTimeFormatter.ofPattern("YYYYMMDD"));
			String pnr=S+S1+" _"+date+"_"+counter++;
		   if(TravelDate.isAfter(LocalDate.now())) 
			   return pnr;
			   else
				return "enter valid date";
		
	}
double calcPassengerFare(Passenger p) {
	Passenger p1=new Passenger("abc",23,'F');
	if(p1.getAge()<=12) 
		return (0.2)*(t.getTicketPrice());
	else if(p1.getAge()>=60)
		return (0.6)*(t.getTicketPrice());
	else if(p1.getGender()=='F' )
		return (0.25)*(t.getTicketPrice());
	else
		return t.getTicketPrice();
	
}

TreeMap<Passenger,Integer> passenger =new TreeMap<>();
	

}

