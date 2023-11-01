package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CeilingFanServiceTest {
    private CeilingFanService fanService;

    @Before
    public void setUp() {
        fanService = new CeilingFanService();
    }

    @Test
    public void testPullSpeedCord() {
        fanService.pullSpeedCord();
        assertEquals(1, fanService.getCurrentSpeed());

        fanService.pullSpeedCord();
        assertEquals(2, fanService.getCurrentSpeed());

        fanService.pullSpeedCord();
        assertEquals(3, fanService.getCurrentSpeed());

        fanService.pullSpeedCord();
        assertEquals(0, fanService.getCurrentSpeed());
    }

    @Test
    public void testPullDirectionCord() {
        fanService.pullDirectionCord();
        assertEquals("Reverse",fanService.getDirection());

        fanService.pullDirectionCord();
        assertEquals("Forward",fanService.getDirection());

        fanService.pullDirectionCord();
        assertEquals("Reverse",fanService.getDirection());
    }
}
