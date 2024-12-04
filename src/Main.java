public class Main {
    public static void main(String[] args) {

        // testando o metodo calculadora(fazendo a múltiplicação 4 * 6):
        calculadora((char) 3, 4, 6);

    }

    public static void calculadora(char conta, int numero1, int numero2) {

        // conta = 1 -> para fazer SOMA;
        // conta = 2 -> para fazer SUBTRAÇÃO;
        // conta = 3 -> para fazer MULTIPLICAÇÃO;
        // conta = 4 -> para fazer DIVISÃO;
        // conta = 5 -> para fazer RESTO da divisão;

        switch (conta) {
            case 1 -> {
                System.out.println(numero1 + numero2);
                break;
            }
            case 2 -> {
                System.out.println(numero1 - numero2);
                break;
            }
            case 3 -> {
                System.out.println(numero1 * numero2);
                break;
            }
            case 4 -> {
                if(numero2 == 0) {
                    System.out.println("ERRO. Um número NÃO pode ser dividido por zero");
                } else {
                    System.out.println(numero1 / numero2);
                }
                break;
            }
            case 5 -> {
                System.out.println(numero1 % numero2);
                break;
            }
            default -> System.out.println("ERRO. Essa operação matemática NÃO é válida.");
        }
    }
}