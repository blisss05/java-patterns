package org.memento.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by blisss05 on 3/11/2016.
 */
public class VersionControlCaretaker {

    private static final VersionControlOriginator originator = new VersionControlOriginator();
    private static final Map<String, Map<String, Object>> files = new HashMap<>();

    public static void commit(String version, String name, String content) {
        originator.createNewVersion(version, name, content);
        Map<String, Object> versions = files.get(name);
        if (versions == null) {
            versions = new HashMap<>();
        }
        versions.put(version, originator.commit());
        files.put(name, versions);
    }

    public static String getFileContentByVersion(String version, String name) {
        Map<String, Object> versions = files.get(name);
        return originator.getContentFromVersion(versions.get(version));
    }
}
