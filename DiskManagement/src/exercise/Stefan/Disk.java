package exercise.Stefan;

public class Disk {
    private String disk;
    private String name;
    private PC memory;
    private int totalMemory;
    private String systemFile;
    private int usedMemory;
    private int unusedMemory;

    public Disk(String disk, String name, PC memory,int totalMemory, String systemFile, int usedMemory) {
        this.disk = disk;
        this.name = name;
        this.memory = memory;
        this.totalMemory = totalMemory;
        this.systemFile = systemFile;
        this.usedMemory = usedMemory;
        this.unusedMemory = totalMemory - this.usedMemory;
    }

    public Disk(String disk, String name, String systemFile, int usedMemory, int unusedMemory) {
        this.disk = disk;
        this.name = name;
        this.systemFile = systemFile;
        this.usedMemory = usedMemory;
        this.unusedMemory = unusedMemory;
    }

    public Disk(String disk, String name, int totalMemory, String systemFile, int usedMemory) {
        this.disk = disk;
        this.name = name;
        this.totalMemory = totalMemory;
        this.systemFile = systemFile;
        this.usedMemory = usedMemory;
    }

    public String getDisk() {
        return disk;
    }

    public int getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(int totalMemory) {
        this.totalMemory = totalMemory;
    }

    public void format (String disk, String systemFile)
    {
        System.out.println("You formatted " + disk + " to " + systemFile + " format file system.");
    }

    public void checkError ()
    {
        System.out.println("You performed an error checking on disk " + disk);
    }

    public void install (int sizeOfProgram)
    {

        if (sizeOfProgram <= this.unusedMemory) {
            System.out.println("The installing procedure has started.");
            this.usedMemory = usedMemory + sizeOfProgram;
            this.unusedMemory = totalMemory - this.usedMemory;
        }
        else
            System.out.println("There isn't sufficient space on the disk.");
    }

    public void delete (int sizeOfProgram)
    {
            System.out.println("The uninstalling procedure has started.");
            this.usedMemory = usedMemory - sizeOfProgram;
            this.unusedMemory = totalMemory - this.usedMemory;
        System.out.println("You have " + unusedMemory + " of unused memory and " + usedMemory + " of used memory");

    }

}
