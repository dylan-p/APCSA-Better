
/**
 * Write a description of class StudentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRunner extends Student
{
    public static void main(){
        Student n1 = new Student();
        n1.setStudentID(978553);
        System.out.println(n1.getStudentID());
        n1.setStudentActive(true);
        System.out.println(n1.getStudentActive());
        n1.setStudentGPA(4.00000000);
        System.out.println(n1.getStudentGPA());
        n1.setStudentName("Dylan C. Pratt");
        System.out.println(n1.getStudentName());
        
        Student n2 = new Student();
        n2.setStudentID(154879);
        System.out.println(n2.getStudentID());
        n2.setStudentActive(false);
        System.out.println(n2.getStudentActive());
        n2.setStudentGPA(4.3);
        System.out.println(n2.getStudentGPA());
        n2.setStudentName("Sponge Bob");
        System.out.println(n2.getStudentName());
    }
}
