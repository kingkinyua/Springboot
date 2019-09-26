package class_projects.demo.Controller;

import class_projects.demo.Models.University;
import class_projects.demo.Models.University;
import class_projects.demo.Services.UniversityService;
import class_projects.demo.Services.UniversityService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="universities")
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }
    @GetMapping
    public List<University> findAll(){
        return universityService.findAll();

    }
    @GetMapping(value = "id")
    public University findById(@PathVariable Long id){
        return universityService.findById(id);
    }

    @PostMapping
    public University CreateUniversity(@Validated(University.Create.class)@RequestBody University university){
        return universityService.CreateUniversity(university);
    }
    @DeleteMapping(value = "id")
    public void deleteUniversity(@PathVariable Long id){universityService.delete(id);}
    @PatchMapping
    public University UpdateUniversity(@Validated(University.Update.class)@RequestBody University university){
        return universityService.Update(university);
    }
    @PatchMapping(value = "{id}")
    public University UpdateUniversity(@PathVariable Long id, @RequestBody University university){
        return universityService.Update(id, university);
    }
}
