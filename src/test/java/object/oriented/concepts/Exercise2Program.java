package object.oriented.concepts;

/*
In a home, there are multiple appliances. Each appliance consumes a certain amount of power when
“Switch on”. eg: Home can have FAN, Light, TV, Laptop, etc.
when "Switch on" they consume FAN-1 unit, Light - 2 units, TV-3 units etc power.
Create a method to calculate the amount of power consumption at any given point (current load).
Sort the devices in an apartment by one of (any) the parameters.
*/

class HomeAppliance{

    private static int FAN=1;
    private static int LIGHT=2;
    private static int TV=3;
    private static int LAPTOP=4;

    public static void switchON()
    {
        System.out.println("Power consumption : "+(FAN+LAPTOP+TV+LIGHT)+" unit");
    }

}

public class Exercise2Program {

    public static void main(String[] arg)
    {
        HomeAppliance.switchON();
    }
}

