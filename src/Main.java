import java.util.Scanner;

public class Main {

    /**
     * A test method to validate if it works
     */
    public static void test() {
        Computer mineLaptop = new Computer();
        mineLaptop.setName("Aixia's laptop");
        mineLaptop.setCpu("Intel i7");
        mineLaptop.setMemeoryInGB(8);
        mineLaptop.setStorageInGB(120);

        System.out.println("My laptop's memory is: " + mineLaptop.getMemeoryInGB() + " GB");
        System.out.println("My laptop's storage is: " + mineLaptop.getStorageInGB() + " GB");

    }

    /**
     * Main method of the program
     * @param args computer related information to be given
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your computer name: ");
        String name = scanner.next();
        System.out.print("Your computer CPU: ");
        String cpu = scanner.next();
        System.out.print("Your computer memory size in Gigabytes(must be an integer number): ");
        int memory = Integer.parseInt(scanner.next());
        System.out.print("Your computer hard disk size in Gigabytes(must be an integer number): ");
        int hdsize = Integer.parseInt(scanner.next());

        Computer computer = new Computer();
        computer.setName(name);
        computer.setCpu(cpu);
        computer.setMemeoryInGB(memory);
        computer.setStorageInGB(hdsize);

        System.out.println("Your computer information is as below:");
        System.out.println(computer.toString());

    }
}

