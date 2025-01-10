package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (2 * (width + height));
    }

    public double diagonal() {
        return Math.sqrt((width * width) + (height * height));
    }

    public String toString() {
        return String.format("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n", this.area(), this.perimeter(),
                this.diagonal());
        // para exibiçao ja formatada.
        // sobrescrever o método toString da classe Object nas subclasses tem as
        // seguintes vantagens:
        // 1. Delegação
        // 2. Maior facilidade de debugging
        // 3. Organização de código.
    }

}
