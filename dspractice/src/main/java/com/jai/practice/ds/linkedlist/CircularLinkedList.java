package com.jai.practice.ds.linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CircularLinkedList
{
	private static final Logger logger = LoggerFactory.getLogger(CircularLinkedList.class);

	private int data;
	private Node head = null;
	private Node tail = null;

	public void addElementAtHead(int data)
	{
		Node node = new Node();
		node.setData(data);
		if( head == null )
		{
			head = node;
			tail = node;
			node.setNextNode(node);
		}
		else
		{
			node.setNextNode(head);
			head = node;
			tail.setNextNode(head);
		}
	}

	public void addElementAtTail(int data)
	{
		Node node = new Node();
		node.setData(data);
		if( head == null )
		{
			head = node;
			tail = node;
			node.setNextNode(node);
		}
		else
		{
			tail.setNextNode(node);
			tail = node;
			tail.setNextNode(head);
		}
	}

	public int deleteElement()
	{
		int deletedData = Integer.MIN_VALUE;
		if( head == null )
		{
			logger.info("list is already empty!");
		}
		else
		{
			deletedData = head.getData();
			if( head.getNextNode() == head )
			{
				head.setNextNode(null);
				head = null;
				tail = null;
			}
			else
			{
				head = head.getNextNode();
				tail.setNextNode(head);
			}
		}

		return deletedData;
	}

	public int size()
	{
		int value = 1;
		int size = 0;
		Node slow = head;
		Node fast = head;

		if( fast != null )
		{
			while(fast.getNextNode() != head && fast.getNextNode().getNextNode() != head)
			{
				value++;
				slow = slow.getNextNode();
				fast = fast.getNextNode().getNextNode();
			}

			if( fast.getNextNode() != head )  // for even number of linked list
			{
				size = value * 2;
			}
			else                // for odd number of linked list
			{
				size = (value * 2) - 1;
			}
		}

		return size;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("CircularLinkedList: [");
		if( head != null )
		{
			Node current = head;
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
