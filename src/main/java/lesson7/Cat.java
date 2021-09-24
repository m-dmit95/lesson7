package lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetite);
    }
}
