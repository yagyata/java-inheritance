class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    private float temperatureSetting;

    public Thermostat(String deviceId, String status, float temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device genericDevice = new Device("1522D", "Off");

        Thermostat thermostat = new Thermostat("T100", "On", 22.5f);

        genericDevice.displayStatus();
        System.out.println();
        thermostat.displayStatus();
    }
}
