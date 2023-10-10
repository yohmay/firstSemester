package objectOrientation.vectors;

public class Vectors {

    public static void main(String args[]) {

        char CharacterArray[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

        System.out.println("Mostrando o Array: " + String.valueOf(CharacterArray));
        System.out.println("Quant. de elementos: " + CharacterArray.length);
        System.out.println("1º ao 3º caracter: " + String.valueOf(CharacterArray, 0, 3));

        String StringArray[] = { "Aprendendo", "a", "utilizar", "array" };
        String names = "";

        for (int i = 0; i < StringArray.length; i++) {
            names = names + StringArray[i] + " ";
        }

        System.out.println("Mostrando o Array: " + names);
        System.out.println("Quant. de elementos do array: " + StringArray.length);
        System.out.println("Mostrando o 1º elemento: " + StringArray[0]);
        System.out.println("Mostrando o último elemento do array: " + StringArray[StringArray.length - 1]);
    }
}
