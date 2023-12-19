public class richcus {
    public static void main(String[] args) {
        int[][] cus={{1,2,3,4,5,10,100},{3,4,54,4},{1,4,25,42,42}};
        String[] name={"keer","lok","nik"};
        int max=0;
        int sum=0;
        String rich="";
        for(int i=0;i<cus.length;i++){
            for(int j=0;j<cus[i].length;j++){
                sum+=cus[i][j];

            }
            if(sum>max){
                max=sum;
                rich=name[i];
            }
            sum=0;
        }
        System.out.println(max);
        System.out.println(rich);
    }
}
