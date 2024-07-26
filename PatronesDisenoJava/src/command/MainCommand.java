package command;
import command.receptor.Light;
import command.receptor.GarageDoor;
import command.commandAction.GarageDoorOpenCommand;
import command.commandAction.GarageDoorCloseCommand;
import command.commandAction.LightOffCommand;
import command.commandAction.LightOnCommand;

public class MainCommand {
    public static void main(String[] args) {
        // Crear los receptores
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // Crear los comandos
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command garageOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageClose = new GarageDoorCloseCommand(garageDoor);

        // Crear el invocador
        RemoteControl remote = new RemoteControl();

        // Encender la luz
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();

        // Apagar la luz
        remote.setCommand(lightOff);
        remote.pressButton();
        remote.pressUndo();

        // Abrir la puerta del garaje
        remote.setCommand(garageOpen);
        remote.pressButton();
        remote.pressUndo();

        // Cerrar la puerta del garaje
        remote.setCommand(garageClose);
        remote.pressButton();
        remote.pressUndo();
    }
}
