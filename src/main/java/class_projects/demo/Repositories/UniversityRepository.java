package class_projects.demo.Repositories;

import class_projects.demo.Models.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
