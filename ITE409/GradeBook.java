package ITE409;
public class GradeBook {
    int courseGrade;
    static int year;
    String courseName;


    // we will talk about access modifiers week 3 #1
    // an attribute you will give to a class,method,variable to control access to it 
    // 4 types of access modifiers : 1- Public, 2- Private, 3- Protected, 4- Default
    /** Academia POV - everything is important / Industry POV : Public and Private are most important, default useless, avoid using Protected unless design issue -- many programming language removed those 2
     * Public - builtin java keyword
     * Private - builtin java keyword
     * Protected - builtin ....
     * Default - nothing
     */
    GradeBook(int grade) {
        courseGrade = grade;
    }

}
