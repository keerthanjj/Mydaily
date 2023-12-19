public class student {
    public static String Name;
    public static int[] marks;
    student(String name,int[] marks){
        this.Name=name;
        this.marks=marks;

    }
    public static void getNumOfMarks(){
        for(int i:marks){
            System.out.print(i+" ");
        }
    }
    static void getTotalsumofmarks(){
        int sum=0;
        for(int i:marks){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    static void maxmarks(){
        int max=marks[0];
        for(int i:marks){
            if(max<i){
                max=i;
            }
        }
        System.out.println(max);

    }
    static void minmarks(){
        int min=marks[0];
        for(int i:marks){
            if(i<min){
                min=i;
            }
        }
        System.out.println(min);
    }
    static void avermarks(){
        int len=marks.length;
        int sum=0;
        for(int i:marks){
            sum+=i;
        }
        double avg= sum /len;
        System.out.println("\naverage marks :"+ avg);
    }

    public static void main(String[] args) {
        int[] marks={78,67,79,67,89,86};
        student s1=new student("keer",marks);
        student.getTotalsumofmarks();
        student.getNumOfMarks();
        student.avermarks();
        student.maxmarks();
        student.minmarks();

    }

}
