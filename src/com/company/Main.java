package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array1 = {1,2,3,4,5,11,12};
	int [] array2 = {6,7,8,9,10};
	int [] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length +i ]=array2[i];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
