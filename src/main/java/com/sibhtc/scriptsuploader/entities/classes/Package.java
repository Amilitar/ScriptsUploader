package com.sibhtc.scriptsuploader.entities.classes;

import com.sibhtc.scriptsuploader.entities.interfaces.IPackage;

/**
 * User: nikpodrivnik
 * Date: 03/04/16
 * Информация о пакетах
 * Пакет это набор скриптов, упорядоченных специальным образом
 */
public class Package implements IPackage {
    private String name;

    private String path; //Путь до пакета

    public Package(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
