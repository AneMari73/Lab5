import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner inputUser = new Scanner(System.in);

        String hexDec;

        System.out.print("Enter a hexadecimal number: ");
        hexDec = inputUser.nextLine();

        if (hexDec.charAt(0)=='0' && hexDec.charAt(1)== 'x')
        {
          hexDec=hexDec.substring(2);
        }
        long newNum=0;
        newNum=convert(hexDec);
        System.out.println("Your number is "+ newNum+ " in decimal");


    }
    public static long convert(String input)               // I looked back at some old C++ code I had written at my prior college to use these functions.
    {
        long decVal=0;
        long length=input.length()-1;
        for(int i=0;i<input.length();i++){
            String temp=Character.toString(input.charAt(i)).toUpperCase();
            long dec=letterToInt(temp);

            decVal+=Math.pow(16,(length-i))*dec;
        }

        return decVal;
    }

    public static int letterToInt(String hex)
    {
        String numbers="1234567890";
        if(numbers.contains(hex))
        {
            return Integer.parseInt(hex);
        }else if(hex.equals("A"))
        {
            return 10;
        }else if(hex.equals("B"))
        {
            return 11;
        }else if(hex.equals("C"))
        {
            return 12;
        }else if(hex.equals("D"))
        {
            return 13;
        }else if(hex.equals("E"))
        {
            return 14;
        }else if(hex.equals("F"))
        {
            return 15;
        }
        return 69;
    }


}
