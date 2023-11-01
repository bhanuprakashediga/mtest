import controller.CeilingFanController;
import service.CeilingFanService;

import java.util.Scanner;


public class CeilingFan {

    public static void main(String[] args) {
        CeilingFanService ceilingFanService = new CeilingFanService();
        CeilingFanController ceilingFanController = new CeilingFanController(ceilingFanService);
        System.out.println("Greetings, The fan is not moving, but it is turned on and facing forward.\n" + "\n" + "1. Pull this cord to increase the speed of the fan.\n" + "2. Pull this cord to switch the direction of the fan.\n" + "Enter your option: ");
        while (true) {
            Scanner in = new Scanner(System.in);
            int line = 0;
            try {
                line = in.nextInt();
                switch (line) {
                    case 1:
                        ceilingFanController.pullSpeedCord();
                        break;
                    case 2:
                        ceilingFanController.pullDirectionCord();
                        break;
                    default:
                        System.out.println(("You picked a wrong cord, please go for 1 or 2 instead"));
                        break;
                }
                ceilingFanController.getStatus();
            } catch (Exception e) {
                throw new RuntimeException("My apologies!, Invalid entry");
            }

        }

    }




}