package com.jai.practice.ds.test.linkedlist;

import com.jai.practice.ds.linkedlist.CircularDoublyLinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CircularDoublyLinkedListTest
{
	private static final Logger logger = LoggerFactory.getLogger(CircularDoublyLinkedListTest.class);

	@Test
	public void testAddElementAtHead()
	{
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtHead(i);
		}
		logger.info("CircularDoublyLinkedListTest testAddElementAtHead List: {}", list);
		Assert.assertEquals("size of the linked list: ", 5, list.size());
	}

	@Test
	public void testAddElementAtTail()
	{
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtTail(i);
		}
		logger.info("CircularDoublyLinkedListTest testAddElementAtTail List: {}", list);
		Assert.assertEquals("size of the linked list: ", 5, list.size());
	}

	@Test
	public void testDeleteElementAtHead()
	{
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		list.addElementAtHead(1);
		logger.info("CircularDoublyLinkedListTest testDeleteElementAtHead List: {}", list);
		Assert.assertEquals("size of the linked list: ", 1, list.size());
		final int element = list.deleteElementFromHead();
		logger.info("CircularDoublyLinkedListTest testDeleteElementAtHead List: {}", list);
		Assert.assertEquals(1, element);
		Assert.assertEquals("size of the linked list: ", 0, list.size());
	}

	@Test
	public void testDeleteElementAtTail()
	{
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		list.addElementAtHead(1);
		logger.info("CircularDoublyLinkedListTest testDeleteElementAtTail List: {}", list);
		Assert.assertEquals("size of the linked list: ", 1, list.size());
		final int element = list.deleteElementFromTail();
		logger.info("CircularDoublyLinkedListTest testDeleteElementAtTail List: {}", list);
		Assert.assertEquals(1, element);
		Assert.assertEquals("size of the linked list: ", 0, list.size());
	}
}
