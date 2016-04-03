package com.sibhtc.scriptsuploader.entities.classes;

import com.sibhtc.scriptsuploader.entities.interfaces.IConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * User: nikpodrivnik
 * Date: 03/04/16
 * Конфигурация пакета, содержит данные о конфигурации пакета
 */
public class Configuration implements IConfiguration{

    private String name;

    private List<Database> databases;

    private List<Package> packages;

    public Configuration(){
        databases = new ArrayList<Database>();
        databases.add(new Database("SQL2005", "", "", ""));

        packages = new ArrayList<Package>();
        packages.add(new Package("Сопровождение 401", "/"));

        setName("Накатывалка");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
