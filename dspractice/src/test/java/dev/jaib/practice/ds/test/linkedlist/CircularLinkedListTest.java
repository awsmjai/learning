package dev.jaib.practice.ds.test.linkedlist;

import dev.jaib.practice.ds.linkedlist.CircularLinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CircularLinkedListTest
{
	private static final Logger logger = LoggerFactory.getLogger(CircularLinkedListTest.class);

	@Test
	public void testAddElementAtHead()
	{
		CircularLinkedList list = new CircularLinkedList();
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtHead(i);
		}
		logger.info("testAddElementAtHead List: {}", list);
		Assert.assertEquals("size of the linked list: ", 5, list.size());
	}

	@Test
	public void testAddElementAtTail()
	{
		CircularLinkedList list = new CircularLinkedList();
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtTail(i);
		}
		logger.info("testAddElementAtTail List: {}", list);
		Assert.assertEquals("size of the linked list: ", 5, list.size());
	}

	@Test
	public void testDeleteElement()
	{
		CircularLinkedList list = new CircularLinkedList();
		list.addElementAtHead(1);
		logger.info("testDeleteElement List: {}", list);
		Assert.assertEquals("size of the linked list: ", 1, list.size());
		final int element = list.deleteElement();
		logger.info("testDeleteElement List: {}", list);
		Assert.assertEquals(1, element);
		Assert.assertEquals("size of the linked list: ", 0, list.size());
	}
}
