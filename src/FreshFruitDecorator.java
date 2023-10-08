class FreshFruitDecorator extends CakeDecorator {
    public FreshFruitDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Fresh Fruit";
    }

    @Override
    public double getCost() {
        return cake.getCost() + 5.00;
    }

    @Override
    public int getCalories() {
        return cake.getCalories() + 50;
    }

    @Override
    public double getWeight() {
        return cake.getWeight() + 0.2;
    }
}
