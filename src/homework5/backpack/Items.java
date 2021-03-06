package homework5.backpack;

public class Items {
    private int weight;
    private int value;

    public Items(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{ weight=" + weight +
                ", value=" + value +
                '}';
    }
}
