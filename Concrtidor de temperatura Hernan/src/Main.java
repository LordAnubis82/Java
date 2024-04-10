import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Convertidor de temperatura de Hernán");

        Scanner teclado = new Scanner(System.in);
        double temperatura;
        double convercion;
        int tipo;
        System.out.println("Ingrese que tipo de temperatura va a ingresar  1 Celcius 2 Fahernheit");
        tipo = teclado.nextInt();
        System.out.println("Ingrese la temperatura");
        temperatura = teclado.nextDouble();

        if (tipo == 1 ){
            convercion = (temperatura * 1.8 ) + 32;
            System.out.println(convercion);
        }
        if (tipo == 2){
            convercion = (temperatura - 32)* 5/9;
            System.out.println(convercion);


            }

        }






}
