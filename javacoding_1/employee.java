class Student{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("harry salary is "+id);
        System.out.println("the name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}



public class employee {
    public static void main(String[] args) {
        Student harry=new Student();
        Student jhon =new Student();
        harry.id=1022;
        harry.salary=33;
        harry.name="harry1";
        jhon.id=1010;
        jhon.salary=220;
        jhon.name="jhom1";
        harry.printdetails();
        jhon.printdetails();
        int s =harry.getSalary();
        int d=jhon.getSalary();
        System.out.println("the harry1 salary is"+s);
        System.out.println("teh jhon salary is "+d);
    }
}
