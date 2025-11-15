import java.util.*;
import java.io.*;

//appliance setting up variables it works with 
public class appliance{
    private String name;
    private double watts;
    private double volts;
    private double current;
    private double cost;
    
    //constructor to create appliances (Setters)
    public appliance(String name, double watts, double volts, double current, double cost){
        this.name = name;
        this.watts = watts;
        this.volts = volts;
        this.current = current;
        this.cost = cost;
    }

    //Getter methods
    public String getName(){
        return name;
    }

    public double getWatts(){
        return watts;
    }

    public double getVolts(){
        return volts;
    }

    public double getCurrent(){
        return current;
    }

    public double getCost(){
        return cost;
    }



    

        

    public static void main(String[] args){
        int DAYS_TO_HOURS = 24;
        int WEEK_TO_DAYS = 7;
        int MONTH_TO_DAYS = 30;
        int YEAR_TO_MONTHS = 12;
        double HOURLY_RATE = 0.0;

        
        Scanner keyboard = new Scanner(System.in);
        ArrayList<appliance> allAppliances = new ArrayList<>();
        System.out.printf("HELLO WELCOME TO POWER SAVER\n");
        System.out.printf("What is the Hourly Rate per kws in your state:\n $");
        if(keyboard.hasNextDouble()){
            HOURLY_RATE = keyboard.nextDouble();
        }
        else{
            System.out.printf("Error:\nThe input give is not a valid currency(USD): EXAMPLE 1.23\n");
            System.exit(0);
        }

        System.out.println("Enter the name of an appliance you wish to track");
        keyboard.next();
        String name = keyboard.nextLine();

        System.out.println("Enter the Voltage(V) your device uses: ");
        double volts = keyboard.nextDouble();

        System.out.println("Enter the Current your device uses in Amps (1A=1000mA): ");
        double amps = keyboard.nextDouble();


        System.out.println("how many hours on average is this appliance on per day\nFormat(HH:MM)");
        keyboard.nextLine();//clean keyboard
        String time = keyboard.nextLine();
        String[] timeParse = time.split("\\s*:\\s*");
        //convert to int
        int hours = Integer.parseInt(timeParse[0]);
        int min = Integer.parseInt(timeParse[1]);


    }
}
