public class Vehicle {
    private String make; 
    private String model;
    private int year;
    private double rentalRate;
    private boolean isAvailable = true;
    
    /* 
    The following block of code is used to instanciate a Vehicle object
    that requires certain arguments: make, model, year, rental rate and availability status.
    It then assign them to the variables that are declared in the class by deafult.
    
    note: isAvailable is not an argument in the constructor. 
    The reason why, is that when a customer rents a vehicle it becomes not available.
    However if there is no customer renting the car it is by deafult available. 
    */
    public Vehicle(String make, String model, int year, double rentalRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalRate = rentalRate;  
    }
    
    // Setters: (are used to modify the values of the private variables.)
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
    public void setIsAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }
    
    // Getters: (are used to retrieve the values of the private variables.)
    public String getMake () { return this.make; }
    public String getModel () { return this.model; }
    public int getYear () { return this.year; }
    public double getRentalRate () { return this.rentalRate; }
    public boolean getIsAvailable () { return this.isAvailable; }   
    
    
    
    public void rent() {
        setIsAvailable(false);
    }
    
    public void returnVehicle() {
        setIsAvailable(true);
    }
}
