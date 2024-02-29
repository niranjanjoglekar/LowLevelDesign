package compositeDesignPattern.FileSystemExample;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class File implements FileSystem{

    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File name : "+fileName);
    }
}
