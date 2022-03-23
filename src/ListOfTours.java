import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class  ListOfTours {
    private ArrayList<Tour> tourList = new ArrayList<>();


    static final Comparator<Tour> MOST_BOOKED_ORDER;

       static {
           MOST_BOOKED_ORDER = new Comparator<Tour>() {
               @Override
               public int compare(Tour t1, Tour t2) {
                   return t1.compareTo(t2);
               }
           };
       }


       public Tour maxQuantityOfBookings() {
           return Collections.max(this.getTourList());
       }

       public double avgQuantityOfBookings() {
           double avgbook = 0;
               for(Tour t : getTourList()) {
               avgbook += t.getQuantityOfBookings();
           }
           return avgbook/getTourList().size();
       }


    public void addTour(Tour tour) {
        if (!findTour(tour)) {
            tourList.add(tour);
        } else {
            System.out.println("The tour is already in the bag");
        }
    }

    public boolean findTour(Tour tour) {
        for (Tour t : getTourList()) {
            if (t.equals(tour)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Tour> findTour(TourSpec tourSpec) {
        ArrayList<Tour> list = new ArrayList<>();
        for (Tour t : tourList) {
            if (tourSpec.equals(t.getTourSpec())) {
                list.add(t);
            }
        }
        return list;
    }

    public ArrayList<Tour> getTourList() {
        return tourList;
    }

    public void printListOfChosenTours() {
        System.out.println("I have " + tourList.size() + " tours in bag");
        for (int i = 0; i < tourList.size(); i++) {
            System.out.println((i + 1) + ". " + tourList.get(i));
        }
    }
}