package class_projects.demo;

import class_projects.demo.Models.MockAppointment;
import class_projects.demo.Models.MockStudent;
import class_projects.demo.Models.MockTeacher;
import class_projects.demo.Models.University;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class Test implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public Test(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {

        MockStudent mockStudent1 = feignRestClient.createMockStudent(new MockStudent("007", "King Kinyua"));
        System.out.println("Updated student:"+mockStudent1.toString());

        MockStudent registered = feignRestClient.findById(mockStudent1.getStudentNumber());
        System.out.println("Registered student is"+registered);

        List<MockTeacher> teachers = feignRestClient.getAllMockTeachers();
        System.out.println("Teachers are:"+teachers);

        MockAppointment mockAppointment = feignRestClient.createMockAppointment(new MockAppointment(mockStudent1.getId(),3L));
        System.out.println("New Appointment:"+mockAppointment.toString());

    }
}
