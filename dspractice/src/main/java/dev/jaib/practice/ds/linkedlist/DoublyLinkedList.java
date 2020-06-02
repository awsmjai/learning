package dev.jaib.practice.ds.linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoublyLinkedList
{
	private static final Logger logger = LoggerFactory.getLogger(DoublyLinkedList.class);
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
		}
		else
		{
			node.setNextNode(head);
			head.setPrevNode(node);
			head = node;
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
		}
		else
		{
			node.setPrevNode(tail);
			tail.setNextNode(node);
			tail = node;
		}
	}

	public int deleteElementFromHead()
	{
		int elementDeleted = Integer.MIN_VALUE;
		if( head == null )
		{
			logger.info("DoublyLinkedList is empty!");
		}
		else
		{
			elementDeleted = head.getData();
			if( head.getNextNode() == null )
			{
				tail = null;
				head = null;
			}
			else
			{
				head = head.getNextNode();
				head.setPrevNode(null);
			}
		}

		return elementDeleted;
	}

	public int deleteElementFromTail()
	{
		int elementDeleted = Integer.MIN_VALUE;
		if( head == null )
		{
			logger.info("DoublyLinkedList is empty!");
		}
		else
		{
			elementDeleted = tail.getData();
			if( head.getNextNode() == null )
			{
				head = null;
				tail = null;
			}
			else
			{
				tail = tail.getPrevNode();
				tail.setNextNode(null);
			}
		}

		return elementDeleted;
	}

	public int size()
	{
		int value = 1;
		int size = 0;
		DoubleNode start = head;
		DoubleNode end = tail;

		if( head != null )
		{
			while(start != null && tail != null && start != end & start.getNextNode() != end.getPrevNode())
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
		builder.append("DoublyLinkedList: [");
		if( head != null )
		{
			DoubleNode current = head;
			while(current != null)
			{
				builder.append(current.getData())
						.append(" -> ");
				current = current.getNextNode();
			}
			builder.append("null");
		}
		builder.append("]");
		return builder.toString();
	}
}
