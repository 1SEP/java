package ru.fsep.lessons.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private AuthData authData;
    private PersonInfo personInfo;
    private List<Task> taskList;

    public User() {
    }

    public User(AuthData authData, PersonInfo personInfo, List<Task> taskList) {
        this.authData = authData;
        this.personInfo = personInfo;
        this.taskList = taskList;
    }

    public int getId() {
        return id;
    }

    public AuthData getAuthData() {
        return authData;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equal(id, user.id) &&
                Objects.equal(authData, user.authData) &&
                Objects.equal(personInfo, user.personInfo) &&
                Objects.equal(taskList, user.taskList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, authData, personInfo, taskList);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("authData", authData)
                .add("personInfo", personInfo)
                .add("taskList", taskList)
                .toString();
    }


}
