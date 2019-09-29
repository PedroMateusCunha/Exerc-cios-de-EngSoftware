public class Quadrado {
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double area(){
        return lado * lado;
    }

    public double perimetro(){
        return 4 * lado;
    }

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(4);
        Quadrado q3 = new Quadrado(5);

        System.out.println("Área: " + q1.area() + "; Perímetro: " + q1.perimetro());
        System.out.println("Área: " + q2.area() + "; Perímetro: " + q2.perimetro());
        System.out.println("Área: " + q3.area() + "; Perímetro: " + q3.perimetro());

    }
}