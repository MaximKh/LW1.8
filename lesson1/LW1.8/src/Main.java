/**
 * Created by Maxim on 28.09.2015.
 */
class Hangar {
    int width;
    int length;

    public Hangar(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int square() {
        return this.width * this.length;
    }

    public void print() {
        System.out.println(this.width + "*" + this.length + "=" + this.square());
    }

}

public class Main {
    static int n = 5; //Количество ангаров

    public static void main(String[] args) {
        Hangar stock[] = new Hangar[]{
                new Hangar(5, 1),
                new Hangar(4, 2),
                new Hangar(3, 3),
                new Hangar(2, 4),
                new Hangar(1, 5)
        };
        int sum = 0;
        for (int i = 0; i < n; i++) { //Поиск общей площади
            sum += stock[i].square();
            stock[i].print();
        }
        System.out.println("Square=" + sum);

    }
}
