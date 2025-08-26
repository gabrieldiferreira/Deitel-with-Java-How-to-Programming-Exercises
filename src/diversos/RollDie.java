package diversos;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args)
    {
        SecureRandom secureRandom = new SecureRandom();

        int frequencia1 = 0;
        int frequencia2 = 0;
        int frequencia3 = 0;
        int frequencia4 = 0;
        int frequencia5 = 0;
        int frequencia6 = 0;

        for(int die = 1; die <= 100; die++){
            int jogar = 1 + secureRandom.nextInt(6);
            switch(jogar){
                case 1:
                    ++frequencia1;
                    break;
                case 2:
                    ++frequencia2;
                    break;
                case 3:
                    ++frequencia3;
                    break;
                case 4:
                    ++frequencia4;
                    break;
                case 5:
                    ++frequencia5;
                    break;
                case 6:
                    ++frequencia6;
                    break;
            }

        }

        System.out.println("Lado\tfrequencia");
        System.out.printf(
                "1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequencia1, frequencia2, frequencia3,
                frequencia4, frequencia5, frequencia6
        );
    }
}
