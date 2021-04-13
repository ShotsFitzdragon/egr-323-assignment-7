public class Triangle
{

    private boolean isTriangle = false;
    private boolean isEquilateral = false;
    private boolean isScalene = false;
    private boolean isIsosceles = false;
    private double s1;
    private double s2;
    private double s3;

    //******************************************************************
    public Triangle(double sideA, double sideB, double sideC){
        this.s1 = sideA;
        this.s2 = sideB;
        this.s3 = sideC;
    }
    //******************************************************************
    public boolean isTriangle() {
        double maxSide = Math.max(this.s1, Math.max(this.s2, this.s3));
        if (maxSide < this.s1 + this.s2 + this.s3 - maxSide ) {
            isTriangle = true;
        }
        return isTriangle;
    }
    //******************************************************************
    public boolean isEquilateral() {
        if (s1 == s2 && s1 == s3)  {
            isEquilateral = true;
        }
        return isEquilateral;
    }
    //******************************************************************
    public boolean isScalene() {
        if ( (s1 != s2 && s1 != s3 && s2 != s3) ) {
            isScalene = true;
        }
        return isScalene;
    }
    //******************************************************************
    public boolean isIsosceles() {
        if (!isScalene()) {
            isIsosceles = true;
            System.out.println("The triangle is ISOSCELES!");
        }
        return isIsosceles;
    }

}