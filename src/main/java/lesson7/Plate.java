package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int decreasedFood) {
        if (food < decreasedFood) {
            return false;
        } else {
            this.food -= decreasedFood;
            return true;
        }
    }

    public void info() {
        System.out.printf("Food in plate: %s%n", food);
    }
}
