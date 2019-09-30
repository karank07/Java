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
public class MinMaxFreq {

    public static void main(String[] args) {
        String s = "abcdabcaba";
        char a[] = s.toCharArray();
        int freq[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            freq[i] = 1;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(a[i] == a[j] && a[i] !='' && a[i] != '0')
                {
                    freq[i]++;
                    a[j] = 0;
                }
            }
        }
        char minChar,maxChar;
        int min = freq[0];
        int max = freq[0];
        for (int i = 0; i < freq.length; i++) {

            if (min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = a[i];
            }
            if (max < freq[i]) {
                max = freq[i];
                maxChar = a[i];
            }
        }

        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("Maximum occurring character: " + maxChar);
    }

}


