package com.company;

import java.util.Scanner;

public class TimVitriTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần tử: ");
            size = sc.nextInt();
            if (size > 100) {
                System.out.println("qua 100");
            }
        } while (size > 100);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Nhập số cần tìm");
        int viTri;
        viTri = sc.nextInt();
        if (Tim == -1) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay o vị trí" + Tim);
        }
    }
}
