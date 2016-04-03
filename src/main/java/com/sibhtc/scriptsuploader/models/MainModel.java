package com.sibhtc.scriptsuploader.models;

import com.sibhtc.scriptsuploader.entities.classes.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * User: nikpodrivnik
 * Date: 03/04/16
 */
public class MainModel {
    private List<Configuration> configurations;

    public List<Configuration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<Configuration> configurations) {
        this.configurations = configurations;
    }

    public MainModel() {
        configurations = new ArrayList<Configuration>();
        configurations.add(new Configuration());
        //File file = new File("/configurations.json");
    }
}
