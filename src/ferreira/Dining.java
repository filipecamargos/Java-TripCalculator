package ferreira;

public class Dining implements Expense{

    //Instantiate Destination and create a variable for nights
    Destination dest;
    int nights;

    //Constructor
    public Dining(Destination dest, int nights) {
        //Set the value passed in this constructor when this class is instantiated
        this.dest = dest;
        this.nights = nights;
    }

    //This Method will return the total for Dining
    public float getCost() {

        float value;

        //Switch for what is the case for destination
        switch (dest) {
            case Europe:
                value = 20.00f * nights;
                break;
            case Japan:
                value = 30.00f * nights;
                break;
            case Mexico:
                value = 10.00f * nights;
                break;
            default:
                value = 0.00f;
        }
        return value;
    }




}
