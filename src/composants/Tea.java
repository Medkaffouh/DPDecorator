package composants;

public class Tea extends Boisson{
    public Tea() {
        description="Tea";
    }

    @Override
    public double cout() {
        return 11;
    }
}
