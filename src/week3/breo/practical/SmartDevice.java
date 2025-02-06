package week3.breo.practical;

public class SmartDevice {
    private int deviceID;
    private String deviceName;
    private boolean isOn;
    private double batteryLevel;

    public SmartDevice(int deviceID, String deviceName, boolean isOn, double batteryLevel){
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.isOn = isOn;
        this.batteryLevel = batteryLevel;
    }
    /**
     * Switches device on/off (if on, turns it off. if off, turns it on)
     */
    public void deviceSwitch(){
        this.isOn = !this.isOn;
    }

    public void checkBattery(){
        System.out.println("The battery level: "+this.batteryLevel);
    }
    public void displayDetails(){
        System.out.println("Device details: "+
                            "\nDevice ID: "+this.deviceID+
                            "\nDevice Name: "+this.deviceName);
    }

    public static void main(String[] args) {
        SmartDevice d1 = new SmartDevice(1, "CCTV1", true, 88.7);
        SmartDevice d2 = new SmartDevice(2, "CCTV2", false, 10.0);
        d1.checkBattery();
        d2.checkBattery();
        d1.deviceSwitch();
    }
}
