package dev.jaib.practice.ds.test.binarysearchtree;

import dev.jaib.practice.ds.binarysearchtree.BinarySearchTree;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearchTreeTest
{
	private static final Logger logger = LoggerFactory.getLogger(BinarySearchTreeTest.class);

	private static BinarySearchTree tree;

	@BeforeClass
	public static void initializeBinarySearchTree()
	{
		tree = new BinarySearchTree();
		tree.insert(20);
		tree.insert(10);
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
	}

	@Test
	public void testBinarySearchInsertionTreeTest()
	{
		logger.info("testBinarySearchInsertionTreeTest: {}", tree);
	}

	@Test
	public void testBinarySearchPreOrderTraversal()
	{
		logger.info("testBinarySearchPreOrderTraversal: ");
		tree.preOrderTraversal();
	}

	@Test
	public void testBinarySearchInOrderTraversal()
	{
		logger.info("testBinarySearchInOrderTraversal: ");
		tree.inOrderTraversal();
	}

	@Test
	public void testBinarySearchPostOrderTraversal()
	{
		logger.info("testBinarySearchPostOrderTraversal: ");
		tree.postOrderTraversal();
	}

	@Test
	public void testBinarySearchTreeSearchWhenValueIsPresent()
	{
		Assert.assertNull(tree.search(70));
	}

	@Test
	public void testBinarySearchTreeSearchWhenValueIsNotPresent()
	{
		Assert.assertEquals(50, tree.search(50).getData());
	}

	@Test
	public void testBinarySearchTreeMinValue()
	{
		Assert.assertEquals(10, tree.min());
	}

	@Test
	public void testBinarySearchTreeMaxValue()
	{
		Assert.assertEquals(60, tree.max());
	}

	@Test
	public void testBinarySearchTreeDelete()
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(20);
		tree.insert(10);
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		logger.info("Tree before deletion: {}", tree);
		System.out.println("");
		tree.delete(20);
		logger.info("Tree after deletion: {}", tree);
		Assert.assertNull(tree.search(20));
	}
}
