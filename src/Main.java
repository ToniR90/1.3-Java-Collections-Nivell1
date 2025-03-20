import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        months.add(7 , new Month("August"));

        for(Month month : months){
            System.out.println(month.getName());
        }

        System.out.println();

        months.add(new Month("January"));
        months.add(new Month("June"));

        HashSet<Month> monthsHashSet = new HashSet<>(months);

        for(Month month : monthsHashSet){
            System.out.println(month.getName());
        }

        System.out.println();

        Iterator<Month> iterator = monthsHashSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}