public class recursive {
    static int factorial (int a){
        if(a==0 || a==1){
            return 1;
        }
        else {
            return a*factorial(a-1);
        }
    }
    static int factorial_iterative (int a){
        if(a==0 || a==1){
            return 1;
        }
        else {
             int fact=1;
            for(int i = 1;i<=a;i++){
                fact=fact*i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("the factorial of a number is :"+ factorial(x));
        System.out.println("the factorial of a number is :"+ factorial_iterative(x));
        
    }
    
}
