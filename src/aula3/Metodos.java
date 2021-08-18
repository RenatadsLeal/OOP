package aula3;

public class Metodos {
    public static void main(String[] args) {
        int number = 3;
        boolean result = isOne(3);
        System.out.println(result);
    }
    static boolean isOne(int number){
        if(number == 1)
            return true;
        else
            return false;
    }
}
