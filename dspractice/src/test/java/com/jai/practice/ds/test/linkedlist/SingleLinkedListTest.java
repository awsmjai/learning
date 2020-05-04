package com.jai.practice.ds.test.linkedlist;

import com.jai.practice.ds.linkedlist.SingleLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class SingleLinkedListTest
{
	@Test
	public void testAddElementAtHead()
	{
		SingleLinkedList list = new SingleLinkedList();
		for( int i = 0; i < 5; i++ )
		{
			list.addElementAtHead(i);
		}
		System.out.println("testAddElementAtHead List: " + list);
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
		System.out.println("testAddElementAtTail List: " + list);
		Assert.assertEquals("size of the linked list: ", 5, list.size());
	}

	@Test
	public void testDeleteElement()
	{
		SingleLinkedList list = new SingleLinkedList();
		list.addElementAtHead(1);
		System.out.println("testDeleteElement List: " + list);
		Assert.assertEquals("size of the linked list: ", 1, list.size());
		list.deleteElement();
		System.out.println("testDeleteElement List: " + list);
		Assert.assertEquals("size of the linked list: ", 0, list.size());	}
}
