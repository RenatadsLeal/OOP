package exerciciospg.stringint;

public class Ex2 {
    public static void main(String[] args){ //Defina duas variáveis Integer e determine pelo valor delas qual é maior,
        // qual é menor ou se são iguais.

        Integer valor1 = 50;
        Integer valor2 = 55;
        int comparar;

        if(valor1.equals(valor2))
        {
            System.out.println("Os valores são iguais");
        }else {
            comparar = valor1.compareTo(valor2);
            if (comparar > 0) {
                System.out.println("O valor 1 é maior que o valor 2");
            }else{
                System.out.println("O valor 1 é menor que o valor 2");
            }
        }
    }
}
