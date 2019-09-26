package class_projects.demo;

import class_projects.demo.Models.MockAppointment;
import class_projects.demo.Models.MockStudent;
import class_projects.demo.Models.MockTeacher;
import class_projects.demo.Models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "http://10.51.10.111:2200", configuration = FeignConfig.class)
public interface FeignRestClient {
//    @RequestMapping(method = RequestMethod.POST, value = "students")
//    MockStudent createMockStudent(@RequestBody MockStudent mockStudent);
//
//    @RequestMapping(method = RequestMethod.GET, value = "students")
//    MockStudent findById(@RequestParam(name = "studentNumber")String number);
//
//    @RequestMapping(method = RequestMethod.GET, value = "lecturers")
//    List<MockTeacher>getAllMockTeachers();
//
//    @RequestMapping(method = RequestMethod.POST, value = "appointments")
//    MockAppointment createMockAppointment(@RequestBody MockAppointment mockAppointment);
//
//    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{id}")
//    MockAppointment confirmMockAppointment(@PathVariable(name = "id") Long id, @RequestParam(value = "studentId") Long studentId);

    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student createStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value = "matches")
    Student requestMatch(@RequestParam(value = "gender") String gender, @RequestParam(value = "studentId") Long studentId);

    @RequestMapping(method = RequestMethod.DELETE, value="matches")
    Student rejectMatch(@PathVariable(name = "id") Long id);

}
