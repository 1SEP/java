package ru.fsep.lessons.models;

import javax.persistence.Column;

/**
 * 03.11.15
 * Info
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
public class Info {

    @Column(length = 100, nullable = false)
    private String email;


    public Info(String email) {
        this.email = email;

    }

    public String getEmail() {
        return email;
    }

}
