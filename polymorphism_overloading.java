class git{

  int age;
  String name;

  public void PrintIF(int age){

   System.out.println(age);

  }

  public void PrintIF(String name){

    System.out.println(name);
  }

  public void PrintIF(int age, String name){
    
    System.out.println(age + " " + name);      
    

  }

}

public class polymorphism_overloading {

  public static void main(String[] args) {
    
  
    
  git obj = new git();

    obj.age = 12;
    obj.name = "jiya";
   
    obj.PrintIF(obj.age);
    obj.PrintIF(obj.name);
    obj.PrintIF(obj.age, obj.name);
    
    
    
    
  }


}
