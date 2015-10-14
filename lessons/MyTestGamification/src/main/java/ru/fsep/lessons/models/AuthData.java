package ru.fsep.lessons.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class AuthData {
    private String password;
    private String login;

    public AuthData() {
    }

    public AuthData(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthData authData = (AuthData) o;
        return Objects.equal(password, authData.password) &&
                Objects.equal(login, authData.login);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(password, login);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("password", password)
                .add("login", login)
                .toString();
    }
}
