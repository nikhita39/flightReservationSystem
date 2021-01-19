class Main {
  public static void main(String[] args) {
    Address obj1= new Address("ramnagar","pune","Maharashtra");
        System.out.println(obj1.getAddressDetails());
        obj1.updateAddressDetails("ramnagar","pune","pune");
        System.out.println(obj1.getAddressDetails());
    
        Contact obj2=new Contact("Nikhita","8805430168","nikhitasingh39@gmail.com");
        System.out.println(obj2.getContactDetails());
        obj2.updateContactDetails("Nikhita","8805430168","nikhitasing39@gmail.com");
        System.out.println(obj2.getContactDetails());
    
        Flight obj3=new Flight("12345","Indian Airways",500,70);
        System.out.println(obj3.getFlightDetails());
        System.out.println(obj3.checkAvailability());
        obj3.incrementBookingCounter();
      
        TouristTicket obj4=new TouristTicket("Pune");
        TouristTicket obj5=new TouristTicket("Pune","Mumbai","Delhi","Hyderabad","Bangalore");
        System.out.println(obj4.getHotelAddress());
        System.out.println(obj5.getTouristLocations());
        obj5.removeTouristLocation("Pune");
        System.out.println(obj5.getTouristLocations());
        obj5.addTouristLocation("Mumbai");
        System.out.println(obj5.getTouristLocations());
  
        Ticket obj6=new Ticket("Srno 52","ramnagar","Pune","20/09/2020","20/09/2020 4:00PM","35",9000.00f);
        System.out.println(obj6.getTicketDetails());
        System.out.println(obj6.getFlightDuration(2));
        System.out.println(obj6.checkStatus());
        obj6.cancel();
        System.out.println(obj6.checkStatus());
     
        RegularTicket obj7=new RegularTicket("Food");
        System.out.println(obj7.getSpecialServices());
        obj7.updateSpecialServices("Food");
        System.out.println(obj7.getSpecialServices());
     
        Passenger obj8=new Passenger(358,"Mumbai","8805430168");
        System.out.println(obj8.getAddress());
        System.out.println(obj8.getContact());
        System.out.println(obj8.getId());
  }
}
 


