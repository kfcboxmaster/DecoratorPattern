class CustomDecorator extends CakeDecorator {
    private String customDescription;
    private double customCost;
    private int customCalories;
    private double customWeight;

    public CustomDecorator(Cake cake, String customDescription, double customCost, int customCalories, double customWeight) {
        super(cake);
        this.customDescription = customDescription;
        this.customCost = customCost;
        this.customCalories = customCalories;
        this.customWeight = customWeight;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", " + customDescription;
    }

    @Override
    public double getCost() {
        return cake.getCost() + customCost;
    }

    @Override
    public int getCalories() {
        return cake.getCalories() + customCalories;
    }

    @Override
    public double getWeight() {
        return cake.getWeight() + customWeight;
    }
}

