
import java.util.Scanner;

public class Exe013 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        parentese();
    }

    static void parentese() {
        double a = 6*(3+2);
		double b = 6 * (3+2) + 2;
		double c = 2 + 3 * 6 / (2 + 4);
		double d = 2*8/(3+1);
		double e = 3+(16-2)/(2*(9-2));
		double f = 6/3 + 8/2;
		double g = (3+8/2)*4+3*2;
		double h = 6*3*3+6-10;
		double i = (10*8+3)*9;
        double j = -12*-4+3*-4;
        System.out.printf("a:%.1f, b:%.1f, c:%.1f, d:%.1f, e:%.1f, f:%.1f, g:%.1f, h:%.1f, i:%.1f, j:%.1f\n\n", a, b, c, d, e, f, g, h, i, j);
    }

}