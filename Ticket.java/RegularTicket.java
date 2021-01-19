public class RegularTicket {
    public String specialServices;
  
    public RegularTicket(String specialServices){
        this.specialServices=specialServices;
    }
  
    public String getSpecialServices() {
        return this.specialServices;
    }
  
    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }
}