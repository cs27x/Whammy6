package org.magnum.cs278.testdriven;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

public class TestDixius {

	private App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
    }

    @Test
	public void testGetTodaysEvents() throws Exception
	{
		List<Event> todaysEvents = app.getTodaysEvents();
		
		for (Event event : todaysEvents)
		{
			assertNotNull (event);
			assertNotNull (event.getDate());
		}
		
	}
	
	@Test
	public void testGetMarchEvents2014() throws Exception
	{
		List<Event> todaysEvents = app.getMarchEvents2014();
		
		for (Event event : todaysEvents)
		{
			assertNotNull (event);
			assertNotNull (event.getDate());
		}
		
		
	}
	
	@Test
	public void testGetFirstEventOfMonth() throws Exception
	{
		Event event = app.getFirstEventOfMonth("september");
		
			assertNotNull (event);
			assertNotNull (event.getDate());
		
	}
	
	@Test
	public void testGetEventsForMonth() throws Exception
	{
		List<Event> events = app.getEventsForMonth("september");
		
		for (Event event : events)
		{
			assertNotNull (event);
			assertNotNull (event.getDate());
		}
	}
	
	
}
