import java.util.Scanner;
/**
 * @author Yiyang Shi
 */
public class CarGarageDriving
{
    private static Scanner keyboard = new Scanner(System.in);
    private static int GarageSize, MenuChoice;
    private static Car[] MyCar = new Car[1];
    private static Car[] TmpCar = new Car[1];
    /**
     * request users to enter an available int type number;
     * return a right and available int type number which is positive.
     * @precondition: Scanner type variable keyboard;
     * @postcondition: noun;
     * @return
     * delcare a String type variable str; declare a boolean type variable bo; declare an int type variable enterint;
     * set up the initial bo to false;
     * do the following steps
     *      use str to receive a string value;
     *      try to translate str to int type value which save as enterint;
     *          if str is available to be translated to int type or enterint got the number greater then zero
     *              bo will change to true;
     *          else print out "wrong enter type, please enter an int type number which is positive" and bo will change to false;
     * while the bo's value is false;
     * return enterint which is an int number greater than zero;
     */
    public static int ReturnInt()
    {
        String str;
        Boolean bo;
        int enterint = 0;
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                enterint = Integer.valueOf(str);
                if (enterint <= 0)
                    enterint = Integer.valueOf("asd");
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an Int type number which is positive.");
                bo = false;
            }
        }
        while (!bo);
        return (enterint);
    }
    /**
     * request users to enter an available double type number;
     * return a right and available double type number which is positive.
     * @precondition: Scanner type variable keyboard;
     * @postcondition: noun;
     * @return
     * delcare a String type variable str; declare a boolean type variable bo; declare a double type variable enterdouble;
     * set up the initial bo to false;
     * do the following steps
     *      use str to receive a string value;
     *      try to translate str to double type value which save as enterdouble;
     *          if str is available to be translated to double type or enterdouble got the number greater then zero
     *              bo will change to true;
     *          else display "wrong enter type, please enter an int type number which is positive", and bo will change to false;
     * while the bo's value is false;
     * return enterdouble which is a double number greater than zero; 
     */
    public static double ReturnDouble()
    {
        String str;
        Boolean bo;
        double enterdouble = 0;
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                enterdouble = Double.valueOf(str);
                if (enterdouble <= 0)
                    enterdouble = Double.valueOf("asd");
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an double type number which is positive.");
                bo = false;
            }
        }
        while (!bo);
        return (enterdouble);
    }
    /**
     * request users to enter an available int type number;
     * return a right and available int type number with menuchoice which between 1 and 5, include 1 and 5.
     * @precondition: Scanner type variable keyboard;
     * @postcondition: noun;
     * @return
     * delcare a String type variable str; declare a boolean type variable bo; declare an int type variable enterint;
     * set up the initial bo to false;
     * do the following steps
     *      use str to receive a string value;
     *      try to translate str to int type value which save as enterint;
     *          if str is available to be translated to int type or enterint got the number between one and five which include one and five
     *              bo will change to true;
     *          else diaplay "wrong enter type, please enter an int type number which is positive" and bo will change to false;
     * while the bo's value is false;
     * return enterint which is an int number;
     */
    public static int ReturnIntMenu()
    {
        String str;
        Boolean bo;
        int enterint = 0;
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                enterint = Integer.valueOf(str);
                if (enterint <= 0 || enterint > 5)
                    enterint = Integer.valueOf("asd");
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an Int type number which is between 1 and 5.");
                bo = false;
            }
        }
        while (!bo);
        return (enterint);
    }
    /**
     * request users to enter an available int type number;
     * return a right and available int type number within car numbers.
     * based on how many cars in the garage right now.
     * between 1 and MyCar.length, include 1 and MyCar.length.
     * @precondition: CarGarageDriving has a MyCar arrays;
     *                CarGarageDriving has a ReturnInt() method;
     *                CarGarageDriving has a showCars(Car) method;
     * @postcondition: noun;
     * @return
     * declare an int type variable carNumber;
     * call showCars(Car) method to display all the car information the MyCar arrays contained;
     * do the following steps
     *      set up the carNumber by using ReturnInt() method that carNumber will have an int value;
     *      if carNumber is greater than the MyCar arrays' length
     *          display "Please enter the car number you have, smaller than or equal to MyCar arrays' length";
     *          carNumber will change to zero;
     * while carNumber is equal to zero;
     * return the final int value of carNumber
     */
    public static int returnNumber()
    {
        int carNumber;
        showCars(MyCar);
        do
        {
            carNumber = ReturnInt();
            if (carNumber > MyCar.length)
            {
                System.out.println("Please enter the car number you have, smaller than or equal to " + MyCar.length);
                carNumber = 0;
            }
        }
        while (carNumber == 0);
        return carNumber;
    }
    /**
     * show the menu which have 5 choices.
     * @precondition: noun;
     * @postcondition: noun;
     */
    public static void ShowMenu()
    {
        System.out.println("1. You want to pick a car and run it.");
        System.out.println("2. You want to add a car in the garage.");
        System.out.println("3. You want to remove a car from the garage.");
        System.out.println("4. You want to refuel a car which is in the garage.");
        System.out.println("5. You want to take a look your car collections in your garage.");
    }
    /**
     * print out the Car object arrays based on a customize car arrays.
     * @precondition: noun;
     * @postcondition: noun;
     * @param car
     * declare an int type i from number zero to car's length(not include car's length)
     *      display "Car NO." + (i+1) + "information: " + car's information which is in position i in car arrays;
     */
    public static void showCars(Car[] car)
    {   
        for (int i = 0; i < car.length; i++)
        {
            System.out.println("Car NO." + (i+1) + " information: " + car[i]);
        }
    }
    /**
     * This method allows users add a new Car object to the MyCar arrays.
     * Users can have two ways to add a car.
     * One is adding a customized car information, another one is adding a random car information based on the database.
     * The new Car will be added behind the orginal MyCar arrays.
     * @precondition: CarGarageDriving has a MyCar arrays;
     *                CarGarageDriving has a TmpCar arrays;
     * @postcondition: stated TmpCar arrays has gotten all same elements as initial MyCar arrays;
     *                 stated MyCar arrays has added an element in the end of its arrays;
     * declare a string variable enter; declare an it type variable year;
     * set up TmpCar arrays to a new arrays whose length equals to MyCar arrays' length;
     * declare an int i from number zero to MyCar's length(not include MyCar's length)
     *      set up the (i)th TmpCar's element same as (i)th MyCar's element;
     * set up MyCar arrays to a new arrays whose length equals to TmpCar arrays' length plus one;
     * declare an int i from number zero to TmpCar's length(not include TmpCar's length)
     *      Set up the (i)th MyCar's elememt same as (i)th TmpCar's element;
     * set up MyCar arrays last element as a default Car type object;
     * display "If you want to add a car by yourself please enter YES"
     * display "If you want to add a car randomly based on the information we saved please enter NO."
     * do the following steps
     *      display "Please enter Yes or NO."
     *      check if users enter the "YES" or "NO";
     *          if users enter neither of these two words that display "Wrong enter";
     *          if users enter "YES"
     *              System will request users to enter Make, Model, Color, and Year information for the new car;
     *              set up MyCar arrays' last element information based on what users entered;
     *              set up the VIN for this new car;
     *              display congratulation;
     *              break this loop;
     *          if users enter "NO"
     *              system will set up the information based on database for MyCar arrays' last new element;
     *              break this loop;
     * while ture;
     *                 
     */
    public static void addAcar()
    {
        String enter;
        int year;
        TmpCar = new Car[MyCar.length];
        
        for (int i = 0; i < MyCar.length; i++)
        {
            TmpCar[i] = new Car(MyCar[i]);
        }
        MyCar = new Car[TmpCar.length + 1];
        for (int i = 0; i < TmpCar.length; i++)
        {
            MyCar[i] = new Car(TmpCar[i]);
        }
        MyCar[MyCar.length - 1] = new Car();
        System.out.println("If you want to add a car by yourself please enter YES.");
        System.out.println("If you want to add a car randomly based on the information we saved please enter NO.");
        do
        {
            System.out.println("Please enter YES or NO.");
            enter = keyboard.nextLine();
            if ( !enter.toUpperCase().equals("YES") && !enter.toUpperCase().equals("NO") )
                System.out.println("Wrong enter.");
            if ( enter.toUpperCase().equals("YES"))
            {
                System.out.println("Please give the information about what kind of car you want to add.");
                System.out.println("Please enter the Make for the car.");
                enter = keyboard.nextLine();
                MyCar[MyCar.length - 1].setMake(enter);
                System.out.println("Please enter the Model for the car.");
                enter = keyboard.nextLine();
                MyCar[MyCar.length - 1].setModel(enter);
                System.out.println("Please enter the Color for the car.");
                enter = keyboard.nextLine();
                MyCar[MyCar.length - 1].setColor(enter);
                System.out.println("Please enter the Year for the car.");
                year = ReturnInt();
                MyCar[MyCar.length - 1].setYear(year);
                MyCar[MyCar.length - 1].setVin();
                System.out.println("Your new car is all set. Congratulation!!");
                break;
            }
            if (enter.toUpperCase().equals("NO"))
            {
                MyCar[MyCar.length - 1].SetUp();
                System.out.println("Your new car is all set. Congratulation!!");
                break;
            }

        }while (true);
    }
    /**
     * this method allows users to remove a Car object from MyCar arrays based on what number of car they enter;
     * @precondition: CarGarageDriving has a MyCar arrays;
     *                CarGarageDriving has a TmpCar arrays;
     *                GarGarageDriving has a returnNumber() method;
     * @postcondition: stated MyCar arrays has remove an element from its arrays;
     *                 stated TmpCar arrays has gotten all same elements as new MyCar arrays;
     * declare an int type variable carNumber and an int type variable j;
     * display "Please enter the car number you want to remove from following list."
     * set up carNumber's value by using returnNumber() method;
     * set up TmpCar arrays to a new arrays whose length equals to MyCar arrays' length;
     * declare an int i from number zero to MyCar's length(not include MyCar's length)
     *      set up the (i)th TmpCar's element same as (i)th MyCar's element when i is smaller or equal to carNumber minus one;
     *      set up the (i - 1)th TmpCar's element same as (i)th MyCar's element when i is greater than carNumber minus one;
     * set up MyCar arrays to a new arrays whose length equals to TmpCar arrays' length minus one;
     * declare an int i from number zero to MyCar's length(not include MyCar's length)
     *      Set up the (i)th MyCar's elememt same as (i)th TmpCar's element;
     * display "You have removed the car you want";
     */
    public static void removeAcar()
    {
        int carNumber,j;
        System.out.println("Please enter the car number you want to remove from following list.");
        carNumber = returnNumber();
        TmpCar = new Car[MyCar.length];
        for (int i = 0; i < MyCar.length; i++)
        {
            j = i;
            if (i > (carNumber-1)) 
                j = i-1;
            TmpCar[j] = new Car(MyCar[i]);
        }
        MyCar = new Car[TmpCar.length -1];
        for (int i =0; i < MyCar.length; i++)
        {
            MyCar[i] = new Car(TmpCar[i]);
        }
        System.out.println("You have removed num " + carNumber + " car.");
    }
    /**
     * this method allows users to remove a Car object from MyCar arrays based on num;
     * @precondition: CarGarageDriving has a MyCar arrays;
     *                CarGarageDriving has a TmpCar arrays;
     * @postcondition: stated MyCar arrays has remove an element from its arrays;
     *                 stated TmpCar arrays has gotten all same elements as new MyCar arrays;
     * declare an int type variable j;
     * set up TmpCar arrays to a new arrays whose length equals to MyCar arrays' length;
     * declare an int i from number zero to MyCar's length(not include MyCar's length)
     *      set up the (i)th TmpCar's element same as (i)th MyCar's element when i is smaller or equal to num minus one;
     *      set up the (i - 1)th TmpCar's element same as (i)th MyCar's element when i is greater than num minus one;
     * set up MyCar arrays to a new arrays whose length equals to TmpCar arrays' length minus one;
     * declare an int i from number zero to MyCar's length(not include MyCar's length)
     *      Set up the (i)th MyCar's elememt same as (i)th TmpCar's element;
     * display "You have removed the car you want";
     * @param num
     */
    public static void removeAcar(int num)
    {
        int j;
        TmpCar = new Car[MyCar.length];
        for (int i = 0; i < MyCar.length; i++)
        {
            j = i;
            if (i > (num-1)) 
                j = i-1;
            TmpCar[j] = new Car(MyCar[i]);
        }
        MyCar = new Car[TmpCar.length -1];
        for (int i =0; i < MyCar.length; i++)
        {
            MyCar[i] = new Car(TmpCar[i]);
        }

    }
    /**
     * This method allows users to run a Car object from MyCar arrays based on what number of car they enter;
     * after running the car, this method will changed the specific Car object's AverageSpeed and DrivingDistance;
     * if the car object run out of gas during this trip, the specific car object will be moved out of MyCar arrays;
     * @precondition: CarGarageDriving has a MyCar arrays;
     *                CarGarageDriving has a ReturnDouble() method;
     *                CarGarageDriving has a removeAcar(Car) method;
     *                CarGarageDriving has a returnNumber() method;
     * @postcondition: one of MyCar arrays' object had change its AverageSpeed, Otometer, TripOtometer, FuelTankSize, and DrivingDistance,
     *                 and it may be removed out of arrays if car object was out of gas in this trip;
     * declare one double type variable averagespeed; declare one double type variable drivingdistance;
     * declare one int type variable carNumber;
     * let users choose one of the car to drive from the garage MyCar arrays save as carNumber;
     * display the car users chose whose basic information, car's FuelTankSize, and car's FuelEconomy;
     * request users to enter available drivingdistance and averagespeed;
     * set up the MyCar (carNumber)th object's AverageSpeed as averagespeed;
     * set up the MyCar (carNumber)th object's DrivingDistance as drivingdistance;
     * if after driving car base on AverageSpeed and DrivingDistance the car object still has fuel in the tank
     *      display "Your car have come back to garage. Thank you for driving."
     * else
     *      remove this car object out of MyCar arrays;
     *      display "Your car have run out of gas. Your (carNumber)th car has been removed out of garage."
     */
    public static void runAcar()
    {
        double averagespeed, drivingdistance;
        int carNumber;
        System.out.println("Please enter the car's number you want to run from following list.");
        carNumber = returnNumber();
        System.out.println("Great, we got the car you want to drive. Let's see it's information");
        System.out.println(MyCar[carNumber - 1]);
        System.out.println("Its FuelTankSize is " + String.format("%.2f", MyCar[carNumber - 1].GetFuelTankSize()) + " gallons");
        System.out.println("Its FuelEconomy is " + String.format("%.2f", MyCar[carNumber - 1].GetFuelEconomy()) + " MGP");
        System.out.println("Please enter the AverageSpeed you want to drive.(Km/h)");
        averagespeed = ReturnDouble();
        System.out.println("Please enter the DrivingDistance you want to drive.(Km)"); 
        drivingdistance = ReturnDouble();
        MyCar[carNumber - 1].setUpTrip(averagespeed, drivingdistance);
        if (MyCar[carNumber - 1].driveCar())
        {
            System.out.println("Your car have come back to garage. Thank you for driving.");
        }
        else
        {
            removeAcar(carNumber);
            System.out.println("Your car have run out of gas on the trip, it had been removed from your garage.");
            System.out.println("You have removed num " + carNumber + " car.");
        }
        
    }
    /**
     * This method allows users to refule a car object in MyCar arrays;
     * @precondition: CarGarageDriving has a MyCar arrays;
     *                CarGarageDriving has a scan type variable keyboard;
     *                CarGarageDriving has a returnNumber() method;
     *                CarGarageDriving has a ReturnDouble() method;
     * @postcondition: one of MyCar arrays' object had change its FuelTankSize base on how many gallons users enter to refuel for it;
     * declare an int variable carNumber; declare a double variable refuelGas; declare a String variable enter;
     * let users choose one of the car to refuel from the garage MyCar arrays save as carNumber;
     * ask users how they want to refuel their car object;
     * if they want to refuel it until full size tank they should enter YES;
     *      refuel the car object which users have chosen to refuel its gas until its tanksize;
     *      display the car's tank is full;
     * if they want to customize the fuel size by themselves they can enter anything else except YES;
     *      ask users to enter the amount about how many gallons they want to refuel the gas save as refuelGas;
     *      refuel the car object which users have chosen to refuel refuelGas gallons gas in its tank;
     *      if the tank will be full after refueling, display the car's tank is full;
     *      if the tank is not full yet, display refuel succesfully;
     */
    public static void refuelAcar()
    {
        int carNumber;
        double refuelGas;
        String enter;
        System.out.println("Please enter the car number you want to refuel its gas from following list.");
        carNumber = returnNumber();
        System.out.println("This is how much gas this car have right now: " + String.format("%.2f", MyCar[carNumber - 1].GetFuelTankSize()) + " gallons.");
        System.out.println("This is what tank size this car have: " + String.format("%.2f", MyCar[carNumber - 1].GetTankSize()) + " gallons.");
        System.out.println("If you want to refuel it until full please enter yes, customsize the refuel amount please enter anything else.");
        enter = keyboard.nextLine();
        if (enter.toUpperCase().equals("YES"))
        {
            MyCar[carNumber - 1].setFuelTankSize(MyCar[carNumber - 1].GetTankSize());
            System.out.println("This car has been refueled, and its tank is full.");
        }
        else
        {
            System.out.println("Please enter how much gas you want to refuel for this car.");
            refuelGas = ReturnDouble();
            MyCar[carNumber - 1].setFuelTankSize(MyCar[carNumber - 1].GetFuelTankSize() + refuelGas);
            if (MyCar[carNumber - 1].getFuelLevel() <= 0)
                {
                    MyCar[carNumber - 1].setFuelTankSize(MyCar[carNumber - 1].GetTankSize());
                    System.out.println("This car has been refueled, and its tank is full.");
                }
            else
                System.out.println("This car has been refueled.");
        }
        
    }
    /**
     * Main method allows users to choose one of five menu choices to do the change for their car garage;
     * @precondition: CarGarageDriving has a ReturnInt() method;
     *                CargarageDriving has a MyCar arrays;
     *                CargarageDriving has a TmpCar arrays;
     *                CarGarageDriving has a showCars(Car) method;
     *                CargarageDriving has a ShowMenu() method;
     *                CargarageDriving has a ReturnIntMenu() method;
     *                CargarageDriving has a runAcar() method;
     *                CargarageDriving has a addAcar() method;
     *                CargarageDriving has a removeAcar() method;
     *                CargarageDriving has a refuelAcar() method;
     *                CargarageDriving has a showCars(Car) method;
     * @postcondition: delete all variables in the end of class;
     * @param args
     * declare a String type variable exit;
     * request users to enter a int type number which will be saved as GarageSize;
     * set up MyCar arrays' length to GarageSize;
     * set up TmpCar arrays' length to GarageSize;
     * declare an int type variable i from zero to GarageSize (not include GarageSize);
     *      set up the MyCar arrays' default information;
     * show users the car information in the MyCar arrays which is the garage;
     * do following steps:
     *      show users the choice menu;
     *      request users to choose one of the following menu choices
     *          based on what choice users have chosen, get in which method;
     *      ask users to choose if keep doing steps with this garage;
     *      if users say yes, repeat this loop;
     *          else exit;
     * while not exit;
     */
    public static void main(String[] args)
    {
        String exit;
        System.out.println("Please enter the size of Garage you want to contain cars. (enter int type of number)");
        GarageSize = ReturnInt();
        MyCar = new Car[GarageSize];
        TmpCar = new Car[GarageSize];
        for (int i = 0; i < GarageSize; i++)
        {
            MyCar[i] = new Car();
            MyCar[i].SetUp();
        }
        showCars(MyCar);
        do
        {
            ShowMenu();
            MenuChoice = ReturnIntMenu();
            switch (MenuChoice)
            {
                case 1:
                    runAcar();
                    break;
                case 2:
                    addAcar();
                    break;
                case 3:
                    removeAcar();
                    break;
                case 4:
                    refuelAcar();
                    break;
                case 5:
                    showCars(MyCar);
                    break;
            }
            System.out.println("If you want to use more menuchoice, please enter Yes.");
            System.out.println("If you want to quit this menu, please enter anything else.");
            exit = keyboard.nextLine();
        }
        while (exit.toUpperCase().equals("YES"));
        
    }

}