public class Thermostat implements Device {
    @Override
    public void increaseTemperature() {
        System.out.println("Thermostat temperature increased");
    }
}