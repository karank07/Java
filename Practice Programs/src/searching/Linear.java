/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author Karan
 */
class Search {

    int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;

            }

        }
        return 0;
    }

}

public class Linear {

    public static void main(String[] args) {
        int key = 500;
        int arr[] = {10, 20, 50, 60, 80, 100, 150};
        Search ls = new Search();
        int pos = ls.linearSearch(arr, key);
        if (pos != 0) {
            System.out.println("Element found at:" + (pos + 1));

        } else {
            System.out.println("element not found");
        }
    }

}
