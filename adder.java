import java.util.Scanner;
class adder { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input1 = "); int a = sc.nextInt();
        System.out.print("input2 = "); int b = sc.nextInt();
        System.out.print("Answer = "+(a+b));
    }
}