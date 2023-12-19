import java.util.Arrays;

public class numofdigits {
    static boolean numofdigit(int num){
        int cnt=0;
        while(num>0){
            num=num/10;
            cnt++;
        }
        if(cnt%2==0){
            return true;
        }
        return false;




    }

    public static void main(String[] args) {
        int[] arr={11,245,1,5663,23};
        int count=0;
        for(int num:arr){
            if(numofdigit(num)){
                count++;
            }
        }
        System.out.println(count);
        int ok=0;
        String ol=String.valueOf(ok);
        String as="      keer than jaman jyotho";



        System.out.println(ol.length());

    }
}
