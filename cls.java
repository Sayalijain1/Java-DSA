
public class cls {
    public static void main(String[] args) {
    Pen p1 = new Pen(); //creates object for pen
    p1.setColor("blue");
    p1.setTip(6);
    System.out.println(p1.color);
    
     Bankaccount myac = new Bankaccount();
     myac.Username="sayali";
     System.out.println(myac.Username);
     myac.setPassword("zoya");
    //  System.out.println(myac.password);cant do this 
    // after using getter=>
    System.out.println(myac.getpwd());

    Student s1 = new Student("this is parameterised constructors");
    Student s2 = new Student();
    System.out.println(s1.name);
    
}
}
class Bankaccount{
    public String Username;
    private String password;
    public void setPassword(String setpwd){
        password = setpwd;
    }
    String getpwd(){
        return this.password;
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
           tip = newtip;
    }
}
class Student{
    String name;
    int rollno;
    Student(String name){
        this.name = name;
    }
    Student(){
        System.out.println("this is non parameterised constructor");
    }
}
