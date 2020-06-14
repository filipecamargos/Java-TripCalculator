package ferreira;

public class Cruise implements Expense{

    //Istantiate a Destination
    Destination destination;

    //set teh destination = to the passed as parameter
    Cruise(Destination dest) {
        this.destination = dest;
    }

    //get the cost
    public float getCost() {
        float cost = 0.00f;

        //Switch according with the case in destination
        switch (destination){
            case Japan:
                cost = 3000.00f;
                break;
            case Europe:
                cost = 2000.00f;
                break;
            case Mexico:
                cost = 1000.00f;
                break;
            default:
                cost = 0.00f;
        }

        return  cost;
    }
}
