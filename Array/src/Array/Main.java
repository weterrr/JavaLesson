package Array;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[] {1, 3, 5, 7, 11};
        int A = number[0];
        number[0] = number[number.length - 1];
        number[number.length - 1] = A;
        int length = number.length;
        int B = length / 2;
        System.out.println(number[0]+number[B]);
    }
}
