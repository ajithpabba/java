 public class method{
     int add(int x,int y){
        if(x>y){
            return x+y;
        }
        else {
            return (x+y)*5;
        }
    }
    public static void main(String[] args) {
        int a=4;
        int b = 5;
        int c;
        method obj= new method();
        c=obj.add(a,b);
        System.out.println(c);
    }
}