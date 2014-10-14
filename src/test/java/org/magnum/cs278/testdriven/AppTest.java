package org.magnum.cs278.testdriven;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.Module.SetupContext;

public class AppTest {

	
	@Test
	public void testGetThreeThingsToDo() throws Exception {
		App testApp = new App();
		DateTime now = DateTime.now();
		List<Event> toDo = testApp.getThreeThingsToDo();
		assertNotNull(toDo);
		assertEquals(3, toDo.size());
		Event event = toDo.get(0);
		assertTrue(event.getDateTime().isAfter(now));
	}
	
	@Test
	public void testGetParkSpecialPermits() throws Exception {
		App testApp = new App();
		List<Event> sp = testApp.getParkSpecialPermits();
		assertNotNull(sp);
		assertNotEquals(0, sp.size());
	}
	
	@Test
	public void testGetEventsWithLocation() throws Exception {
		App testApp = new App();
		List<Event> eventWithLoc = testApp.getEventsWithLocation("Riverfront Park/Court of Flags");
		assertNotNull(eventWithLoc);
		assertNotEquals(0, eventWithLoc);
		assertEquals("Resolution Run", eventWithLoc.get(0).getName());
	}
	
	@Test
	public void testGetTodaysEvents()throws Exception {
		App testApp = new App();
		List<Event> todaysEvents = testApp.getTodaysEvents();
		assertEquals(0, todaysEvents.size());
	}
	


}
