import java.util.Scanner;

public class ThemNPhanTuVaoMang {
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
            array[i]=sc.nextInt();
            i++;
        }



    }
}
