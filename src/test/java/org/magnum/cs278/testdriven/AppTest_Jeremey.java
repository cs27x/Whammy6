package org.magnum.cs278.testdriven;


import java.util.List;

import org.junit.Before;
import org.magnum.cs278.testdriven.App;
import org.magnum.cs278.testdriven.Event;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class AppTest_Jeremey {

	private App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
    }

    @Test
	public void TestGetEventsInJune() throws Exception 
	{
		List<Event> juneEvents = app.getEventsInJune();
		assertNotNull(juneEvents);
		
		for(Event curEvent : juneEvents)
		{
			assertNotNull(curEvent);
			assertNotNull(curEvent.getMonth());
			
			assertEquals(curEvent.getMonth(),"Jun");
		}
	}
	
	@Test
    public void TestGetRiverfrontParkSpecialPermits() throws Exception 
	{
		List<Event> riverEvents = app.getRiverfrontParkSpecialPermits();
		assertNotNull(riverEvents);
		
		for(Event curEvent : riverEvents)
		{
			assertNotNull(curEvent);
			assertNotNull(curEvent.getLocation());
			
			assertEquals(curEvent.getLocation(),"Riverfront Park");
		}
    }
	
	@Test
	public void TestAttendanceGreaterThanFive() throws Exception 
	{
		List<Event> events = app.AttendanceGreaterThanFive();
		assertNotNull(events);
		
		for(Event curEvent : events)
		{
			assertNotNull(curEvent);
			assertNotNull(curEvent.getAttendance());
			
			assertTrue(Integer.parseInt(curEvent.getAttendance()) > 5);
		}

	}

	@Test
	public void TestGetParkSpecialPermitsByAttendance() throws Exception 
	{
		List<Event> events = app.getParkSpecialPermitsByAttendance();
		assertNotNull(events);
		
		for(Event curEvent : events)
		{
			assertNotNull(curEvent);
		}
	}
}
