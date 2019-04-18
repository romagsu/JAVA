import by.gsu.pms.*;

public class Runner {

    public static void main(String[] arg) {
        int maxTotalExpenses=0;
        BusinessTrip[] businessTrips = {
                new BusinessTrip("Anton Slutsky", 50000, 5),
                null,
                new BusinessTrip("Andrey Nosov", 55000, 6),
                new BusinessTrip("Nikolay Sokolov", 48000, 5),
                new BusinessTrip("Dmitry Gagarin", 61000, 3),
                new BusinessTrip("Pavel Shishkin", 56700, 7),
                new BusinessTrip()
        };

        for (BusinessTrip item : businessTrips) {
            if (item != null) {
                item.show();
            }
            System.out.println();
        }

        businessTrips[6].setTransport(55);

        System.out.println("Duration = "+(businessTrips[2].getDays()+businessTrips[3].getDays())+"\n");

        for (BusinessTrip item : businessTrips){
            System.out.println(item);
            System.out.println();
        }
        int sum = 0;
        for (BusinessTrip item : businessTrips){
            if (item != null){
                sum += item.getTotal();
            }

        }
        System.out.println("Sum of the total expenses = "+ Byn.toBYN(sum));
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                if (businessTrip.getTotal() > maxTotalExpenses) {
                    maxTotalExpenses = businessTrip.getTotal();
                }
            }
        }

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                if (businessTrip.getTotal() > maxTotalExpenses) {
                    maxTotalExpenses = businessTrip.getTotal();
                }
                if (businessTrip.getTotal() == maxTotalExpenses) {
                    System.out.println("Accoutnt with max total: "+businessTrip.getAccount());
                }
            }
        }

    }
}
