package Design_patterns.Prototype;

public class VMInstance {

    private String hardDisk;
    private String operatingSystem;
    private boolean monitor;
    private String hostName;

    public VMInstance(String hostName, String operatingSystem, boolean monitor, String hardDisk){
        this.hostName = hostName;
        this.operatingSystem = operatingSystem;
        this.monitor = monitor;
        this.hardDisk = hardDisk;

    }

    public VMInstance(VMInstance original){
        this.hostName = original.hostName;
        this.monitor = original.monitor;
        this.hardDisk = original.hardDisk;
        this.operatingSystem = original.operatingSystem;
    }
    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isMonitor() {
        return monitor;
    }

    public void setMonitor(boolean monitor) {
        this.monitor = monitor;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
