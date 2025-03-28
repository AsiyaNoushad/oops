import java.util.Scanner;
public class AddComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first complex number:\n");
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();
        System.out.println("\nenter the Second complex number:\n");
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();
        System.out.println("\nSum of complex number:");
        int sum_of_real = real1+real2;
        int sum_of_img = img1+img2;
        System.out.println(sum_of_real+"+"+sum_of_img+"i");
        sc.close();
    }
}
