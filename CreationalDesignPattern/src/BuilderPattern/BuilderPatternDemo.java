package BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Now creating house with all features
        House luxuxryHouse = new House.HouseBuilder()
                .setFoundation("Concrete")
                .setStructure("Wood and Brick")
                .setRoof("Tiles")
                .setHasGarage(true)
                .setHasGarden(true)
                .setHasSwimmingPool(true)
                .build();

        System.out.println(luxuxryHouse);

        House basicHouse = new House.HouseBuilder()
                .setFoundation("Concrete")
                .setStructure("Wood")
                .setRoof("Shingles")
                .build();

        System.out.println(basicHouse);
    }
}
