package controllers;

import models.Person;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Person[] people;
    
    public MetodosBusqueda(Person[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }


    public static int busquedaLineal (int[] arreglo, int busquedaLineal) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == busquedaLineal) {
                System.out.println("El elemento " + busquedaLineal + " se encuentra en la posicion " + i);
                return i;
            }
        }
        return -1;
    }
    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;        
    } 

    public void showPersonByCode(){
        int codetoFind = showConsole.getCode();
        int index = findPersonByCode(codetoFind);
        if (index >= 0) {
            showConsole.showMessage("Persona encontrada: ");
            showConsole.showMessage(people[index].toString()); 
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    
    }



}