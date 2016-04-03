package com.sibhtc.scriptsuploader.entities.classes;

import com.sibhtc.scriptsuploader.entities.interfaces.IDatabase;

/**
 * User: nikpodrivnik
 * Date: 03/04/16
 * Информация для подключения к бд
 */
public class Database implements IDatabase{
    private String name;

    private String connectionString;

    private String login;

    private String password;

    public Database(String name, String connectionString, String login, String password) {
        this.name = name;
        this.connectionString = connectionString;
        this.login = login;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
