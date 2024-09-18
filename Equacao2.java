import java.util.Scanner;
public class Equacao2
{
    public static void main(String[] args)
    {
        double A,B,C, X1, X2, delta;
        Scanner scan = new Scanner(System.in);
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        delta = Math.pow(B, 2.) -4. * A * C;
        X1 = (-B + Math.sqrt(delta)) / (2.*A);
        X2 = (-B - Math.sqrt(delta)) / (2.*A);
        if (delta<0){
            System.out.printf("nao ha raiz real\n");
        } 
        else if (X1==X2){
             System.out.printf("%.4f\n",X1);
        }
        else{
            System.out.printf("%.4f %.4f\n", X1, X2);
        }
    }
}    