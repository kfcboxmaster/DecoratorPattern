class NuttyCrunchDecorator extends CakeDecorator {
    public NuttyCrunchDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Nutty Crunch";
    }

    @Override
    public double getCost() {
        return cake.getCost() + 4.50;
    }

    @Override
    public int getCalories() {
        return cake.getCalories() + 120;
    }

    @Override
    public double getWeight() {
        return cake.getWeight() + 0.15;
    }
}






