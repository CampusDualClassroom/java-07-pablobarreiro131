package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(2);
        sumFirstNaturalNumbers(7);
        showFirstNaturalNumbers(7);

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 10; i>=1 ; i--){
            lista.add(i);
        }
        if (lista.contains(num)){
            System.out.println("El elemento X se encuentra en la posición: " + lista.indexOf(num));
        } else System.out.println("El elemento X no se encuentra en la lista.");;
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int suma = 0;
        System.out.println("Suma de primeros " + num + " numeros naturales.");
        for (int i = 1; i <= num; i++){
            suma += i;
        }
        System.out.println(suma);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.println("Primeros " + num + " numeros naturales.");
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

}
