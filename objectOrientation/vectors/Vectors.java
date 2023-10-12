package objectOrientation.vectors;

public class Vectors {

    public static void main(String args[]) {

        char CharacterArray[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

        System.out.println("Showing the Array: " + String.valueOf(CharacterArray));
        System.out.println("Number of elements: " + CharacterArray.length);
        System.out.println("1st to 3rd character: " + String.valueOf(CharacterArray, 0, 3));

        String StringArray[] = { "Aprendendo", "a", "utilizar", "array" };
        String names = "";

        for (int i = 0; i < StringArray.length; i++) {
            names = names + StringArray[i] + " ";
        }

        System.out.println("Showing Array: " + names);
        System.out.println("Number of array elements: " + StringArray.length);
        System.out.println("Showing the 1st element: " + StringArray[0]);
        System.out.println("Showing the last element of the array: " + StringArray[StringArray.length - 1]);
    }
}
