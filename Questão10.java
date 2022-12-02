import java.util.Scanner;
public class Questão10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] notas = new int[4];
        int media = 0, soma = 0;
        for(int i=0; i< notas.length; i++){
            System.out.println("Informe a nota:");
            notas[i] = in.nextInt();
            soma += notas[i];
        }
        media = soma/4;
        if(media >= 6){
            System.out.println("PARABÉNS! Você foi aprovado! Com a média de: " + media);
        }else{
            System.out.println("Você foi reprovado! Com a média de: " + media);
        }
    }
}