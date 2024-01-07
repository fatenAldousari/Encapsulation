public class Student{

private String name;
private int age;
private double gpa;
public Student(String name, int age, double gpa) {
    this.name = name;
    this.age = age;
    this.gpa =gpa;
}
public String getname() {
    return name;
}
public void setname(String name) {
    this.name = name;
}
public int getage() {
    return age;
}
public void setage(int age) {
        this.age = age;
   }

public void setgpa( double gpa){
    this.gpa = gpa;
    if (gpa <= 4.0 && gpa >= 0.0){
        this.gpa = gpa;
    } else 
    System.out.println( "error");
   
}
public String getgpa(){
    if (gpa > 3){
        return "Execellent!";
    } else if (gpa <= 3){
        return "Good";
    } else 
    return "Needs improvment";
}
}

