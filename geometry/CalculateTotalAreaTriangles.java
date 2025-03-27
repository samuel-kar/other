package repetera.objects.geometry;

import java.util.Scanner;

public class CalculateTotalAreaTriangles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangle triangleOne = new Triangle();

        System.out.println("Enter width of triangle 1");
        double width1 = scanner.nextDouble();
        triangleOne.setWidth(width1);

        System.out.println("Enter height of triangle 1");
        double height1 = scanner.nextDouble();
        triangleOne.setHeight(height1);


        System.out.println("Enter width of triangle 2");
        double width2 = scanner.nextDouble();
        System.out.println("Enter height of triangle 2");
        double height2 = scanner.nextDouble();
        Triangle triangleTwo = new Triangle(width2, height2);

        scanner.close();

        double totalArea = triangleOne.calculateArea() + triangleTwo.calculateArea();

        System.out.println("Total area of two triangles: " + totalArea);
    }
}
