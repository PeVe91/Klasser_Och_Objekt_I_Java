package uppg1_2;
//SENASTE KÖRBARA VERSION: Commit e981ae4

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }


    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    //--------------------------------------------------------------
    public boolean isValidTriangle(Triangle t) {
        return (t.sideA + t.sideB > t.sideC) &&
                (t.sideA + t.sideC > t.sideB) &&
                (t.sideB + t.sideC > t.sideA);
    }

    public double perimeter(Triangle t) {
        return t.sideA + t.sideB + t.sideC;
    }

    public String triangleType(Triangle triangle) {
        String result;
        double a = triangle.getSideA();
        double b = triangle.getSideB();
        double c = triangle.getSideC();

        if (a == b && b == c)
            result = "Equilateral Triangle";
        else if (a == b || a == c || b == c)
            result = "Isosceles Triangle";
        else
            result = "Scalene Triangle";
        return result;
        //--------------------------------------------------------------
    }
}




