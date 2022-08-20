package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Orange> oranges  = new Box<>(
                new Orange(),
                 new Orange(),
                 new Orange(),
                 new Orange()

        );

        Box<Apple> apples = new Box<>(
                new Apple(),
                new Apple(),
        new Apple()
        );
        Box<GoldenApple> Gapples = new Box<>(
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple()
        );
        System.out.println("Проверка равны ли коробки с яблоками и апельсинами: "+ Box.compare(apples,oranges));
        System.out.println("Вес коробки с яблоками: " + apples.getWeight());
        System.out.println("Вес коробки с апельсинами: " + oranges.getWeight());
        System.out.println("Вес коробки GoldenApple: " + Gapples.getWeight());
        Gapples.Toempty(apples);
        System.out.println("Вес коробки c яблоками после пополнения: " + apples.getWeight());
        System.out.println("Проверка равны ли коробки с яблоками и апельсинами: "+ Box.compare(apples,oranges));






    }
}
