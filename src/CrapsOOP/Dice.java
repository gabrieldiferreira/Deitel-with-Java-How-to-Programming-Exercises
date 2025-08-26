/*
Classe Dice → só cuida de lançar os dados.
 */

package CrapsOOP;

import java.security.SecureRandom;


class Dice {
    private static final SecureRandom secureRandom = new SecureRandom();

    public static int roll() {
        return 1 + secureRandom.nextInt(6);
    }
}