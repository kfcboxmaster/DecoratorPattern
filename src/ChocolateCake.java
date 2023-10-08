public class ChocolateCake extends Cake{
    @Override
    public String getDescription() {
        return "Chocolate Cake";
    }

    @Override
    public double getCost() {
        return 12.99;
    }

    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public double getWeight() {
        return 0.5;
    }
}
