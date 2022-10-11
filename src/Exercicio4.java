import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        java.util.Scanner nota = new Scanner(System.in);
        float n1, n2, n3, n4, mf;

        System.out.print("Nota primeiro bimestre  ");
        n1 = nota.nextFloat();

        System.out.print("Nota segundo bimestre  ");
        n2 = nota.nextFloat();

        System.out.print("Nota terceiro bimestre  ");
        n3 = nota.nextFloat();

        System.out.print("Nota quarto bimestre  ");
        n4 = nota.nextFloat();

        nota.close();

        mf = (n1 + n2 + n3 + n4) / 4;

        System.out.print("A sua média é " + mf);

    }

}
