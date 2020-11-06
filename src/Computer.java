/**
 * This is a Computer class
 */
public class Computer {
    private String name;
    private String cpu;
    private int memeoryInGB;
    private int storageInGB;

    /**
     * Constructor method
     *
     * @param name        name of the computer
     * @param cpu         cpu of the computer
     * @param memeoryInGB memory size in Gigabytes
     * @param storageInGB storage size in Gigabytes
     */
    public Computer(String name, String cpu, int memeoryInGB, int storageInGB) {
        this.name = name;
        this.cpu = cpu;
        this.memeoryInGB = memeoryInGB;
        this.storageInGB = storageInGB;
    }

    public Computer() {
    }

    /**
     * @return computer's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * @param cpu
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * @return memeory size in Gigabytes
     */
    public int getMemeoryInGB() {
        return memeoryInGB;
    }

    /**
     * @param memeoryInGB memory size in Gigabytes
     */
    public void setMemeoryInGB(int memeoryInGB) {
        this.memeoryInGB = memeoryInGB;
    }

    /**
     * @return storage size in Gigabytes
     */
    public int getStorageInGB() {
        return storageInGB;
    }

    /**
     * @param storageInGB storage size in Gigabytes
     */
    public void setStorageInGB(int storageInGB) {
        this.storageInGB = storageInGB;
    }

    /**
     * Turn off the computer
     */
    public void turnoff() {
        System.out.println("The computer " + this.getName() + " is turned off");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memeoryInGB=" + memeoryInGB +
                ", storageInGB=" + storageInGB +
                '}';
    }
}

