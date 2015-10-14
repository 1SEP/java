package ru.fsep.lessons.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.List;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private double rating;
    private List<Post> postList;

    public PersonInfo(String firstName, String lastName, double rating, List<Post> postList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.postList = postList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getRating() {
        return rating;
    }

    public List<Post> getPostList() {
        return postList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonInfo that = (PersonInfo) o;
        return Objects.equal(rating, that.rating) &&
                Objects.equal(firstName, that.firstName) &&
                Objects.equal(lastName, that.lastName) &&
                Objects.equal(postList, that.postList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstName, lastName, rating, postList);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("rating", rating)
                .add("postList", postList)
                .toString();
    }
}
