package lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        Plate plate1 = new Plate(50);

        for (int i = 0; i < cats.length; i++) {
            int appetite = 6 + ((int) (Math.random() * 5));
            cats[i] = new Cat("cat" + i, appetite);
            cats[i].eat(plate1);
            System.out.println(cats[i].getSatiety());
        }
    }
}
