package exercise.Stefan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PC pc = new PC("i5",6,500);
        Disk disk1 = new Disk("1","Toshiba", 350, "fat32", 270);
        Partition D = new Partition("1","Toshiba", 350, "fat32", 270,'D',300);

        D.delete(200);
        D.checkError();
        D.format("1", "NTFS");
        disk1.checkError();
        D.clonePartition();
        disk1.install(100);
        pc.turnOFF();
        pc.getMemory();

    }
}
