package ITE409;
public class Ite409_previous {
    public static void main(String...args) {
        GradeBook b1 = new GradeBook();
        b1.courseId = 10;

        GradeBook b2 = new GradeBook();
        b2.courseId = 303;

        b1.print();
        b2.print();
    }
    
}

public class GradeBook {
    int courseId;
    public void print() {
        System.out.println("the course id is equal to"+courseId);
    }
}

