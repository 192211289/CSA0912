// Class representing a general device
public abstract class Device {
    protected String id;
    protected String status;

    public Device(String id) {
        this.id = id;
        this.status = "off"; // Default status is off
    }

    public void turnOn() {
        this.status = "on"; // Method to turn the device on
    }

    public void turnOff() {
        this.status = "off"; // Method to turn the device off
    }

    public String getStatus() {
        return status; // Method to get the current status
    }

    public abstract void displayStatus(); // Abstract method to display the status
}

// Light class extending Device
public class Light extends Device {
    private int brightness;

    public Light(String id, int brightness) {
        super(id); // Call parent constructor
        this.brightness = brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness; // Method to set brightness
    }

    @Override
    public void displayStatus() {
        System.out.println("Light " + id + " is " + status + " with brightness " + brightness);
    }
}

// Thermostat class extending Device
public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String id, int temperature) {
        super(id); // Call parent constructor
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature; // Method to set temperature
    }

    @Override
    public void displayStatus() {
        System.out.println("Thermostat " + id + " is " + status + " and set to " + temperature + " degrees.");
    }
}

// Main class to test devices
public class SmartHomeController {
    public static void main(String[] args) {
        // Creating instances of Light and Thermostat
        Light livingRoomLight = new Light("LR001", 70);
        Thermostat homeThermostat = new Thermostat("T001", 22);

        // Turning on the devices
        livingRoomLight.turnOn();
        homeThermostat.turnOn();

        // Adjusting the thermostat
        homeThermostat.setTemperature(24);

        // Display the status of both devices
        livingRoomLight.displayStatus();
        homeThermostat.displayStatus();
    }
}
