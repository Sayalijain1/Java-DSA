public class copyconstruc {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="sayali";
        s1.roll=45;
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        
    }
}
 class Student{
    String name;
    int roll;
    String password;
    Student(){
        
    }
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;

    }
 }
