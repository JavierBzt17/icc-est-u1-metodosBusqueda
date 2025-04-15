package views;

import java.util.Scanner;   

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Metodos de busqueda");
    }

    public int getCode(){
        System.out.println("Ingrese el codigo");
        int codigo = scanner.nextInt();
        System.out.println("El codigo ingresado es: " + codigo);
        return codigo;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
