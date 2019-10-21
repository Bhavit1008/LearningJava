package DSA;

import java.util.Scanner;

/**
 * Created by Bhavit on 12-09-2019.
 */
public class Max {
    public static void main(String args[])
    {
        int []data = new int[5];
        // create intance variable
        int temp=0,j=0,ans,i;
        Scanner s = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            data[i] = s.nextInt();
        }
        for(i=0;i<5;i++)
        {
            System.out.print(data[i]+" ");
        }
        int max = 0;
        int second_max=0;
        for( i=0;i<5;i++)
        {
            if(data[i]>max){
                max = data[i];
                i++;
            }
        }

        for( i = 0; i < 5; i++){
            if(data[i] > max){
                second_max = max;
                max = data[i];
            } else if (data[i] > second_max
                    && data[i] < max){
                second_max = data[i];
            }
        }

        System.out.println("second_max : "+max);
        System.out.println("second_max : "+second_max);

    }
}
