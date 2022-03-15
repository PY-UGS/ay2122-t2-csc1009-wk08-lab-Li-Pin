import java.util.Scanner;

public class Lab8_Qn1_CircleWithException {
    private double radius;
    private double area;
    private double diameter;
    private static final double PI = 3.14159;
    private static boolean repeat = true;
    private static boolean repeat1 = true;

    public Lab8_Qn1_CircleWithException() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException{
        if (radius <= 0) throw new IllegalArgumentException("***Radius should be a positive non-zero number. Please try again.***\n");
        else {
            this.radius = radius;
            repeat = false;
        }
    }

    public double getArea() throws Exception {
        area = PI * radius * radius;
        if (area > 1000) throw new Exception("***Area is larger than 1000, please try a smaller radius value.***\n");
        else {
            System.out.println("Area is: " + area);
            repeat1 = false;
            return area;
        }
    }

    public double getDiameter() {
        diameter = 2 * radius;
        return diameter;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Lab8_Qn1_CircleWithException circle1 = new Lab8_Qn1_CircleWithException();

        while (repeat1){
            while (repeat) {
                try {
                    System.out.println("Please enter the radius of a circle:");
                    double radius = input.nextDouble();
                    circle1.setRadius(radius);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } 
            }
    
            repeat = true;

            try {
                circle1.getArea();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        input.close();
    }
}