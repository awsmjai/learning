package dev.jaib.practice.ds.test.binarytree;

import dev.jaib.practice.ds.binarytree.BinaryTree;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryTreeTest
{
	private static final Logger logger = LoggerFactory.getLogger(BinaryTree.class);
	private static BinaryTree tree;

	@BeforeClass
	public static void initializeTempTree()
	{
		tree = new BinaryTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
	}

	@Test
	public void testBinaryTreeInsertion()
	{
		logger.info("Binary Tree: {}", tree);
	}

	@Test
	public void testBinaryTreePreOrderTraversal()
	{
		logger.info("testBinaryTreePreOrderTraversal: ");
		tree.preOrderTraversal();
	}

	@Test
	public void testBinaryTreeInOrderTraversal()
	{
		logger.info("testBinaryTreeInOrderTraversal: ");
		tree.inOrderTraversal();
	}

	@Test
	public void testBinaryTreePostOrderTraversal()
	{
		logger.info("testBinaryTreePostOrderTraversal: ");
		tree.postOrderTraversal();
	}

	@Test
	public void testBinaryTreeLevelOrderTraversal()
	{
		logger.info("testBinaryTreeLevelOrderTraversal: ");
		tree.levelOrderTraversal();
	}

	@Test
	public void testSearchNode()
	{
		assert tree.search(5).getData() == 5;
	}

	@Test
	public void testBinaryDeletion()
	{
		BinaryTree tree = new BinaryTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		logger.info("Binary Tree before deletion: {}", tree);
		tree.delete(4);
		System.out.println("");
		logger.info("Binary Tree after deletion: {}", tree);
		assert tree.search(4) == null;

	}
}
