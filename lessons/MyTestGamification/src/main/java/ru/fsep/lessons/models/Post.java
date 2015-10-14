package ru.fsep.lessons.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.springframework.stereotype.Component;

@Component
public class Post {
    private int id;
    private String name;
    private String description;

    public Post() {
    }

    public Post(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equal(id, post.id) &&
                Objects.equal(name, post.name) &&
                Objects.equal(description, post.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, description);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("description", description)
                .toString();
    }
}
