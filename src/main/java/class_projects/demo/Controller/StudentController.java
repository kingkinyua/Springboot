package class_projects.demo.Controller;

import class_projects.demo.Models.Student;
import class_projects.demo.Services.StudentService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="universitys")
public class StudentController {
    private final StudentService universityService;

    public StudentController(StudentService universityService) {
        this.universityService = universityService;
    }
    @GetMapping
    public List<Student> findAll(){
        return universityService.findAll();
    }
    @GetMapping(value = "id")
    public Student findById(@PathVariable Long id){
        return universityService.findById(id);
    }

    @PostMapping
    public Student CreateStudent(@Validated(Student.Create.class)@RequestBody Student university){
        return universityService.CreateStudent(university);
    }
    @DeleteMapping(value = "id")
    public void deleteStudent(@PathVariable Long id){universityService.delete(id);}
    @PatchMapping
    public Student UpdateStudent(@Validated(Student.Update.class)@RequestBody Student university){
        return universityService.Update(university);
    }
    @PatchMapping(value = "{id}")
    public Student UpdateStudent(@PathVariable Long id, @RequestBody Student university){
        return universityService.Update(id, university);
    }
}
