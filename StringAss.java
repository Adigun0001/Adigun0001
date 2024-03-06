package string2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StringAss {
    private static final DecimalFormat dfTwoDP = new DecimalFormat("0.00");
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name");
        String name = scanner.nextLine();
         //String name = new String("Opeyemi");
         System.out.println("The student name is "+name);

        System.out.println("Enter the score for Maths:");
        float Maths= scanner.nextFloat();
        System.out.println("Enter the score for English:");
        float English = scanner.nextFloat();
        System.out.println("Enter the Score for Science:");
        float Science = scanner.nextFloat();
        System.out.println("Maths: "+dfTwoDP.format(Maths));
        System.out.println("English "+dfTwoDP.format(English));
        System.out.println("Science "+dfTwoDP.format(Science));
        Float Average = (Maths+English+Science)/3;
        System.out.println("The average score for "+name+" is: "+dfTwoDP.format(Average));


       }


}


