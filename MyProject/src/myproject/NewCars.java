
package myproject;

public class NewCars {
    //making the new cars details data in NewCars class
    private String carCompany;
    private String carName;
    private String carPrice;
    private String carModel;
    private String carAvailableColors;
    
    //constructer for the class
    public NewCars(String carCompany, String carName, String carPrice, String carModel, String carAvailableColors) {
        this.carCompany=carCompany;
        this.carName=carName;
        this.carPrice=carPrice;
        this.carModel=carModel;
        this.carAvailableColors=carAvailableColors;
    }

//making set and get methods for each new car details data
    public String getcarCompany() {
        return carCompany;
    }
    public void setcarCompany(String carCompany) {
        this.carCompany = carCompany;
    }
    
    public String getcarName() {
        return carName;
    }
    public void setcarName(String carName) {
        this.carName = carName;
    }

    public String getcarPrice() {
        return carPrice;
    }
    public void setcarPrice(String carPrice) {
        this.carPrice = carPrice;
    }
    public String getcarModel() {
        return carModel;
    }
    public void setcarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getcarAvailableColors() {
        return carAvailableColors;
    }
    public void setcarAvailableColors(String carAvailableColors) {
        this.carAvailableColors = carAvailableColors;
    }
    
    //Override
    @Override
        public String toString() {
        return "Car company = " + carCompany  + "; Car name = " + carName + "; Car price = " + carPrice + "; Car model = " + carModel + "; Available colors = " + carAvailableColors;
        }
        //this method to put it in the usedcars override class
        public String gettoString() {
        return "Car company = " + carCompany  + "; Car name = " + carName + "; Car price = " + carPrice + "; Car model = " + carModel + "; Available colors = " + carAvailableColors;
        }

}
