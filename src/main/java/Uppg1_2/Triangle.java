package Uppg1_2;
/*
Skapa en klass Triangle med tre sidlängder sideA, sideB, sideC (alla double).
Fälten ska vara private, med getters och setters.

Skapa en metod perimeter() som returnerar omkretsen.

Skapa en metod isValidTriangle() som returnerar true
om triangelolikheten är uppfylld
(summan av två sidor måste alltid vara större än den tredje sidan), annars false.

Skapa en metod triangleType() som returnerar en String:
"Liksidig" (alla sidor lika),
"Likbent" (två sidor lika) eller
"Oliksidig" (alla olika).
Testa med minst fyra olika trianglar,
inklusive en ogiltig,
och skriv ut resultatet av alla metoder.

 */
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
