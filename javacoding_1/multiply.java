public class multiply {
    static void mul(int x){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n", x,i,x*i);
        }
    }
    static void pattern(int y){
        for(int i=0;i<y;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        System.out.println();

    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+ sum(n-1);
        }
    }
    public static void main(String[] args) {
        //mul(6);
        // pattern(6);
        int sum1=sum(6);
        System.out.println( "the sum of n natural numbers is:"+" "+sum1);
        
    }
    
}
