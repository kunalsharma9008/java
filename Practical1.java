import java.util.Scanner;

class Practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char vow1 = sc.next().charAt(0);
        char vow = Character.toLowerCase(vow1);

        if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u') {
            System.out.println("Given character is a vowel");
        } else {
            System.out.println("Given character is a consonant");
        }
    }
}