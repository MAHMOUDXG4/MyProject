
package myproject;

public class UsedCars extends NewCars {
    //making UsedCars extends from New Cars class to get the common details data
    private String distanceTraveled;
    private String durationUsed;
    //adding more cars details data for used cars like duration used and traveled distanse 

    //constructer for the class
    public UsedCars(String carCompany, String carName, String carPrice, String carModel, String carAvailableColors, String distanceTraveled, String durationUsed) {
        super(carCompany, carName, carPrice, carModel, carAvailableColors);
        this.distanceTraveled=distanceTraveled;
        this.durationUsed=durationUsed;
    }
 
    //making set and get methods for each used car details data
    public String getdistanceTraveled() {
        return distanceTraveled;
    }

    public void setdistanceTraveled(String distanceTraveled) {
        this.distanceTraveled=distanceTraveled;
    }
    
    public String getdurationUsed() {
        return durationUsed;
    }

    public void setdurationUsed(String durationUsed) {
        this.durationUsed=durationUsed;
    }
    //Override
    @Override
        public String toString() {
            
        return  gettoString() + "; Distance Traveled = " + distanceTraveled + "; Duration used = " + durationUsed;
        }
    
}
