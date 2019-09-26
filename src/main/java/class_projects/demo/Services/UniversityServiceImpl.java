package class_projects.demo.Services;

import class_projects.demo.Models.University;
import class_projects.demo.Repositories.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {
    private final UniversityRepository universityRepository;

    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public University findById(Long id) {
        return universityRepository.findById(id).get();
    }

    @Override
    public void delete(Long id){
        universityRepository.deleteById(id);
    }

    @Override
    public University CreateUniversity(University university){
        return universityRepository.save(university);
    }

    @Override
    public University Update(University university){
        University identified = findById(university.getId());
        identified.setName(university.getName());
        identified.setLocation(university.getLocation());
        identified.setYearFounded(university.getYearFounded());
        return universityRepository.save(identified);
    }
    @Override
    public University Update(Long id, University university){
        University identified = findById(id);
        identified.setName(university.getName());
        identified.setLocation(university.getLocation());
        identified.setYearFounded(university.getYearFounded());
        return universityRepository.save(identified);
    }


}
