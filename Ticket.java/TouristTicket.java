import java.util.*;
public class TouristTicket {
    public String hotelAddress;
    ArrayList<String> selectedTouristLocation=new ArrayList<String>();
  
    public TouristTicket(String hotelAddress){
        this.hotelAddress=hotelAddress;
    }

    public TouristTicket(String loc1,String loc2,String loc3,String loc4,String loc5){
        selectedTouristLocation.add(loc1);
        selectedTouristLocation.add(loc2);
        selectedTouristLocation.add(loc3);
        selectedTouristLocation.add(loc4);
        selectedTouristLocation.add(loc5);
    }

    public String getHotelAddress(){
        return this.hotelAddress;
    }
 
    public ArrayList<String> getTouristLocations(){
        return selectedTouristLocation;
    }
 
    public void removeTouristLocation(String location){
        selectedTouristLocation.remove(location);
    }
  
    public void addTouristLocation(String location){
        selectedTouristLocation.add(location);
    }
}