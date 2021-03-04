package dev.ranieri.entities;

public class Suggestion {

    private int id;
    private String description;
    private int priority;
    private long dateSubmitted;

    public Suggestion() {
    }

    public Suggestion(int id, String description, int priority, long dateSubmitted) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.dateSubmitted = dateSubmitted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public long getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(long dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    @Override
    public String toString() {
        return "Suggestion{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", dateSubmitted=" + dateSubmitted +
                '}';
    }
}
