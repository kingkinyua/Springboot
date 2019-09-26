//package class_projects.demo;
//
//import class_projects.demo.Models.University;
//import class_projects.demo.Repositories.StudentRepository;
//import class_projects.demo.Repositories.UniversityRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//@Component
//public class UniversityDummyData implements CommandLineRunner {
//    private final UniversityRepository universityRepository;
//
//    public UniversityDummyData(UniversityRepository universityRepository) {
//        this.universityRepository = universityRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        University strath = new University("Strathmore", "Madaraka");
//        universityRepository.save(strath);
//    }
//}
