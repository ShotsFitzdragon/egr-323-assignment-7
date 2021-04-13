
import java.util.Scanner;
public class TriangleInput {

    public static void main(String args[]) {

        String con = "N";
        do {

            System.out.println("Please enter 3 number lengths for each side of the" +
                    " triangle. Press enter after each number.");

            Scanner sideA = new Scanner(System.in);
            String sA = sideA.nextLine();
            System.out.println("Side A: " + (sA));
            double test;
            try {
                test = Double.valueOf(sA);
            } catch (NumberFormatException bad) {
                System.out.println("ERROR! “This is not a number.  Please type a number");
                System.exit(0);
            }
            double s1 = Double.valueOf(sA);
            if (s1 <= 0){
                System.out.println("ERROR! The lengths of the sides of the triangle must be positive");
                System.exit(0);
            }

            Scanner sideB = new Scanner(System.in);
            String sB = sideB.nextLine();
            System.out.println("Side B: " + (sB));
            try {
                test = Double.valueOf(sB);
            } catch (NumberFormatException bad) {
                System.out.println("ERROR! Non-numerical value has been entered. (Side B)");
                System.exit(0);
            }
            double s2 = Double.valueOf(sB);
            if (s2 <= 0){
                System.out.println("ERROR! The lengths of the sides of the triangle must be positive");
                System.exit(0);
            }

            Scanner sideC = new Scanner(System.in);
            String sC = sideC.nextLine();
            System.out.println("Side C: " + (sC));
            try {
                test = Double.valueOf(sC);
            } catch (NumberFormatException bad) {
                System.out.println("ERROR! Non-numerical value has been entered. (Side C)");
                System.exit(0);
            }
            double s3 = Double.valueOf(sC);
            if (s3 <= 0){
                System.out.println("ERROR! The lengths of the sides of the triangle must be positive");
                System.exit(0);
            }

            //**********************************************************************
            //*********Now determining which type of triangle***********************

            Triangle triangle = new Triangle(s1, s2, s3);
            if (!triangle.isTriangle()) {
                System.out.println("Error, not a valid triangle!");
            } else { //check if invalid, else check for what type it is
                if (triangle.isScalene()) {
                    System.out.println("The triangle is SCALENE!");
                } else if (triangle.isEquilateral()){
                    System.out.println("The triangle is EQUILATERAL!");
                } else {
                    System.out.println("The triangle is ISOSCELES!");
                }
            }

            System.out.println("Continue? (Y/N): ");
            Scanner conValue = new Scanner(System.in);
            con = conValue.next();

        } while(con.equalsIgnoreCase("Y"));
    }
}