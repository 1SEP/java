package ru.fsep.lessons.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Component
public class Task {
    private int id;
    private boolean isPrivated;
    private Date dueDate;
    private List<Step> stepList;
    private boolean isFinished;

    public Task() {
    }

    public Task(int id, boolean isPrivated, Date dueDate, List<Step> stepList, boolean isFinished) {
        this.id = id;
        this.isPrivated = isPrivated;
        this.dueDate = dueDate;
        this.stepList = stepList;
        this.isFinished = isFinished;
    }

    public int getId() {
        return id;
    }

    public boolean isPrivated() {
        return isPrivated;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public List<Step> getStepList() {
        return stepList;
    }

    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equal(id, task.id) &&
                Objects.equal(isPrivated, task.isPrivated) &&
                Objects.equal(isFinished, task.isFinished) &&
                Objects.equal(dueDate, task.dueDate) &&
                Objects.equal(stepList, task.stepList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, isPrivated, dueDate, stepList, isFinished);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("isPrivated", isPrivated)
                .add("dueDate", dueDate)
                .add("stepList", stepList)
                .add("isFinished", isFinished)
                .toString();
    }
}
