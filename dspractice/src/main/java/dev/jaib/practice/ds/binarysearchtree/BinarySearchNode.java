package dev.jaib.practice.ds.binarysearchtree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearchNode
{
	private static final Logger logger = LoggerFactory.getLogger(BinarySearchNode.class);

	private int data;
	private BinarySearchNode leftChild;
	private BinarySearchNode rightChild;

	public BinarySearchNode(int data)
	{
		this.data = data;
	}

	public void insert(BinarySearchNode root, int data)
	{
		if( data == root.getData() )
		{
			logger.info("data is already saved in tree");
		}
		else if( data < root.getData() )
		{
			if( root.getLeftChild() == null )
			{
				root.setLeftChild(new BinarySearchNode(data));
			}
			else
			{
				root.insert(root.getLeftChild(), data);
			}
		}
		else
		{
			if( root.getRightChild() == null )
			{
				root.setRightChild(new BinarySearchNode(data));
			}
			else
			{
				root.insert(root.getRightChild(), data);
			}
		}
	}

	public void preOrderTraversal(BinarySearchNode root)
	{
		if( root == null )
		{
			return;
		}
		System.out.print(root.getData() + " ");
		preOrderTraversal(root.getLeftChild());
		preOrderTraversal(root.getRightChild());
	}

	public void inOrderTraversal(BinarySearchNode root)
	{
		if( root == null )
		{
			return;
		}
		inOrderTraversal(root.getLeftChild());
		System.out.print(root.getData() + " ");
		inOrderTraversal(root.getRightChild());
	}

	public void postOrderTraversal(BinarySearchNode root)
	{
		if( root == null )
		{
			return;
		}
		postOrderTraversal(root.getLeftChild());
		postOrderTraversal(root.getRightChild());
		System.out.print(root.getData() + " ");
	}

	public BinarySearchNode search(int value)
	{
		BinarySearchNode node = null;
		if( value == data )
		{
			return this;
		}
		else if( value < data )
		{
			if(leftChild != null)
			{
				node = leftChild.search(value);
			}
		}
		else
		{
			if(rightChild != null)
			{
				node = rightChild.search(value);
			}
		}

		return node;
	}

	public int min(BinarySearchNode node)
	{
		if( node.getLeftChild() == null )
		{
			return node.getData();
		}

		return min(node.getLeftChild());
	}

	public int max(BinarySearchNode node)
	{
		if( node.getRightChild() == null )
		{
			return node.getData();
		}

		return max(node.getRightChild());
	}

	public int getData()
	{
		return data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public BinarySearchNode getLeftChild()
	{
		return leftChild;
	}

	public void setLeftChild(BinarySearchNode leftChild)
	{
		this.leftChild = leftChild;
	}

	public BinarySearchNode getRightChild()
	{
		return rightChild;
	}

	public void setRightChild(BinarySearchNode rightChild)
	{
		this.rightChild = rightChild;
	}
}
