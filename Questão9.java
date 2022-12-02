import java.util.Scanner;
public class Questão9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, i, result;
        for(i=1; i<11; i++){
            System.out.println("Informe o " + i +"°" + "número");
            num = in.nextInt();
            num = num + i;
        }
        result = num / 10;
        System.out.println("A média é " + result);
    }
}