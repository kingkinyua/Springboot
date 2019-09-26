package class_projects.demo.Models;

public class Reject {
    private int studentId;
    private String reason;

    public Reject(){

    }

    public Reject(int studentId, String reason) {
        this.studentId = studentId;
        this.reason = reason;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
