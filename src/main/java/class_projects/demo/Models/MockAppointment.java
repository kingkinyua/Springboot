package class_projects.demo.Models;

import javax.persistence.Id;

public class MockAppointment {
    private Long id;

    private Long studentId;

    private Long teacherId;

    private MockAppointment(){

    }

    public MockAppointment(Long studentId, Long teacherId) {
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "MockAppointment{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                '}';
    }
}
