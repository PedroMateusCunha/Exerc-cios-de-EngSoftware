import java.util.Scanner;

public class Exe012 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        resultado();
    }

    static void resultado() {
        float A1 = (4/2)+(2/4), A2 = 4/2+2/4;
        float B1 = 4/(2+2)/4, B2 = 4/2+2/4;
        float C1 = (4+2)*2-4, C2 = 4+2*2-4;
        if (A1 == A2) {
            System.out.println("A1=A2");
            
        }else{
            System.out.println("A1!=A2");
        }

        if (B1 == B2) {
            System.out.println("B1=B2");
            
        }else{
            System.out.println("B1!=B2");
        }

        if (C1 == C2) {
            System.out.println("C1=C2\n\n");
            
        }else{
            System.out.println("C1!=C2\n\n");
        }

        System.out.printf("A1:%f, A2:%f, B1:%f, B2:%f, C1:%f, C2:%f\n", A1,A2,B1,B2,C1,C2);
    }



}