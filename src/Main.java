import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double f,c;
        Scanner input = new Scanner(System.in);

        System.out.println("Please input temperature in celsius: ");
        c = input.nextDouble();

        f = (c * 1.8) + 32;
        System.out.println(c + " celsius is " + f + " in fahrenheit.");
    }
}