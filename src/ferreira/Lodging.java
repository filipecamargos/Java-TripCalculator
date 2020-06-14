package ferreira;

public class Lodging implements Expense {

    //variable
    Destination dest;
    int nights;

    //Set the variables with the constructor
    Lodging(Destination dest, int nights) {
        this.dest = dest;
        this.nights = nights;
    }

    //Calculate the value of staying with pocertanges

    public float getCost() {
        float value = 0.00f;
        switch (dest) {

            case Europe:
                value = (200.00f * nights) * 1.10f;
                break;
            case Japan:
                value = (300.00f * nights) * 1.30f;
                break;
            case Mexico:
                value = 100.00f * nights;
                break;
            default:
                value = 0.0f;
        }
        return value;
    }
}
