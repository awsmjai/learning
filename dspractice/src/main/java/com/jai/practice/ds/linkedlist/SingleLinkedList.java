package com.jai.practice.ds.linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleLinkedList
{
	private static final Logger logger = LoggerFactory.getLogger(SingleLinkedList.class);
	private Node head = null;
	private Node tail = null;

	public void addElementAtHead(int data)
	{
		Node node = new Node();
		node.setData(data);
		if( head == null )
		{
			tail = node;
		}
		else
		{
			node.setNextNode(head);
		}
		head = node;
	}

	public void addElementAtTail(int data)
	{
		Node node = new Node();
		node.setData(data);
		if( head == null )
		{
			head = node;
		}
		else
		{
			tail.setNextNode(node);
		}
		tail = node;
	}

	public int deleteElement()
	{
		int deletedData = Integer.MIN_VALUE;
		if( head == null )
		{
			logger.info("Linked list doesn't have any element!");
		}
		else
		{
			deletedData = head.getData();
			if( head.getNextNode() == null )
			{
				tail = null;
				head = null;
			}
			else
			{
				head = head.getNextNode();
			}
		}
		return deletedData;
	}

	public int size()
	{
		int value = 1;
		int size;
		Node slow = head;
		Node fast = head;

		while(fast != null && fast.getNextNode() != null)
		{
			value++;
			slow = slow.getNextNode();
			fast = fast.getNextNode().getNextNode();
		}

		if( fast == null )  // for even number of linked list
		{
			size = (value - 1) * 2;
		}
		else                // for odd number of linked list
		{
			size = (value * 2) - 1;
		}

		return size;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("SingleLinkedList: [");
		if( head != null )
		{
			Node current = head;
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
