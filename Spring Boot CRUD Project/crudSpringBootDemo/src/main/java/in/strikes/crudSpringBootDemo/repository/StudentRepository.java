package in.strikes.crudSpringBootDemo.repository;

import in.strikes.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public static Student saveStudent(Student studentReq) {
        System.out.println("Inside Student Repository");
        System.out.println("Exiting Student Repository");

        Student s1 = new Student();
        s1.setName("Rudraksh");
        s1.setAge(20);
        s1.setEmail("rudraksh@gmail.com");
        s1.setRollNo(70);
        s1.setSubject("Spring Framework");

        return s1;
    }
}
