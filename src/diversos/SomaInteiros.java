package diversos;//some inteiros IMPARES de 1 a 99 utilizando o FOR, assuma que as variaveis de inteiro sum e count  foram declaradas

public class SomaInteiros {
    public static void main (String[] args) {
        var sum = 0;
        int count;
        for (count = 1; count <= 99; count+=2){
            sum = sum + count;

        }
        System.out.printf("%n%d", sum);
    }
}
