import java.util.Scanner;

/**
 * Created by Nick on 26.10.2015.
 */
public class main {

    public static void main(String args[])
    {
        long temp1=0,temp2=0;
        boolean rightRatio=false;
        Scanner sc = new Scanner(System.in);
        while(!rightRatio) {
            System.out.println("Enter Upper Number and Lower Number");
            temp1 = sc.nextLong();
            temp2 = sc.nextLong();
            if (temp1 > temp2)
                rightRatio = true;
            else
                System.out.println("Sorry wrong ratio.");
        }
        BinaryNumber Upper = new BinaryNumber(temp1);
        BinaryNumber Lower = new BinaryNumber(temp2);
        BinaryNumber.FirstCompare(Upper.binaryNumber,Lower.binaryNumber,Lower.number);
        sc.close();
    }


}
