import java.util.Scanner;

public class GradeCalculator
{
public static void main(String args[])
{
     float eng, phy, chem, math, comp; 
     double total, average, percentage;
    Scanner op=new Scanner(System.in);
    
    System.out.println("Enter marks of five subjects:");
    System.out.print("Enter marks of English subjects:");
    eng=op.nextFloat();
    System.out.print("Enter marks of physics subjects:");
    phy=op.nextFloat();
    System.out.print("Enter marks of chemistry subjects:");
    chem=op.nextFloat();
    System.out.print("Enter marks of maths subjects:");
    math=op.nextFloat();
    System.out.print("Enter marks of computers subjects:");
    comp=op.nextFloat();

    total = eng + phy + chem + math + comp;
    average = (total / 5.0);
    percentage = (total / 500.0) * 100;

    System.out.println("Total marks ="+total);
    System.out.println("Average marks = "+average);
    System.out.println("Percentage = "+percentage);
}
}
