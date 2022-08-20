package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> frutList;

    public Box (T...frutList) {
        this.frutList = new ArrayList<>(Arrays.asList(frutList));
    }

    public  double getWeight () {
       return frutList.stream()
                .map(Fruit::getweight)
                .reduce((x,y) ->  x + y)
               .get();


    }
    public static boolean compare (Box<Apple> a, Box<Orange> b) {
        if (a.getWeight() == b.getWeight()) {
            return true;
        }
        return false;
    }

    void add(List<? extends T> fruit) {
        frutList.addAll(fruit);

    }

    void Toempty(Box<? super T> box) {
        box.add(frutList);
        frutList.clear();
    }




}