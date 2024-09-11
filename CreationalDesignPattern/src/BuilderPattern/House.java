package BuilderPattern;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    private House(HouseBuilder houseBuilder) {
        this.foundation = houseBuilder.foundation;
        this.structure = houseBuilder.structure;
        this.roof = houseBuilder.roof;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
        this.hasGarden = houseBuilder.hasGarden;
    }

    @Override
    public String toString() {
        return "House [Foundation: " + foundation + ", Structure: " + structure +
                ", Roof: " + roof + ", Garage: " + hasGarage +
                ", Swimming Pool: " + hasSwimmingPool + ", Garden: " + hasGarden + "]";
    }

    // creating inner builder class
    static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public HouseBuilder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        // Build method to build final product
        public House build() {
            return new House(this);
        }
    }
}
