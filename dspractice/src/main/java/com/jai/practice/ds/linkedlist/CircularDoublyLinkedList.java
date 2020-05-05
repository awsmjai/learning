package com.jai.practice.ds.linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CircularDoublyLinkedList
{
	private static final Logger logger = LoggerFactory.getLogger(CircularDoublyLinkedList.class);
	private DoubleNode head = null;
	private DoubleNode tail = null;

	public void addElementAtHead(int data)
	{
		DoubleNode node = new DoubleNode();
		node.setData(data);
		if( head == null )
		{
			head = node;
			tail = node;
			head.setNextNode(head);
		}
		else
		{
			node.setNextNode(head);
			head.setPrevNode(node);
			head = node;
			tail.setNextNode(head);
		}
	}

	public void addElementAtTail(int data)
	{
		DoubleNode node = new DoubleNode();
		node.setData(data);
		if( head == null )
		{
			head = node;
			tail = node;
			head.setNextNode(head);
		}
		else
		{
			node.setPrevNode(tail);
			tail.setNextNode(node);
			tail = node;
			tail.setNextNode(head);
		}
	}

	public int deleteElementFromHead()
	{
		int deletedData = Integer.MIN_VALUE;
		if( head == null )
		{
			logger.info("CircularDoublyLinkedList is empty!");
		}
		else
		{
			deletedData = head.getData();
			if( head.getNextNode() == head )
			{
				head = null;
				tail = null;
			}
			else
			{
				head = head.getNextNode();
				head.setPrevNode(null);
				tail.setNextNode(head);
			}
		}

		return deletedData;
	}

	public int deleteElementFromTail()
	{
		int deletedData = Integer.MIN_VALUE;
		if( head == null )
		{
			logger.info("CircularDoublyLinkedList is empty!");
		}
		else
		{
			deletedData = tail.getData();
			if( head.getNextNode() == head )
			{
				head = null;
				tail = null;
			}
			else
			{
				tail = tail.getPrevNode();
				tail.setNextNode(head);
			}
		}

		return deletedData;
	}

	public int size()
	{
		int value = 1;
		int size = 0;
		DoubleNode start = head;
		DoubleNode end = tail;

		if( head != null )
		{
			while(start != null && end != null && start != end & start.getNextNode() != end.getPrevNode())
			{
				value++;
				start = start.getNextNode();
				end = end.getPrevNode();
			}

			if( start == end )  // for even number of linked list
			{
				size = (value * 2) - 1;
			}
			else                // for odd number of linked list
			{
				size = (value * 2) + 1;
			}
		}

		return size;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("CircularDoublyLinkedList: [");
		if( head != null )
		{
			DoubleNode current = head;
			while(current.getNextNode() != head)
			{
				builder.append(current.getData())
						.append(" -> ");
				current = current.getNextNode();
			}
			builder.append(current.getData()).append(" -> ");
			builder.append("--");
		}
		builder.append("]");
		return builder.toString();
	}
}
