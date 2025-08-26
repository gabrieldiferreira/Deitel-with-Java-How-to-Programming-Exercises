package diversos;

import java.security.SecureRandom;

public class Craps {
    //GERADOR DE DADOS SEGURO
    private static final SecureRandom secureRandom = new SecureRandom();

        //ESTADO DO JOGO
        private enum Status{ CONTINUE, WON, LOST };
        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_LEVEN = 11;
        private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0; //meus pontos
        Status gameStatus; //pode conter {CONTINUE, WON, LOST}

        int somaDosDados = DadoLancado();

        switch(somaDosDados){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = somaDosDados;
                System.out.printf("%d%n", myPoint);
                break;
        }
        //Se meus status for continar, eu irei continuar novamente
        while (gameStatus  == Status.CONTINUE) {

            somaDosDados = DadoLancado();

            if (somaDosDados == myPoint) {

                gameStatus = Status.WON;

            } else if (somaDosDados == SEVEN) {

                gameStatus = Status.LOST;

            }
        }
        if (gameStatus == Status.WON){
            System.out.println("Player wins");
        }else{
            System.out.println("Players Loses");
        }
    }
    private static int DadoLancado(){
        int dice1 = 1 + secureRandom.nextInt(6);
        int dice2 = 1 + secureRandom.nextInt(6);
        int sum = dice1 + dice2;

        System.out.printf("%d + %d = %d%n", dice1, dice2, sum);
        return sum;
    }
}
