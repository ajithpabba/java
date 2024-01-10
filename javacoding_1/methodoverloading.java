public class methodoverloading {
    static void change(int a){
        int b =45;
    }
    static void change(int [] arr){
        arr[0] =20;
    }
    public static void main(String[] args) {
        int x=20;
        int [] marks={1,20,10,40,50};
        change(10);
        change(marks[0]);
        System.out.println("the value after cahng ing is :" + x);
        System.out.println("array changed after opertaion is:" + marks[0]);
    }
    
}
