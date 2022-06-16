package decorateurs;

import composants.Boisson;

public class Chantilly extends DecorateurAbstrait{

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.7+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Chantilly";
    }
}
