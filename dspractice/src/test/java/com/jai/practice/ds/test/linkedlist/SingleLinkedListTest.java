package com.jai.practice.ds.test.linkedlist;

import com.jai.practice.ds.linkedlist.SingleLinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleLinkedListTest
{
	private static final Logger logger = LoggerFactory.getLogger(SingleLinkedListTest.class);

	@Test
	public void testAddElementAtHead()
	{
		SingleLinkedList list = new SingleLinkedList();
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
		SingleLinkedList list = new SingleLinkedList();
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
		SingleLinkedList list = new SingleLinkedList();
		list.addElementAtHead(1);
		logger.info("testDeleteElement List: {}", list);
		Assert.assertEquals("size of the linked list: ", 1, list.size());
		final int element = list.deleteElement();
		logger.info("testDeleteElement List: {}", list);
		Assert.assertEquals(1, element);
		Assert.assertEquals("size of the linked list: ", 0, list.size());
	}
}
