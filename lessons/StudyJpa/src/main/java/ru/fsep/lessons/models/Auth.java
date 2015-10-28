package ru.fsep.lessons.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.persistence.Column;

/**
 * 27.10.15
 * Auth
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
public class Auth {

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    public Auth() {
    }

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Auth auth = (Auth) o;
        return Objects.equal(login, auth.login) &&
                Objects.equal(password, auth.password);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(login, password);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("login", login)
                .add("password", password)
                .toString();
    }
}
