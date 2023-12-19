public class lnrsrch {
    static int linsrch(int[] arr,int tar){
        if(arr.length==0){
            return -1;

        }
        for(int i=0;i<arr.length;i++){
            if(tar==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ok={4,2,5,6,8,0};
        System.out.println(linsrch(ok,5));

    }
}
