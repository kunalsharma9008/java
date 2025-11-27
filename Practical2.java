import java.util.Scanner;

class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (from hundred) for 5 subjects: ");

        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float m4 = sc.nextFloat();
        float m5 = sc.nextFloat();

        float sum = m1 + m2 + m3 + m4 + m5;
        float percentage = (sum / 500) * 100;

        System.out.println("The total marks obtained is: " + sum);
        System.out.println("The total percentage obtained is: " + percentage);
    }
}