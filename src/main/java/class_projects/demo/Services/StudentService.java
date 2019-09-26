package class_projects.demo.Services;

import class_projects.demo.Models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);

    void delete(Long id);
    Student CreateStudent(Student university);
    Student Update(Student university);
    Student Update(Long id, Student university);
}
