package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println();
        System.out.println("Enter rectangle width and height");

        Rectangle rectangle;
        rectangle = new Rectangle();

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.err.println(rectangle); // já chama o toString por padrão. assim, está chamando o toString sobreposto,
                                       // com os dados formatadinhos

        sc.close();
    }
}
