package diversos;/*
Imprima inteiros de 1 a 20
usando loop while
contador i, nao inicializada
imprimir 5 inteiros por linha
calcule usando i % 5
quando  o valor dessa expressao for 0, imprima um caractere de nova linha, caso contrario, imprima um caractere de
tobulacao. Assuma que esse codigo é um aplicativo,
system.out.println para caracteres de linha
system.out.println para caracteres de tabulação
 */

public class execC {
    public static void main(String[] args){
        int i;
        //while(i <= 20){
        for(i = 1; i<=20; i++){
            System.out.print(i);
            if(i % 5 == 0) {
                System.out.println();
            }else{
                System.out.print('\t');
            }
        }
    }
}
