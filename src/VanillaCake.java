public class VanillaCake extends Cake{
    @Override
    public String getDescription() {
        return "Vanilla Cake";
    }

    @Override
    public double getCost() {
        return 10.99;
    }

    @Override
    public int getCalories() {
        return 300;
    }

    @Override
    public double getWeight() {
        return 0.4;
    }
}
