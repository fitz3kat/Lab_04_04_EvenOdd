public class Main {
    public static void main(String[] args) {
        int number = 20;
        System.out.println("Is " + number + " even or odd? If the number is even, the remainder will be 0 when it is divided by 2.");
        int modulo = number % 2;
        System.out.println("The remainder when " + number + " is divided by 2 is " + modulo);
    }
}