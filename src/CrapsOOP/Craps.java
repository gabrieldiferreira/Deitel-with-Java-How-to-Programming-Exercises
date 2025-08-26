/*
Classe diversos.Craps → vai guardar a lógica principal (seu código atual).
 */

package CrapsOOP;

import java.security.SecureRandom;

public class Craps {
    // ESTADO DO JOGO
    private enum Status { CONTINUE, WON, LOST }

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    private int myPoint = 0;
    private Status gameStatus;

    public void play() {
        int somaDosDados = DadoLancado();

        switch (somaDosDados) {
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
                System.out.printf("O ponto é %d%n", myPoint);
                break;
        }

        // continua jogando até ganhar ou perder
        while (gameStatus == Status.CONTINUE) {
            somaDosDados = DadoLancado();

            if (somaDosDados == myPoint) {
                gameStatus = Status.WON;
            } else if (somaDosDados == SEVEN) {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
    }

    private int DadoLancado() {
        int dice1 = Dice.roll();
        int dice2 = Dice.roll();
        int sum = dice1 + dice2;

        System.out.printf("%d + %d = %d%n", dice1, dice2, sum);
        return sum;
    }
}

