import composants.Boisson;
import composants.Espresso;

public class App {
    public static void main(String[] args) {
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
