package array;

public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(4);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        for (int i = 0; i < 6; i++) {
            arr.remove(0);
        }
        System.out.println(arr);
    }
}
