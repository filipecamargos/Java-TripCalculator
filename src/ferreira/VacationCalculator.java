package ferreira;
import java.awt.image.CropImageFilter;
import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {

    public static void main(String[] args) {
        //instantiate this object
        VacationCalculator vc = new VacationCalculator();

        //Calculate the some cost
        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 5);
        float europeCost = vc.calculateVacationCost(Destination.Europe, 5);

        //Print it out the results
        System.out.println("Bellow are the Costs:");
        System.out.println("The total Cost to Japan: " + japanCost);
        System.out.println("The total Cost to Mexico: " + mexicoCost);
        System.out.println("The total Cost to Europe: " + europeCost);

    }

    public float calculateVacationCost(Destination dest, int nights) {

        //total cost
        float total = 0.00f;

        //declare a List
        List<Expense> place = new ArrayList<Expense>();

        //Add places to it with numbers of nights
        place.add(new Cruise(dest)); //send destination to cruse
        place.add(new Dining(dest, nights)); //send destination and nights to Dining
        place.add(new Lodging(dest, nights));

        //Cruise cruise = new Cruise(dest);
       // return cruise.getCost();

        total = tallyExpenses(place);
        return total;


    }

    float tallyExpenses(List<Expense> expenses)
    {
        float total = 0.00f;
        //Loop thru the list and add the values.
        for (Expense exp : expenses) {
            total += exp.getCost();
        }
        return  total;
    }
}
