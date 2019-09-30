/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Karan
 */
public class NParts {

    public static void main(String[] args) {
        String s = "hellohow";
        int n = 4, temp = 0;
        String[] equal = new String[n];
        int div = s.length() / n;
        if (s.length() % n != 0) {
            System.out.println("cannot be divided into equal parts");
        } else {
            for (int i = 0; i < s.length(); i = i + div) {
                String part = s.substring(i, i + div);
                equal[temp] = part;
                temp++;
            }
            for (int j = 0; j < n; j++) {
                System.out.println(equal[j]);
            }

        }

    }

}
