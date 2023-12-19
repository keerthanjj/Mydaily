import java.util.Arrays;

public class lnrstring {
    public static void main(String[] args) {
        String sr="keerthan";
        char tar='t';
        System.out.println(Arrays.toString(sr.toCharArray()));
        for(char ch:sr.toCharArray()){
            if(tar==ch){
                System.out.println(ch);
            }
        }
    }
}
