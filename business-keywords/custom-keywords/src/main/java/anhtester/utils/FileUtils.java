package anhtester.utils;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public String getFolderPath(String filePath) {
        File file = new File("");
        String currentPath = file.getAbsolutePath();
        System.out.println("Current path: " + currentPath);

        String currentPath2 = System.getProperty("user.dir");
        System.out.println("Current path: " + currentPath2);

        Path currentDirectoryPath = Paths.get("").toAbsolutePath();
        String currentPath3 = currentDirectoryPath.toString();
        System.out.println("Current path: " + currentPath3);

        FileSystem fileSystem = FileSystems.getDefault();
        Path path = fileSystem.getPath("").toAbsolutePath();
        String currentPath4 = path.toString();
        System.out.println("Current path: " + currentPath4);

        String s = getClass().getName();
        int i = s.lastIndexOf(".");
        if (i > -1)
            s = s.substring(i + 1);
        s = s + ".class";
        //System.out.println("File Name: " + s);
        String testPath = this.getClass().getResource(s).getPath();
        //System.out.println(testPath);

        String currentPath5 = testPath.split("/business-keywords/")[0];
        currentPath5 = currentPath5.substring(1, currentPath5.length());
        System.out.println("Current path: " + currentPath5);

        String currentPath6 = System.getProperty("project.path");
        System.out.println("Current path: " + currentPath6);

        return currentPath6 + filePath;

    }

}