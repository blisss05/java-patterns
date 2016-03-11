package org.memento;

import org.memento.impl.VersionControlCaretaker;
import org.memento.impl.VersionControlOriginator;

/**
 * Created by blisss05 on 3/11/2016.
 */
public class MementoApp {

    public static void main(String[] args) {
        String fileName1 = "Utils";
        String fileName2 = "Advance utils";

        String version1 = "V1";
        String version2 = "V2";

        String content1 = "1 useful thing";
        String content2 = "2 useful things";

        String content3 = "4 Extra useful thing";
        String content4 = "2 just useful things";

        VersionControlCaretaker.commit(version1, fileName1, content1);
        VersionControlCaretaker.commit(version2, fileName1, content2);

        VersionControlCaretaker.commit(version1, fileName2, content3);
        VersionControlCaretaker.commit(version2, fileName2, content4);

        System.out.println("\nContent of file [" + fileName1 + "] of version " + version2);
        System.out.println(VersionControlCaretaker.getFileContentByVersion(version2, fileName1));

        System.out.println("\nContent of file [" + fileName2 + "] of version " + version1);
        System.out.println(VersionControlCaretaker.getFileContentByVersion(version1, fileName2));

        System.out.println("\nContent of file [" + fileName1 + "] of version " + version1);
        System.out.println(VersionControlCaretaker.getFileContentByVersion(version1, fileName1));

        System.out.println("\nContent of file [" + fileName2 + "] of version " + version2);
        System.out.println(VersionControlCaretaker.getFileContentByVersion(version2, fileName2));
    }

    /**
     * Output:
     *
     * Content of file [Utils] of version V2
     * 2 useful things
     *
     * Content of file [Advance utils] of version V1
     * 4 Extra useful thing
     *
     * Content of file [Utils] of version V1
     * 1 useful thing
     *
     * Content of file [Advance utils] of version V2
     * 2 just useful things
     *
     */
}
