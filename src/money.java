import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap tien USD");
        usd=scanner.nextDouble();
        double quydoi=usd*23000;
        System.out.println("gia tri vnd"+quydoi);
    }
}
