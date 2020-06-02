package dev.jaib.practice.ds.binarytree;

public class BinaryNode
{
	private int data;
	private BinaryNode leftChild;
	private BinaryNode rightChild;

	public BinaryNode(int data)
	{
		this.data = data;
	}

	public int getData()
	{
		return data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public BinaryNode getLeftChild()
	{
		return leftChild;
	}

	public void setLeftChild(BinaryNode leftChild)
	{
		this.leftChild = leftChild;
	}

	public BinaryNode getRightChild()
	{
		return rightChild;
	}

	public void setRightChild(BinaryNode rightChild)
	{
		this.rightChild = rightChild;
	}
}
