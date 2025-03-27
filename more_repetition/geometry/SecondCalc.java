package repetera.objects.geometry;

import java.util.Scanner;

public class SecondCalc {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        SecondCalc uff = new SecondCalc();

        Triangle firstTriangle = uff.getTriangle();
        Triangle secondTriangle = uff.getTriangle();

        uff.scanner.close();

        double area = uff.calculateTotalArea(firstTriangle, secondTriangle);

        System.out.println("Total area of the two triangles are: " + area);

    }

    public Triangle getTriangle(){

        System.out.println("Enter width of triangle");
        double width = scanner.nextDouble();

        System.out.println("Enter height of triangle");
        double height = scanner.nextDouble();



        return (new Triangle(width, height));

    }

    public double calculateTotalArea(Triangle firstTriangle, Triangle secondTriangle){
        return (firstTriangle.calculateArea()+secondTriangle.calculateArea());
    }

}
