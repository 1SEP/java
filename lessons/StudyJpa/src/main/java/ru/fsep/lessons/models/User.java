package ru.fsep.lessons.models;

import com.google.common.base.MoreObjects;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = LAZY)
    @JoinColumn(name = "user_id", nullable = true)
    private List<Book> books = new ArrayList<Book>();

    @Embedded
    private Auth auth;

    public User() {
    }

    public User(String name, Auth auth) {
        this.name = name;
        this.auth = auth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Auth getAuth() {
        return auth;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("Auht", auth)
                .add("books",books)
                .toString();
    }
}
