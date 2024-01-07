public class App {
    public static void main(String[] args) throws Exception {
        Student Students = new Student("FATEN", 20, 3.3);
  
        System.out.println(Students.getname()+" " + Students.getage() +" " + Students.getgpa());
    }
}
