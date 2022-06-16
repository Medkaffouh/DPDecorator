import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;
import decorateurs.Caramel;
import decorateurs.Chantilly;
import decorateurs.Chocolat;
import decorateurs.Vanille;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
/*
//Explication:

        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------------");
        // Decoré avec le chocolat
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------------");
        boisson = new Vanille(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------------");
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------------");
*/

        Boisson boisson = new Chantilly(new Caramel(new Chocolat(new Chantilly(new Chocolat(new Vanille(new Sumatra()))))));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}
