import java.util.Scanner;
public class Questão13{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, acum = 0, calc = 0;
        System.out.println("Informe o primeiro número");
        n1 = in.nextInt();
        System.out.println("Informe o segundo número");
        n2 = in.nextInt();
        while(n1 <= n2){
            acum = acum + n1;
            n1++;
            calc++;
        }
        System.out.println("O resultado é: " + acum/calc);
    }
}