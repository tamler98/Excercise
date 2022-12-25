package run;
import beans.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlbaseconfiguration/beans.xml");
        Student student =applicationContext.getBean("Student", Student.class);

        student.drawCircle();
        student.drawSquare();
        student.drawRectangle();
    }
}
