import java.util.Scanner;


public class ScannerMethod {

    static double area;



    void calculateShape(){
        Scanner typeIn = new Scanner(System.in);

        System.out.print("Engineer: Please input the length of the box: ");
        int length = typeIn.nextInt();
        System.out.print("Engineer: Please input the breadth of the box: ");
        int breadth = typeIn.nextInt();


        
        int perimeter = 2 * (length * breadth);
        area = length * breadth;


        System.out.println("The perimeter of the box is\t " + perimeter + "cm");
        System.out.println("The area of the box is\t " + area + "cm2");

        System.out.println("_________________________");



        
        Scanner typeIn2 = new Scanner(System.in);
        System.out.print("Engineer: Please input the base of the Triangle: ");
        double base = typeIn2.nextDouble();
        System.out.print("Engineer: Please input the height of the Triangle: ");
        double height = typeIn2.nextDouble();

        area = 0.5 * base * height;

        System.out.println("The arae of the Triangle is: " + area + "cm2");
        System.out.println("_____________________");



        typeIn.close();
        typeIn2.close();
    }
    public static void main(String[] args) {
        ScannerMethod Calculate = new ScannerMethod();
        Calculate.calculateShape();
    }
}
