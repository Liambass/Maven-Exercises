package com.qa.personexercise;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


//Include @RunWith annotation here: Check community if needed.
@RunWith(MockitoJUnitRunner.class)
public class MenuTest {

	// Create your mocks
	@Mock
	private PersonCreator pc;
	
	
	// Inject your mocks
	@InjectMocks
	private Menu menu;
	
	
	// Write your tests for all 4 methods in the 'Menu' class
	@Test
	public void testCreateFullPerson() {
		Person p = new Person("Name", "Title", 42);
		
		Mockito.when(pc.createFullPerson("Name", "Title", 42)).thenReturn(p);
		
		assertEquals(p, menu.createFullPerson("Name", "Title", 42));
	}
	
	@Test
	public void testcreateJoblessPerson() {
		Person p = new Person("Name", 42);
		
		Mockito.when(pc.createJoblessPerson("Name", 42)).thenReturn(p);
		
		assertEquals(p, menu.createJoblessPerson("Name", 42));
	}
	
	@Test
	public void createAgelessPerson() {
		Person p = new Person("Name", "Title");
		
		Mockito.when(pc.createAgelessPerson("Name", "Title")).thenReturn(p);
		
		assertEquals(p, menu.createAgelessPerson("Name", "Title"));
	}
	
	@Test
	public void createNameOnlyPerson() {
		Person p = new Person("Name");
		
		Mockito.when(pc.createNameOnlyPerson("Name")).thenReturn(p);
		
		assertEquals(p, menu.createNameOnlyPerson("Name"));
	}
	
	
	// If done correctly, PersonCreator should have 0% coverage.
	// Note: Person.java will have coverage but it's a POJO (Plain Old Java Object)
	// So therefore this is okay in a unit test, as its extremely fast to test.
}
