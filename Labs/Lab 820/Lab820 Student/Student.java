
/**
 * Write a description of class Student here.
 *
 * @author (Dylan)
 * @version (820)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int studentID;
    private boolean studentActive;
    private double studentGPA;
    private String studentName;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        studentID = 0;
        studentActive = false;
        studentGPA = 0.0;
        studentName = "Name";
    }

    public int getStudentID(){
        return studentID;
    }
    
    public boolean getStudentActive(){
        return studentActive;
    }
    
    public double getStudentGPA(){
        return studentGPA;
    }
    
    public String getStudentName(){
        return studentName;
    }
    
    
    
    public void setStudentID(int paramStudentID){
        studentID = paramStudentID;
    }
    
    public void setStudentActive(boolean paramStudentActive){
        studentActive = paramStudentActive;
    }
    
    public void setStudentGPA(double paramStudentGPA){
        studentGPA = paramStudentGPA;
    }
    public void setStudentName(String paramStudentName){
        studentName = paramStudentName;
    }
}
