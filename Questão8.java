import java.util.Scanner;
public class Questão8{
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      System.out.println("Valor?");
      int valor=in.nextInt();
      System.out.println("Valor????????????");
      int valor2=in.nextInt();
      while(valor2<=0){
        System.out.println("Sabe nem informar um valor hein");
        valor2=in.nextInt();
        System.out.println("Espero que seja um número bom amigo, espero");
      }
      double divisao=valor/valor2;
      System.out.println(divisao);
    }
}