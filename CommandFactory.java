public class CommandFactory {
    public static Command createCommand(String commandType, Object device) {
        switch (commandType) {
            case "LightOn":
                return new LightOnCommand((Light) device);
            case "LightOff":
                return new LightOffCommand((Light) device);
            case "ThermostatIncrease":
                return new ThermostatIncreaseCommand((Thermostat) device);
            case "MusicPlayerPlay":
                return new MusicPlayerPlayCommand((MusicPlayer) device);
            default:
                throw new IllegalArgumentException("Invalid command type");
        }
    }
}
