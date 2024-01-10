class myEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getId(){
        return id;
    
    
    }
    public void setId(int i){
        this.id=i;
    }
}

public class gettter {
    public static void main(String[] args) {
        myEmployee harry=new myEmployee();
        // harry.id=123;
        // harry.name="ajith"
        harry.setName("ajith");
        System.out.println(harry.getName());
        harry.setId(127);
        System.out.println(harry.getId());
        
    }
}
