package javabasics._13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(13);
        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(0));//Write your code here
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        ArrayList<String>menuItems=new ArrayList<>();
        ArrayList<Double>menuPrices=new ArrayList<>();
        menuItems.add("Pizza");
        menuItems.add("Hamburger");
        menuItems.add("Cola");
        menuPrices.add(4.55);
        menuPrices.add(7.55);
        menuPrices.add(3.55);
        System.out.println(menuItems.get(0)+"="+menuPrices.get(0));
        System.out.println(menuItems.get(1)+"="+menuPrices.get(1));
        System.out.println(menuItems.get(2)+"="+menuPrices.get(2));//Write your code here
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};
        int sum= items[0]+items[1]+items[2]+items[3]+items[4]+items[5]+items[6]+items[7]+items[8]+items[9];
        int rapidSum= Arrays.stream(items).sum();
        if (sum==rapidSum){
            System.out.println("La somma coincide ed è="+sum);
        }else{
            System.out.println("Qualcosa non va, dovrebbe essere="+rapidSum);
        }//Write your code here
    }
}
