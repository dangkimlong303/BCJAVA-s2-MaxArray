import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;

        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);

        int[] array = new int[size];
        for (int i = 0 ; i<array.length;i++){
            System.out.print("Enter values: ");
            array[i] = sc.nextInt();
        }

        for (int arr : array){
            System.out.println(arr + "\t");
        }

        int index = 0;
        int max = array[0];

        for (int i = 1; i<array.length;i++){
            if (max < array[i]){
                max = array[i];
                index = i ;
            }
        }

        System.out.println("The largest property in the list is " + max + " ,at position: " + index);

    }
}
