package class_projects.demo.Services;

import class_projects.demo.Models.Student;
import class_projects.demo.Repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository universityRepository;

    public StudentServiceImpl(StudentRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public List<Student> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return universityRepository.findById(id).get();
    }

    @Override
    public void delete(Long id){
        universityRepository.deleteById(id);
    }

    @Override
    public Student CreateStudent(Student university){
        return universityRepository.save(university);
    }

    @Override
    public Student Update(Student university){
        Student identified = findById(university.getId());
        identified.setId(university.getId());
        identified.setFirstName(university.getFirstName());
        identified.setLastName(university.getLastName());
        identified.setMiddleName(university.getMiddleName());
        identified.setDob(university.getDob());
        return universityRepository.save(identified);
    }
    @Override
    public Student Update(Long id, Student university){
        Student identified = findById(id);
        identified.setId(university.getId());
        identified.setFirstName(university.getFirstName());
        identified.setLastName(university.getLastName());
        identified.setMiddleName(university.getMiddleName());
        identified.setDob(university.getDob());
        return universityRepository.save(identified);
    }


}
