package exercise.Stefan;

public class Partition extends Disk {

    private char letter;
    private int memory;

    public Partition(String disk, String name, int totalMemory, String systemFile, int usedMemory, char letter, int memory) {
        super(disk, name, totalMemory, systemFile, usedMemory);
        this.letter = letter;
        this.memory = memory;
    }

    @Override
    public void format(String disk, String systemFile) {
        System.out.println("You formatted " + letter + " to " + systemFile);
        super.format(disk, systemFile);
    }


    public void checkError () {
        System.out.println(letter + " has been checked for errors");
    }

    @Override
    public void install(int sizeOfProgram) {
        super.install(sizeOfProgram);
    }

    @Override
    public void delete(int sizeOfProgram) {
        super.delete(sizeOfProgram);
    }

    public void clonePartition ()
    {
        if (memory * 2 < getTotalMemory()) {
            System.out.println("The operation of cloning " + letter + ": partition has been made");
            setTotalMemory(getTotalMemory() - 2 * memory);
        }
        else
            System.out.println("You don't have enough memory on disk " + getDisk());
    }
}
