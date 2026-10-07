/**
 *  Java program to create, update, and delete HashSet.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Set<Short> mySet = new HashSet<>();

        // Add.
        mySet.add((short) 2);
        mySet.add((short) 1);
        mySet.add((short) 25000);
        mySet.add((short) -15);
        mySet.add((short) 25256);
        mySet.add((short) 32768);
        mySet.add((short) 32767);

        // Display.
        System.out.println(mySet); // Output: [1, 2, 25000, 25256, -15, -32768, 32767]

        // Delete value 25000.
        mySet.remove((short)25000);

        // Display.
        System.out.println(mySet); // Output: [1, 2, 25256, -15, -32768, 32767]

        // Add value 24000.
        mySet.add((short)24000);

        // Display.
        System.out.println(mySet); //Output: [24000, 1, 2, 25256, -15, -32768, 32767]

        // Clear.
        mySet.clear();

    }
}