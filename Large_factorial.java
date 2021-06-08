package JavaCodes;

import java.util.Scanner;

public class Large_factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0 ; i<n; i++)
        {
            arr[i]=i;
        }
        long fact=1;

        for(int j=1 ; j<n ; j++)
        {
            fact = fact*arr[j];
        }
        System.out.println("Factorial is " +fact);
    }
}
