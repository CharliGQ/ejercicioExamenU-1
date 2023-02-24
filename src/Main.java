import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        double n1, n2, div=0, res, res1;

        System.out.println("Ingrese dos numeros:");
        n1=entrada.nextDouble();
        n2=entrada.nextDouble();

        div=n1-n2;

        res=n1/div;
        res1=n2/div;

        System.out.println(res);
        System.out.println(res1);


    }
}
