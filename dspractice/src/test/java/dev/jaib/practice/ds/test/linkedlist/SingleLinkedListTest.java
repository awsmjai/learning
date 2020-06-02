package dev.jaib.practice.ds.test.linkedlist;

import dev.jaib.practice.ds.linkedlist.SingleLinkedList;
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
	public void testAddElementAtSpecificLocation()
	{
		SingleLinkedList list = new SingleLinkedList();
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtTail(i);
		}
		list.addElementAt(6, 5);
		list.addElementAt(7, 3);
		list.addElementAt(8, 0);
		logger.info("testAddElementAtTail List: {}", list);
		Assert.assertEquals("size of the linked list: ", 8, list.size());
	}


	@Test
	public void testAddElementAtSpecificLocationWithEmptyList()
	{
		SingleLinkedList list = new SingleLinkedList();
		list.addElementAt(8, 3);
		logger.info("testAddElementAtTail List: {}", list);
		Assert.assertEquals("size of the linked list: ", 0, list.size());
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

	@Test
	public void testDeleteElementWithEmptyList()
	{
		SingleLinkedList list = new SingleLinkedList();
		list.addElementAtHead(1);
		logger.info("testDeleteElement List: {}", list);
		Assert.assertEquals("size of the linked list: ", 1, list.size());
		final int element = list.deleteElement();
		logger.info("testDeleteElement List: {}", list);
		Assert.assertEquals(1, element);
		// deleting element from empty list
		final int data = list.deleteElement();
		Assert.assertEquals(Integer.MIN_VALUE, data);
	}

	@Test
	public void testDeleteElementAtWithEmptyList()
	{
		SingleLinkedList list = new SingleLinkedList();
		final int element = list.deleteElementAt(1);
		Assert.assertEquals(Integer.MIN_VALUE, element);
	}

	@Test
	public void testDeleteElementAt()
	{
		SingleLinkedList list = new SingleLinkedList();
		list.addElementAtHead(1);
		list.addElementAtHead(2);
		list.addElementAtHead(3);
		logger.info("testDeleteElement List: {}", list);
		Assert.assertEquals("size of the linked list: ", 3, list.size());
		final int element = list.deleteElementAt(1);
		logger.info("testDeleteElement List: {}", list);
		Assert.assertEquals(2, element);
		Assert.assertEquals("size of the linked list: ", 2, list.size());
	}

	@Test
	public void testSearchData()
	{
		SingleLinkedList list = new SingleLinkedList();

		// test searchElement when list is empty
		logger.info("testSearchData List: {}", list);
		final int position1 = list.search(2);
		Assert.assertEquals(Integer.MIN_VALUE, position1);

		// test searchElement when list is not empty
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtTail(i);
		}
		logger.info("testSearchData List: {}", list);
		final int position2 = list.search(2);
		Assert.assertEquals(2, position2);

		// test searchElement when element is not present in list
		logger.info("testSearchData List: {}", list);
		final int position3 = list.search(10);
		Assert.assertEquals(Integer.MIN_VALUE, position3);

	}

}
