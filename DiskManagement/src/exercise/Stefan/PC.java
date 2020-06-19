package exercise.Stefan;

public class PC {
    private String CPU;
    private int RAM;
    private int memory;

    public PC(String CPU, int RAM, int memory) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void turnON ()
    {
        System.out.println("PC is turning ON");
    }

    public void turnOFF ()
    {
        System.out.println("PC is turning OFF");
    }
}
