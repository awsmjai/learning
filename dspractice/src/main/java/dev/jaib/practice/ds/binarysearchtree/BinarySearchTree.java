package dev.jaib.practice.ds.binarysearchtree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class BinarySearchTree
{
	private static final Logger logger = LoggerFactory.getLogger(BinarySearchTree.class);

	private BinarySearchNode root;

	public void insert(int data)
	{
		if( Objects.isNull(root) )
		{
			root = new BinarySearchNode(data);
		}
		else
		{
			root.insert(root, data);
		}
	}

	public void preOrderTraversal()
	{
		if( Objects.isNull(root) )
		{
			logger.info("Binary Search Tree is Empty!");
		}
		else
		{
			root.preOrderTraversal(root);
		}
	}

	public void inOrderTraversal()
	{
		if( Objects.isNull(root) )
		{
			logger.info("Binary Search Tree is Empty!");
		}
		else
		{
			root.inOrderTraversal(root);
		}
	}

	public void postOrderTraversal()
	{
		if( Objects.isNull(root) )
		{
			logger.info("Binary Search Tree is Empty!");
		}
		else
		{
			root.postOrderTraversal(root);
		}
	}

	public BinarySearchNode search(int data)
	{
		BinarySearchNode node = null;
		if( Objects.isNull(root) )
		{
			logger.info("Binary Search Tree is Empty!");
		}
		else
		{
			node = root.search(data);
		}

		return node;
	}

	public int min()
	{
		int min = Integer.MIN_VALUE;
		if( Objects.isNull(root) )
		{
			logger.info("Binary Search Tree is Empty!");
		}
		else
		{
			min = root.min(root);
		}
		return min;
	}

	public int max()
	{
		int max = Integer.MAX_VALUE;
		if( Objects.isNull(root) )
		{
			logger.info("Binary Search Tree is Empty!");
		}
		else
		{
			max = root.max(root);
		}
		return max;
	}

	public void delete(int data)
	{
		if( Objects.isNull(root) )
		{
			logger.info("Binary Search Tree is Empty!");
		}
		else
		{
			root = delete(root, data);
		}
	}

	private BinarySearchNode delete(BinarySearchNode node, int data)
	{
		if( node == null )
		{
			return null;
		}
		if( data < node.getData() )
		{
			node.setLeftChild(delete(node.getLeftChild(), data));
		}
		else if( data > node.getData() )
		{
			node.setRightChild(delete(node.getRightChild(), data));
		}
		else
		{
			// Case 1: if node is leaf node, means does not have child
			if( node.getLeftChild() == null && node.getRightChild() == null )
			{
				System.out.println("Removing leaf node");
				return null;
			}
			// Case 2: if node has one child
			if( node.getLeftChild() == null )
			{
				System.out.println("Removing right child node");
				return node.getRightChild();
			}
			else if( node.getRightChild() == null )
			{
				System.out.println("Removing left child node");
				return node.getLeftChild();
			}
			// Case 3: Node has 2 children
			else
			{
				System.out.println("Removing the node with two children");
				// step 1: find the predecessor node value
				int predecessorValue = node.getLeftChild().max(node.getLeftChild());
				node.setData(predecessorValue);

				// step 1: Delete the predecessor node
				node.setLeftChild(delete(node.getLeftChild(), node.getData()));

			}
		}
		return node;
	}

	@Override
	public String toString()
	{
		inOrderTraversal();
		return "";
	}
}
