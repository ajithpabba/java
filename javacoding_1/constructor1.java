class myConstructor{
    private int id;
    private String name;
   
    //  public myConstructor(){
    //     id=402;
    //     name="kumarpabba";
    // }
     public myConstructor(String myname,int i){
        id=i;
        name=myname;
    }
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
        this.id = i;
    }
}

public class constructor1 {
    public static void main(String[] args) {
        myConstructor ajith= new myConstructor("kumarpabba",128338362);
        System.out.println(ajith.getId());
        System.out.println(ajith.getName());
        
    }
    
}
