package com.jai.practice.ds.linkedlist;

public class DoubleNode
{
	private int data;
	private DoubleNode prevNode;
	private DoubleNode nextNode;

	public int getData()
	{
		return data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public DoubleNode getPrevNode()
	{
		return prevNode;
	}

	public void setPrevNode(DoubleNode prevNode)
	{
		this.prevNode = prevNode;
	}

	public DoubleNode getNextNode()
	{
		return nextNode;
	}

	public void setNextNode(DoubleNode nextNode)
	{
		this.nextNode = nextNode;
	}
}
