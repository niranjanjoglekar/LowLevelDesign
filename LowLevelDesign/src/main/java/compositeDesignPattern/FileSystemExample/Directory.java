package compositeDesignPattern.FileSystemExample;

import java.util.ArrayList;
import java.util.List;

/**
 * This will have others objects
 */
public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> directories;

    public Directory(String fileName){
        this.directoryName = fileName;
        directories = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        directories.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name :"+ directoryName);

        for (FileSystem fileSystem : directories){
            fileSystem.ls();
        }
    }
}
