package decorateurs;

import composants.Boisson;

public class Vanille extends DecorateurAbstrait{

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.9+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Vanille";
    }
}
