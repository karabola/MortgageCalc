import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Principal=100000
        //Annual Interest Rate=3.92
        //Period (years)=30
        //Mortgage??

        final int month_In_Year=12;
        final int percent =100;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Principal: ");
        int principal=scanner.nextInt();

        System.out.print("Annual_Interest_Rate: ");
        Float annualInterest=scanner.nextFloat();
        Float monthInterest=annualInterest/percent/month_In_Year;


        System.out.print("Period: ");
        int period=scanner.nextInt();
        int periodInMonth=period*month_In_Year;

        double Mortgage=principal*(monthInterest*(Math.pow((1+monthInterest),periodInMonth)))/((Math.pow((1+monthInterest),periodInMonth))-1);
        String currency=NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage is "+currency);


    }
}

