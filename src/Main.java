


public class Main {
    private static final TourSpec spec = new TourSpec(true, TypeOfTour.COMBINING);
    private static final TourSpec defSpec = new TourSpec(false, TypeOfTour.SOME);

    public static void main (String[]args) {
        Tour tour;


        ListOfTours chosenTour = new ListOfTours();
        tour = new Tour("Riga Old Town walking tour",6.16, 1.30f,377,"English",spec);
        chosenTour.addTour(tour);

        tour = new Tour("Ultimate Husky dog sled ride experience in Latvia", 78.84,3.00f, 445,"German",spec);
        chosenTour.addTour(tour);

        tour = new Tour("Delicious Food Tasting Adventure in Riga Central Market",32.35,2.30f,625,"Italian, English", defSpec);
        chosenTour.addTour(tour);


        System.out.println("Tour has maximum number of bookings"
                + chosenTour.maxQuantityOfBookings().toString());
        System.out.println("Average quantity of booking: " +
                chosenTour.avgQuantityOfBookings());

    }


}