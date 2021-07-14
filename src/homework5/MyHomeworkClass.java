package homework5;

public class MyHomeworkClass {
    public static void main(String[] args) {
        System.out.println(elevate(2,5));

    }

    public static int elevate(int number, int degree){
        if(degree == 0) {
            return 1;
        }
        return elevate(number,degree-1) * number;
    }
}
