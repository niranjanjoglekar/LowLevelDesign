package compositeDesignPattern.FileSystemExample;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class Main {

    public static void main(String[] args) {

        Directory directoryA = new Directory("Folder A");
        File file_a = new File("FileA");
        Directory directoryB = new Directory("B");
        File fileB = new File("FileB");
        directoryB.add(fileB);

        directoryA.add(file_a);
        directoryA.add(directoryB);

        directoryA.ls();
    }
}
