package org.magnum.cs278.testdriven;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

/**
 * Created by clarkperkins on 10/14/14.
 *
 */
public class AppTestClark {

    private App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
    }

    @Test
    public void testGetParkSpecialPermitsByAttendance() throws Exception {
        List<Event> evts = app.getParkSpecialPermitsByAttendance();

        for (Event e : evts) {
            System.out.println(e.getLocation());
        }

        for (int i = 1; i < evts.size(); ++i) {
            int prev = Integer.parseInt(evts.get(i-1).getAttendance());
            int cur = Integer.parseInt(evts.get(i).getAttendance());

            assertTrue("Attendance out of order", prev >= cur);
        }
    }

    @Test
    public void testCheckLocation() throws Exception {
        List<Event> evts = app.checkLocation("Public Square Park");

        assertTrue("No events returned", evts.size() != 0);

        for (Event e : evts) {
            assertEquals("Locations don't match", e.getLocation(), "Public Square Park");
        }
    }

    @Test
    public void testGetAllEventsInMonth() throws Exception {
        List<Event> evts = app.getAllEventsInMonth("jun-2014");

        assertTrue("No events returned", evts.size() != 0);

        for (Event e : evts) {
            assertEquals("Months don't match", e.getMonth().toLowerCase(), "jun-2014");
        }

    }
}
