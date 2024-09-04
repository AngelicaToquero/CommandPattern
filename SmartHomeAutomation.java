public class SmartHomeAutomation {
    public static void main(String[] args) {
        // Create device instances
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Create command instances using the factory
        Command lightOn = CommandFactory.createCommand("LightOn", livingRoomLight);
        Command lightOff = CommandFactory.createCommand("LightOff", livingRoomLight);
        Command thermostatIncrease = CommandFactory.createCommand("ThermostatIncrease", thermostat);
        Command musicPlay = CommandFactory.createCommand("MusicPlayerPlay", musicPlayer);

        // Create smart home controller and set commands
        SmartHomeController controller = new SmartHomeController();
        controller.setCommand("lightOn", lightOn);
        controller.setCommand("lightOff", lightOff);
        controller.setCommand("increaseTemp", thermostatIncrease);
        controller.setCommand("playMusic", musicPlay);

        // Execute commands
        controller.executeCommand("lightOn");
        controller.executeCommand("increaseTemp");
        controller.executeCommand("playMusic");
        controller.executeCommand("lightOff");
    }
}
