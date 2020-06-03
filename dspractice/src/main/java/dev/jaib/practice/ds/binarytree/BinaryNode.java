package dev.jaib.practice.ds.binarytree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryNode
{
	private static final Logger logger = LoggerFactory.getLogger(BinaryNode.class);
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

	public void preOrderTraversal(BinaryNode root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.getData() + " ");
		preOrderTraversal(root.getLeftChild());
		preOrderTraversal(root.getRightChild());
	}

	public void inOrderTraversal(BinaryNode root)
	{
		if(root == null)
		{
			return;
		}
		inOrderTraversal(root.getLeftChild());
		System.out.print(root.getData() + " ");
		inOrderTraversal(root.getRightChild());
	}

	public void postOrderTraversal(BinaryNode root)
	{
		if(root == null)
		{
			return;
		}
		postOrderTraversal(root.getLeftChild());
		postOrderTraversal(root.getRightChild());
		System.out.print(root.getData() + " ");
	}
}
