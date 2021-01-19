public class Ticket {
    public String pnr;
    public String from;
    public String to;
    public String flight;
    public String departureDateTime;
    public String arrivalDateTime;
    public String passenger;
    public String seatNo;
    public float price;
    public boolean cancelled;
   
    public Ticket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,float price){
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.seatNo=seatNo;
        this.price=price;
        this.cancelled=false;
    }
    public String getTicketDetails(){
        return this.pnr+" "+this.from+" "+this.to+" "+this.departureDateTime+" "+this.arrivalDateTime+" "+this.seatNo+" "+this.price;
    }

    public String checkStatus(){
        String status;
        if(this.cancelled==true){
            status="Cancelled";
        }
        else{
            status="Confirmed";
        }
        return status;
    }
    
    public int getFlightDuration(int duration){
        return duration;
    }
   
    public void cancel(){
        this.cancelled=true;
    }
}