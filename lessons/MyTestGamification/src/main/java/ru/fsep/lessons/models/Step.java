package ru.fsep.lessons.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.springframework.stereotype.Component;

@Component
public class Step {
    private int id;
    private int taskId;
    private String description;
    private boolean isFinished;

    public Step() {
    }

    public Step(int id, int taskId, String description, boolean isFinished) {
        this.id = id;
        this.taskId = taskId;
        this.description = description;
        this.isFinished = isFinished;
    }

    public int getId() {
        return id;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Step step = (Step) o;
        return Objects.equal(id, step.id) &&
                Objects.equal(taskId, step.taskId) &&
                Objects.equal(isFinished, step.isFinished) &&
                Objects.equal(description, step.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, taskId, description, isFinished);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("taskId", taskId)
                .add("description", description)
                .add("isFinished", isFinished)
                .toString();
    }
}
