package dev.jaib.practice.ds.binarytree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BinaryTree
{
	private static final Logger logger = LoggerFactory.getLogger(BinaryTree.class);
	private BinaryNode root;

	public void insert(int data)
	{
		BinaryNode node = new BinaryNode(data);
		if( root == null )
		{
			root = node;
		}
		else
		{
			Queue<BinaryNode> queue = new LinkedList<>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryNode tempNode = queue.poll();
				if( tempNode.getLeftChild() == null )
				{
					tempNode.setLeftChild(node);
					return;
				}
				else if( tempNode.getRightChild() == null )
				{
					tempNode.setRightChild(node);
					return;
				}
				else
				{
					queue.add(tempNode.getLeftChild());
					queue.add(tempNode.getRightChild());
				}
			}
		}
	}

	public void preOrderTraversal()
	{
		if( Objects.isNull(root) )
		{
			logger.info("Binary Tree is Empty!");
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
			logger.info("Binary Tree is Empty!");
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
			logger.info("Binary Tree is Empty!");
		}
		else
		{
			root.postOrderTraversal(root);
		}
	}

	public void levelOrderTraversal()
	{
		if( Objects.isNull(root) )
		{
			logger.info("Binary Tree is Empty!");
		}
		else
		{
			Queue<BinaryNode> queue = new LinkedList<>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryNode tempNode = queue.poll();
				System.out.print(tempNode.getData() + " ");
				if( tempNode.getLeftChild() != null )
				{
					queue.add(tempNode.getLeftChild());
				}

				if( tempNode.getRightChild() != null )
				{
					queue.add(tempNode.getRightChild());
				}
			}
		}
	}

	/*
	 * To delete a specific data from binary tree.
	 * */
	public void delete(int data)
	{
		if( Objects.isNull(root) )
		{
			logger.info("Binary Tree is Empty!");
		}
		else
		{
			Queue<BinaryNode> queue = new LinkedList<>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryNode tempNode = queue.poll();

				// 1) find the element to be deleted
				if( tempNode.getData() == data )
				{
					// 2) find the deepest node of the tree and delete it
					tempNode.setData(findAndDeleteDeepestNode());
					return;
				}
				if( tempNode.getLeftChild() != null )
				{
					queue.add(tempNode.getLeftChild());
				}
				if( tempNode.getRightChild() != null )
				{
					queue.add(tempNode.getRightChild());
				}
			}
		}
	}

	private int findAndDeleteDeepestNode()
	{
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		int data = Integer.MAX_VALUE;
		BinaryNode prevNode = null;
		BinaryNode currentNode = null;
		while(!queue.isEmpty())
		{
			prevNode = currentNode;
			currentNode = queue.poll();

			// Case 1) If left child is null means the deepest node is the leaf node with no sibling,
			// so we need to remove the previous root node right child according to the level order traversal
			if( currentNode.getLeftChild() == null )
			{
				data = prevNode.getRightChild().getData();
				prevNode.setRightChild(null);
				return data;
			}
			// Case 1) If right child is null means the deepest node is the leaf node with left child as sibling,
			// so we need to remove its sibling which is the current node left child according to the level order traversal
			else if( currentNode.getRightChild() == null )
			{
				data = currentNode.getLeftChild().getData();
				currentNode.setLeftChild(null);
				return data;
			}
			else
			{
				queue.add(currentNode.getLeftChild());
				queue.add(currentNode.getRightChild());
			}
		}
		return data;
	}

	public BinaryNode search(int data)
	{
		if( Objects.isNull(root) )
		{
			logger.info("Binary Tree is Empty!");
			return null;
		}
		else
		{
			Queue<BinaryNode> queue = new LinkedList<>();
			queue.add(root);

			while(!queue.isEmpty())
			{
				BinaryNode currentNode = queue.poll();
				if( currentNode.getData() == data )
				{
					return currentNode;
				}
				if( currentNode.getLeftChild() != null )
				{
					queue.add(currentNode.getLeftChild());
				}
				if( currentNode.getRightChild() != null )
				{
					queue.add(currentNode.getRightChild());
				}
			}

		}
		return null;
	}


	@Override
	public String toString()
	{
		levelOrderTraversal();
		return "";
	}

}