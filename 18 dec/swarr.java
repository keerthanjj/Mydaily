import java.util.Arrays;

public class swarr {
    static void swap(int[] arr){
        int len=arr.length;
        for(int i=0;i<=len/2;i++){
            int temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;

        }
    }
    static void prt(int[] arr){
        for(int i:arr){
            System.out.print(i+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));

        swap(arr);
        System.out.println(Arrays.toString(arr));
        switch (arr.length%2){
            case 0:
                System.out.println("even one");
                break;
            case 1:
                System.out.println("odd one");
                break;
        }

    }
}
