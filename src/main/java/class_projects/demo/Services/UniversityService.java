package class_projects.demo.Services;

import class_projects.demo.Models.University;

import java.util.List;

public interface UniversityService {
    List<University> findAll();
    University findById(Long id);

    void delete(Long id);
    University CreateUniversity(University university);
    University Update(University university);
    University Update(Long id, University university);
}
