package Builder;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Dog ALIK = new Dog.Builder()
                .withName("Alík")
                .withAge(10)
                .withType("Labrador")
                .withToys(List.of("Míček", "Kost"))
                .build();
        System.out.println(ALIK.toString());

    }
}
