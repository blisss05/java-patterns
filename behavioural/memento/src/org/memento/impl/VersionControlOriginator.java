package org.memento.impl;

/**
 * Created by blisss05 on 3/11/2016.
 */
public class VersionControlOriginator {

    private String name;
    private String version;
    private String content;

    public String getContent() {
        return content;
    }

    public String getContentFromVersion(Object memento) {
        return ((Memento) memento).content;
    }

    public void createNewVersion(String fileVersion, String fileName, String fileContent) {
        version = fileVersion;
        name = fileName;
        content = fileContent;
    }

    public Memento commit() {
        return new Memento(version, name, content);
    }

    private class Memento {
        public final String version;
        public final String name;
        public final String content;

        public Memento(String fileVersion, String fileName, String fileContent){
           name = fileName;
           version = fileVersion;
           content = fileContent;
        }
    }
}
