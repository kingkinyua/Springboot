package class_projects.demo.Models;


public class MockTeacher {
    private Long id;

    private String name;

    private MockTeacher(){

    }

    public MockTeacher(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MockTeacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
