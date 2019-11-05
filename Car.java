
/**
 * @author Yiyang Shi
 */
public class Car
{
    private  double TankSize, FuelTankSize, FuelEconomy, AverageSpeed, DrivingDistance, TripOdometer, Odometer;
    private  String Make, Model, Color, VIN;
    private  int Year;
    private  String[] carMake = {"Toyota", "Honda", "Tesla", "BMW", "Mercedes", "Landover", "Mazida", "Lincoln"};
    private  String[] carModel = {"Model1", "Model2", "Model3", "Model4", "Model5", "Model6"};
    private  String[] carColor = {"Blue", "White", "Silver", "Yellow", "Red", "Black", "Green"};
    /**
     * create a Car default object.
     * @precondition: noun.
     * @postconditin: state variable VIN set up to a string type from toString plus Tanksize;
     *                state variable Odometer set up to a random double type number between 0 and 5.99;
     *                state variable FuelEconomy set up to a random double type number between 15 and 65.99;
     *                state variable FuelTankSize set up to a random double type number between 8 and 35.49;
     *                state variable TankSize set up to a random double type number between 0 and 10 more than FuelTankSize;
     */
    public Car()
    {
        VIN = toString() + TankSize;
        Odometer = (double)(Math.random()*600) / 100;
        FuelEconomy = (double)(Math.random()*5100 + 1500) / 100;
        FuelTankSize = (double)(Math.random()*275 + 80) / 10;
        TankSize = FuelTankSize + (double)(Math.random()*10);
    }
    /**
     * Create a Car object based on customize color, make, model, and year information.
     * @precondition: noun.
     * @postcondition: state variable VIN set up to a string type from toString plus Tanksize;
     *                 state variable Odometer set up to a random double type number between 0 and 5.99;
     *                 state variable FuelEconomy set up to a random double type number between 15 and 65.99;
     *                 state variable FuelTankSize set up to a random double type number between 8 and 35.49;
     *                 state variable TankSize set up to a random double type number between 0 and 10 more than FuelTankSize;
     *                 state variable Color has changed to color;
     *                 state variable Make has changed to make;
     *                 state variable Model has changed to model;
     *                 state variable Year has changed to year;
     * @param color
     * @param make
     * @param model
     * @param year
     */
    public Car(String color, String make, String model, int year)
    {
        Color = color;
        Make = make;
        Model = model;
        Year = year;
        VIN = toString() + TankSize;
        Odometer = (double)(Math.random()*600) / 100;
        FuelEconomy = (double)(Math.random()*5100 + 1500) / 100;
        FuelTankSize = (double)(Math.random()*275 + 80) / 10;
        TankSize = FuelTankSize + (double)(Math.random()*10);
    }
    /**
     * Create a Car object based on customize make, model, color, year, tanksize, and fueltanksize information.
     * @precondition: noun;
     * @postcondition: state variable VIN set up to a string type from toString plus Tanksize;
     *                 state variable Odometer set up to a random double type number between 0 and 5.99;
     *                 state variable FuelEconomy set up to a random double type number between 15 and 65.99;
     *                 state variable FuelTankSize has changed to fueltanksize;
     *                 state variable TankSize has changed to tanksize;
     *                 state variable Color has changed to color;
     *                 state variable Make has changed to make;
     *                 state variable Model has changed to model;
     *                 state variable Year has changed to year;
     * @param make
     * @param model
     * @param color
     * @param year
     * @param tanksize
     * @param fueltanksize
     */
    public Car(String make, String model, String color, int year, double tanksize, double fueltanksize )
    {
        TankSize = tanksize;
        FuelTankSize = fueltanksize;
        Make = make;
        Model = model;
        Color = color;
        Year = year;
        VIN = toString() + TankSize;
        Odometer = (double)(Math.random()*600) / 100;
        FuelEconomy = (double)(Math.random()*5100 + 1500) / 100;
    }
    /**
     * Create a Car object which copy all information from another same Car type object.
     * @precondition: noun;
     * @postcondition: object Car has changed to car;
     * @param car
     */
    public Car(Car car)
    {
        TankSize = car.GetTankSize();
        FuelTankSize = car.GetFuelTankSize();
        Make = car.GetMake();
        Model = car.GetModel();
        Color = car.GetColor();
        Year = car.GetYear();
        Odometer = car.getOdometer();
        FuelEconomy = car.GetFuelEconomy();
        VIN = car.GetVIN();
    }
    /**
     * sets up the state variables for this car object.
     * @precondition: noun;
     * @postcondition: state variable Model has changed to one of six default carModel;
     *                 state variable Make has changed to one of eight default carMake;
     *                 state variable Color has changed to one of seven default carColor;
     *                 state variable Year has changed to a random int type number between 1969 and 2019;
     *                 state variable Odometer has changed to a random double number between 0 and 5.99;
     *                 state variable FuelEconomy has changed to a random double number between 15 and 55.99;
     *                 state variable FuelTankSize has changed to a random double number between 8 and 35.49;
     *                 state variable TankSize has changed to a random double number between 0 to 10 more than FuelTankSize;
     *                 state variable VIN has changed to a String type which come from toString method from this class plus TankSize;
     */
    public void SetUp()
    {
        Model = carModel[(int)(Math.random()*6)];
        Make = carMake[(int)(Math.random()*8)];
        Color = carColor[(int)(Math.random()*7)];
        Year = (int)(Math.random()*50) + 1969;
        Odometer = (double)(Math.random()*600) / 100;
        FuelEconomy = (double)(Math.random()*5100 + 1500) / 100;
        FuelTankSize = (double)(Math.random()*275 + 80) / 10;
        TankSize = FuelTankSize + (double)(Math.random()*10);
        VIN = toString() + TankSize;
    }
    /**
     * This method sets up the VIN for this object.
     * @precondition: noun.
     * @postcondition: VIN has changed to a String type which come from toString method from this class plus TankSize;
     */
    public void setVin()
    {
        VIN = toString() + TankSize;
    }
    /**
     * This method sets up the customize Make for this object.
     * @precondition: noun.
     * @postcondition: state variable Make has changed to make;
     * @param make
     */
    public void setMake(String make)
    {
        Make = make;
    }
    /**
     * This method sets up the customize Model for this object.
     * @precondition: noun.
     * @postcondition: state variable Model has changed to model.
     * @param model
     */
    public void setModel(String model)
    {
        Model = model;
    }
    /**
     * This method sets up the customize Color for this object.
     * @precondition: noun.
     * @postcondition: state variable Color has changed to color.
     * @param color
     */
    public void setColor(String color)
    {
        Color = color;
    }
    /**
     * This method sets up the customize Year for this object.
     * @precondition: noun.
     * @postcondition: state variable Year has changed to year.
     * @param year
     */
    public void setYear(int year)
    {
        Year = year;
    }
    /**
     * This method sets up the customize tanksize for this object.
     * @precondition: noun.
     * @postcondition: state variable Tanksize has changed to tanksize.
     * @param tanksize
     */
    public void setTankSize(double tanksize)
    {
        TankSize = tanksize;
    }
    /**
     * This method sets up the customize fueltanksize for this object.
     * @precondition: noun.
     * @postcondition: state variable FuelTankSize has changed to fueltanksize.
     * @param fueltanksize
     */
    public void setFuelTankSize(double fueltanksize)
    {
        FuelTankSize = fueltanksize;
    }
    /**
     * This method sets up the customize fueleconomy for this object.
     * @precondition: noun.
     * @postcondition: state variable FuelEconomy has changed to fueleconomy.
     * @param fueleconomy
     */
    public void setFuelEconomy(double fueleconomy)
    {
        FuelEconomy = fueleconomy;
    }
    /**
     * This method sets up the customize mileage for this object.
     * @precondition: noun.
     * @postcondition: state variable Odometer has changed to odometer.
     * @param mileage
     */
    public void setOdometer(double odometer)
    {
        Odometer = odometer;
    }
    /**
     * return the VIN information for this obeject.
     * @precondition: Car has a VIN.
     * @postcondition: noun.
     * @return
     */
    public String GetVIN()
    {
        return VIN;
    }
    /**
     * return the tanksize information for this obeject.
     * @precondition: Car has a TankSize.
     * @postcondition: noun.
     * @return
     */
    public double GetTankSize()
    {
        return TankSize;
    }
    /**
     * return the fueltanksize information for this obeject.
     * @precondition: Car has a FuelTankSize.
     * @postcondition: noun.
     * @return
     */
    public double GetFuelTankSize()
    {
        return FuelTankSize;
    }
    /**
     * return the maker information for this obeject.
     * @precondition: Car has a Make.
     * @postcondition: noun.
     * @return
     */
    public String GetMake()
    {
        return Make;
    }
    /**
     * return the model information for this obeject.
     * @precondition: Car has a Model.
     * @postcondition: noun.
     * @return
     */
    public String GetModel()
    {
        return Model;
    }
    /**
     * return the color information for this obeject.
     * @precondition: Car has a Color.
     * @postcondition: noun.
     * @return
     */
    public String GetColor()
    {
        return Color;
    }
    /**
     * return the year information for this obeject.
     * @precondition: Car has a Year.
     * @postcondition: noun.
     * @return
     */
    public int GetYear()
    {
        return Year;
    }
    /**
     * return the fueleconomy information for this obeject.
     * @precondition: Car has a FuelEconomy.
     * @postcondition: noun.
     * @return
     */
    public double GetFuelEconomy()
    {
        return FuelEconomy;
    }
    /**
     * return the averagespeed information for this obeject.
     * @precondition: Car has a AverageSpeed.
     * @postcondition: noun.
     * @return
     */
    public double GetAverageSpeed()
    {
        return AverageSpeed;
    }
    /**
     * return right now thi trip drivingdistance information for this obeject.
     * @precondition: Car has a DrivingDistance.
     * @postcondition: noun.
     * @return
     */
    public double GetDrivingDistace()
    {
        return DrivingDistance;
    }
    /**
     * toString rewrite which allows object to be print out by System.out.print method.
     * @precondition: Car has a Year, a Make, a Model, a Color.
     * @postcondition: noun.
     * @return
     * return a String type which contain Year, Make, Model, and Color.
     */
    public String toString()
    {
        return (Year + " " + Make + " " + Model + " " + Color);
    }
    /**
     * change this object's color based on customize pcolor.
     * @param pColor 
     * @precondition noun
     * @postcondition state variable color has changed to pColor
     */
    public void paint(String pColor)
    {
        Color = pColor;
    }
    /**
     * return how much gas this object use during this trip based on averagespeed, fueleconomy, and drivingdistance information.
     * @precondition: Car has a AverageSpeed, a DrivingDistance and a FuelEconomy.
     * @postcondition: noun.
     * @return
     * declare a double type variable pFuelEconomy;
     * if Car's AverageSpeed is smaller than 40 or between 60 and 80 (include 80 but not include 60), pFuelEconomy will change to FuelEconomy times 1.1;
     *  else if Car's AverageSpeed is between 80 and 100 (include 100 but not include 80), pFuelEconomy will change to FuelEconomy times 1.25;
     *    else if Car's AverageSpeed is greater than 100, pFuelEconomy will change to FuelEconomy times 1.35;
     *      else pFuelEconomy will change to FuelEconomy.
     * return the double value which is DrivingDistance divides pFuelEconomy with one decimal numbers.
     */
    public double GasCost()
    {
        double pFuelEconomy;
        if (AverageSpeed < 40 || (AverageSpeed > 60 && AverageSpeed <=80))
            pFuelEconomy = FuelEconomy * 1.1;
        else if (AverageSpeed > 80 && AverageSpeed <= 100) 
            pFuelEconomy = FuelEconomy * 1.25;
        else if (AverageSpeed > 100)
            pFuelEconomy = FuelEconomy * 1.35;
        else pFuelEconomy = FuelEconomy;
        return  Double.valueOf(String.format("%.1f", DrivingDistance/pFuelEconomy));
    }
    /**
     * return the size of empty tank of this object.
     * @precondition: Car has a TankSize and a FuelTankSize.
     * @postcondition: noun.
     * @return
     * return a double value which is TankSize minuses FuelTankSize.
     */
    public double getFuelLevel()
    {
        return (TankSize - FuelTankSize);
    }
    /**
     * Checks to see if the calling Car and the argument Car have the same state except for the VIN
	 * @precondition: Both the calling Car and argument Car are fully initialized
	 * @postcondition: noun
	 * @param car
	 * @return
	 * returns true if the calling Car and the argument Car have the same state except for the VIN, else returns false
     */
    public Boolean equals(Car car)
    {
        if (Year == car.GetYear() && Make.equals(car.GetMake()) && Model.equals(car.GetModel()) && Color.equals(car.GetColor()))
        return true;
        return false;
    }
    /**
	 * drives the Car predefined distance and speed. return true if the car travels the distance with fuel remaining, false if the car runs out of fuel.
	 * Precondition: Car's trip state variables have been initialized
	 * Postcondition: Car's fuel is reduced proportional to the distance and speed driven or depleted if the distance and speed are too great.
     *                odometer and trip odometer are updated with the miles traveled added.
	 * @return
     * declare two double variables which are pDistance and pFuelEconomy.
     * if Car's AverageSpeed is smaller than 40 or between 60 and 80 (include 80 but not include 60), pFuelEconomy will change to FuelEconomy times 1.1;
     *  else if Car's AverageSpeed is between 80 and 100 (include 100 but not include 80), pFuelEconomy will change to FuelEconomy times 1.25;
     *    else if Car's AverageSpeed is greater than 100, pFuelEconomy will change to FuelEconomy times 1.35;
     *      else pFuelEconomy will change to FuelEconomy.
     * pDistance will change to a double value which is pFuelEconomy times FuelTankSize with one decimal number.
     * stated variable Odometer will change to initial Odometer plus DrivingDistance.
     * stated variable TripOdometer will change to initial TripOdometer plus DrivingDistance.
     * if DrivingDistance smaller or equals to pDistance that FuelTankSize will change to initial FuelTankSize minus GasCost() method, and return True.
     *   else FuelTankSize will change to zero, and return False.
     */
    public Boolean driveCar()
    {
        double pDistance;
        double pFuelEconomy;
        if (AverageSpeed < 40 || (AverageSpeed > 60 && AverageSpeed <=80))
            pFuelEconomy = FuelEconomy * 1.1;
        else if (AverageSpeed > 80 && AverageSpeed <= 100) 
            pFuelEconomy = FuelEconomy * 1.25;
        else if (AverageSpeed > 100)
            pFuelEconomy = FuelEconomy * 1.35;
        else pFuelEconomy = FuelEconomy;
        pDistance = Double.valueOf(String.format("%.1f", pFuelEconomy * FuelTankSize));
        Odometer = Odometer + DrivingDistance;
        TripOdometer = TripOdometer + DrivingDistance;
        
        if (DrivingDistance <= pDistance) 
        {       
            FuelTankSize = FuelTankSize - GasCost();
            return true;
        }
        FuelTankSize = 0;
        return false;
    }
    /**
     * return the TripOdometer for this object.
     * @precondition: Car has a TripOdometer.
     * @postcondition: noun.
     * @return
     */
    public double getTripOdometer()
    {
        return TripOdometer;
    }
    /**
     * set the TripOdometer as 0;
     * @precondition: Car has a TripOdometer.
     * @postcondition: TripOdometer has changed to zero.
     */
    public void clearTripOdometer()
    {
        TripOdometer = 0.0;
    }
    /**
     * return the Odometer for this object.
     * @precondition: Car has an Odometer.
     * @postcondition: noun.
     * @return
     */
    public double getOdometer()
    {
        return Odometer;
    }
    /**
     * This method sets up the AverageSpeed and DrivingDistance based on customize pAverageSpeed and pDrivingDistance.
     * @precondition: noun.
     * @postcondition: AverageSpeed has changed to pAverageSpeed;
     *                 DrivingDistance has changed to pDrivingDistance.
     * @param pAverageSpeeds
     * @param pDrivingDistance
     */
    public void setUpTrip(double pAverageSpeeds, double pDrivingDistance)
    {
        AverageSpeed = pAverageSpeeds;
        DrivingDistance = pDrivingDistance;
    }
}