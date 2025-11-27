import java.util.Scanner;

class Practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name to Reverse: ");
        String name = sc.nextLine();

        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }

        System.out.print("The Reversed Name is: ");
        System.out.println(reverse);
    }
}