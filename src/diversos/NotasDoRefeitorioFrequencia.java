package diversos;

public class NotasDoRefeitorioFrequencia {

    public static void main(String[] enquete){
        int[] notas = {1,2,3,4,5,5,4,3,3,2,1,1,1,1,3,4,5,2,2,2,3,3,3,3,90};
        int[] frequencia = new int[6];

        for(int perguntas = 0; perguntas<notas.length;perguntas++){
            try {
                ++frequencia[notas[perguntas]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("Respostas invalida" + "d] = %d%n%n", perguntas, notas[perguntas]);
            }
        }

        System.out.printf("%s\t%10s%n", "NOTAS", "FREQUENCIA");

        for(int valor=0; valor<frequencia.length;valor++){
            System.out.printf("%d\t%10d%n", valor, frequencia[valor]);
        }

    }
}
