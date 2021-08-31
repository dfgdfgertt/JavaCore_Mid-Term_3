import java.util.Scanner;

public class app {
    public static void main(String[] main) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nNhập một số bất kỳ(>=0):");
        int n = input.nextInt();
        if (monthCheck(n))
            System.out.format("\nTháng %d có %d ngày",n,days(n));
        else
            System.out.format("%d không là tháng trong năm",n);
    }

    public static int days(int month){
        if (month > 12 || month < 1)
            return 0;
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else
            return 28;
    }

    public static boolean monthCheck (int n){
        if (n >= 1 && n <= 12)
            return true;
        return false;
    }
}
