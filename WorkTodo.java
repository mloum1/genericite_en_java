package genericite_en_java;

public class WorkTodo {
    private int workId;
    private String workType;

    // constructor
    public WorkTodo(int workId, String workType) {
        this.workId = workId;
        this.workType = workType;
    }

    // accessor
    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

}
