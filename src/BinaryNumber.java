/**
 * Created by Nick on 26.10.2015.
 */
public class BinaryNumber {

    static long counter=0;

    long number;
    String binaryNumber;

    BinaryNumber(Long number)
    {
        this.binaryNumber=Long.toBinaryString(number);
        this.number=number;
        System.out.println(this.number + " in binary system "+this.binaryNumber);
    }
    //первая часть алгоритма
    static void FirstCompare(String upperBinaryNumber,String lowerBinaryNumber , long lowerNumber)
    {
        String tempStr;
        long upperPrefix,temp;
        tempStr=upperBinaryNumber.substring(0 ,lowerBinaryNumber.length());
        upperPrefix=Long.parseLong(tempStr,2);
        if (upperPrefix<lowerNumber) {
            tempStr = upperBinaryNumber.substring(0, lowerBinaryNumber.length()+1);
            upperPrefix = Long.parseLong(tempStr, 2);
        }
        temp=upperPrefix-lowerNumber;
        counter+=temp/2;
        if(temp%2==1)
            counter++;
        System.out.println("First stage takes " + counter + " actions");
        OtherCompares(upperBinaryNumber,tempStr);
    }
    //вторая часть
    static void OtherCompares(String upperBinaryStr,String lowerBinaryStr)
    {
        int currentPosition = lowerBinaryStr.length()-1;
        while(currentPosition<upperBinaryStr.length()-1)
        {
            currentPosition++;
            counter++;
            if(upperBinaryStr.charAt(currentPosition)=='1')
            {
                counter++;
                lowerBinaryStr+="1";
            }
            else
            {
                lowerBinaryStr+="0";
            }

        }
        System.out.println("Total : "+counter+" actions");
    }

}
