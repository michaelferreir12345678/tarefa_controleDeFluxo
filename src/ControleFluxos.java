import java.util.Scanner;

public class ControleFluxos {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        CalculoMediaGeral aluno1 = new CalculoMediaGeral();

        System.out.println("Insira a nota 1");
        Double nota1 = s.nextDouble();
        aluno1.setNota1(nota1);

        System.out.println("Insira a nota 2");
        Double nota2 = s.nextDouble();
        aluno1.setNota2(nota2);

        System.out.println("Insira a nota 3");
        Double nota3 = s.nextDouble();
        aluno1.setNota3(nota3);

        System.out.println("Insira a nota 4");
        Double nota4 = s.nextDouble();
        aluno1.setNota4(nota4);

        Double mediaAluno1 = aluno1.calculaMedia();
        String resultadoAluno1 = aluno1.resultadoAprovacao(mediaAluno1);

        System.out.println("Olá a média do aluno foi: "+mediaAluno1+". Sendo assim, o aluno está "+resultadoAluno1);
    }
}
