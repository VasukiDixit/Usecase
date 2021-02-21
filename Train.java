package testcases;

public class Train {
	
	private int trainNo;
	private String trainName;
	private String source;
	private String destination;
	private double ticketPrice;
	public Train(int trainNo, String trainName, String source, String destination, double ticketPrice) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.ticketPrice = ticketPrice;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
	//System.out.println("source:" + source);
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		//System.out.println( "destination:" + destination);
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Train [source=" + source + ", destination=" + destination + "]";
	}
	
	

}

