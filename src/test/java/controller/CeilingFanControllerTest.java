package controller;

import org.junit.Before;
import org.junit.Test;
import service.CeilingFanService;

import static org.junit.Assert.*;

public class CeilingFanControllerTest {
    private CeilingFanService fanService;
    private CeilingFanController fanController;

    @Before
    public void setUp() {
        fanService = new CeilingFanService();
        fanController = new CeilingFanController(fanService);
    }

    @Test
    public void testPullSpeedCordWithController() {
        fanController.pullSpeedCord();
        assertEquals(1, fanService.getCurrentSpeed());

        fanController.pullSpeedCord();
        assertEquals(2, fanService.getCurrentSpeed());
    }

    @Test
    public void testPullDirectionCordWithController() {
        fanController.pullDirectionCord();
        assertEquals("Reverse",fanService.getDirection());

        fanController.pullDirectionCord();
        assertEquals("Forward",fanService.getDirection());
    }
}
