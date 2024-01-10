public class fibonacciseries {
    static int a=0;
    static int b=1;
    static int c;
    static void fiboSeries(int count){
        if(count>0){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            fiboSeries(count-1);
        }
  
    }
    public static void main(String[] args) {
        // int a=0;
        // int b=1;
        // System.out.print(a + ""+b);
        // int c;
        // int count=10;
        // for(int i =2;i<=count;++i){
        //     c=a+b;
        //     System.out.print(""+c);
        //    a=b;
        //    b=c;
        // }
        int count=10;
        System.out.print("the fiboancci series of first 10 number is:");
        System.out.print(a +" "+b);
        fiboSeries( count);
        
        
    }
    
}
