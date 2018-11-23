package app.models;

import java.util.List;

public class UserViewModel {
    private String username;
    private List<String> allUsers;
    private String fullName;
    private boolean isLogged;
    private boolean isAdministrator;

    public UserViewModel(String username, List<String> allUsers, String fullName, boolean isLogged, boolean isAdministrator) {
        this.username = username;
        this.allUsers = allUsers;
        this.fullName = fullName;
        this.isLogged = isLogged;
        this.isAdministrator = isAdministrator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(List<String> allUsers) {
        this.allUsers = allUsers;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public boolean isAdministrator() {
        return isAdministrator;
    }

    public void setAdministrator(boolean administrator) {
        isAdministrator = administrator;
    }
}
