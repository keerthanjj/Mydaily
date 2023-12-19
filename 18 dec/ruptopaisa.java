import java.util.Scanner;

public class ruptopaisa {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the rupees");
        double rup=in.nextDouble();
        int a=(int)rup;
        double p=(rup-a)*100;
        System.out.println(a+" rupees "+p+" paisa");
    }
}
