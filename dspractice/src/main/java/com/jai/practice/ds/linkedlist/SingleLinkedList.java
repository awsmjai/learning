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
		if( isEmptyList() )
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
		if( isEmptyList() )
		{
			head = node;
		}
		else
		{
			tail.setNextNode(node);
		}
		tail = node;
	}

	public void addElementAt(int data, int location)
	{
		if( location < 0 || location > size() )
		{
			logger.error("wrong location given!");
			return;
		}

		if( location == 0 || isEmptyList() )
		{
			addElementAtHead(data);
		}
		else if( location == size() )
		{
			addElementAtTail(data);
		}
		else
		{
			Node node = new Node();
			node.setData(data);
			Node current = head;
			for( int i = 1; i < location - 1; i++ )
			{
				current = current.getNextNode();
			}
			node.setNextNode(current.getNextNode());
			current.setNextNode(node);
		}
	}

	public int deleteElement()
	{
		int deletedData = Integer.MIN_VALUE;
		if( isEmptyList() )
		{
			logger.info("SingleLinkedList is empty!");
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

	public int deleteElementAt(int location)
	{
		int deletedData = Integer.MIN_VALUE;

		if( location < 0 || location > size() )
		{
			logger.error("wrong location given!");
			return deletedData;
		}

		if( isEmptyList() )
		{
			logger.error("list empty!");
		}

		if( location == 0 )
		{
			deletedData = deleteElement();
		}
		else
		{
			Node current = head;
			for( int i = 1; i < location - 1; i++ )
			{
				current = current.getNextNode();
			}
			deletedData = current.getNextNode().getData();
			current.setNextNode(current.getNextNode().getNextNode());
			if( location == size() )
			{
				tail = current;
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

	public int search(int data)
	{
		int position = Integer.MIN_VALUE;
		if( isEmptyList() )
		{
			logger.error("empty list!");
			return position;
		}
		int value = 0;
		Node current = head;
		while(current != null)
		{
			if( current.getData() == data )
			{
				position = value;
				break;
			}
			value++;
			current = current.getNextNode();
		}

		return position;

	}

	public boolean isEmptyList()
	{
		return head == null;
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
