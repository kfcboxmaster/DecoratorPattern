abstract class CakeDecorator extends Cake{
        protected Cake cake;

        public CakeDecorator(Cake cake) {
            this.cake = cake;
        }

        @Override
        public String getDescription() {
            return cake.getDescription();
        }

        @Override
        public double getCost() {
            return cake.getCost();
        }

        @Override
        public int getCalories() {
            return cake.getCalories();
        }

        @Override
        public double getWeight() {
            return cake.getWeight();
        }
    }

