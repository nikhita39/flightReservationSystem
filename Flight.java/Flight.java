public class Flight{
  
    public String flightNumber;
    public String airline;
    public int capacity;
    public int bookedSeats;
  
    public Flight(String flightNumber,String airline,int capacity,int bookedSeats){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;
    }
   
    public String getFlightDetails()
    {
        return flightNumber+" "+airline;
    }
  
    public boolean checkAvailability(){
        boolean ava=false;
        if(bookedSeats==capacity){
            ava = false;
        }
        if(bookedSeats < capacity) {
            ava = true;
        }
        return ava;
    }
  
    public void incrementBookingCounter(){
        int count=0;
        count++;
    }

}