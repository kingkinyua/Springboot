//package class_projects.demo;
//
//import class_projects.demo.Models.Student;
//import class_projects.demo.Models.University;
//import class_projects.demo.Repositories.StudentRepository;
//import class_projects.demo.Repositories.UniversityRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//@Component
//public class StudentDummyData implements CommandLineRunner {
//    private final StudentRepository studentRepository;
//
//    private final UniversityRepository universityRepository;
//
//    public StudentDummyData(StudentRepository studentRepository, UniversityRepository universityRepository) {
//        this.studentRepository = studentRepository;
//        this.universityRepository = universityRepository;
//    }
//    @Override
//    public void run(String... args) throws Exception {
//        University strath = new University("Strathmore", "Madaraka");
//        universityRepository.save(strath);
//        Student ics = new Student("King", "Kinyua", strath);
//        studentRepository.save(ics);
//    }
//}
