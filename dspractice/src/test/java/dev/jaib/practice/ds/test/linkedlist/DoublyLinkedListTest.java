package dev.jaib.practice.ds.test.linkedlist;

import dev.jaib.practice.ds.linkedlist.DoublyLinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoublyLinkedListTest
{
	private static final Logger logger = LoggerFactory.getLogger(DoublyLinkedListTest.class);

	@Test
	public void testAddElementAtHead()
	{
		DoublyLinkedList list = new DoublyLinkedList();
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtHead(i);
		}
		logger.info("DoublyLinkedListTest testAddElementAtHead List: {}", list);
		Assert.assertEquals("size of the linked list: ", 5, list.size());
	}

	@Test
	public void testAddElementAtTail()
	{
		DoublyLinkedList list = new DoublyLinkedList();
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtTail(i);
		}
		logger.info("DoublyLinkedListTest testAddElementAtTail List: {}", list);
		Assert.assertEquals("size of the linked list: ", 5, list.size());
	}

	@Test
	public void testDeleteElementAtHead()
	{
		DoublyLinkedList list = new DoublyLinkedList();
		list.addElementAtHead(1);
		logger.info("DoublyLinkedListTest testDeleteElementAtHead List: {}", list);
		Assert.assertEquals("size of the linked list: ", 1, list.size());
		final int element = list.deleteElementFromHead();
		logger.info("DoublyLinkedListTest testDeleteElementAtHead List: {}", list);
		Assert.assertEquals(1, element);
		Assert.assertEquals("size of the linked list: ", 0, list.size());
	}

	@Test
	public void testDeleteElementAtTail()
	{
		DoublyLinkedList list = new DoublyLinkedList();
		list.addElementAtHead(1);
		logger.info("DoublyLinkedListTest testDeleteElementAtTail List: {}", list);
		Assert.assertEquals("size of the linked list: ", 1, list.size());
		final int element = list.deleteElementFromTail();
		logger.info("DoublyLinkedListTest testDeleteElementAtTail List: {}", list);
		Assert.assertEquals(1, element);
		Assert.assertEquals("size of the linked list: ", 0, list.size());
	}
}
