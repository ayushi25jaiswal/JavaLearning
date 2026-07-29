package Design_patterns.Prototype;

public class GPUInstance extends VMInstance {
    private String ram;

    public GPUInstance(VMInstance original, String ram) {
        super(original);
        this.ram = ram;
    }

    public GPUInstance(String hostName, String operatingSystem, boolean monitor, String hardDisk) {
        super(hostName, operatingSystem, monitor, hardDisk);
    }


    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
