package dev.sanket;

import static dev.sanket.BinaryTree.Node.create;

import org.junit.Assert;
import org.junit.Test;

import dev.sanket.BinaryTree.Node;

public class BinaryTreeTest {

    @Test
    public void shouldReturnTrueForSimpleMirroredTree() {

        Node root = create(0, create(1, null, null), create(1, null, null));
        Assert.assertTrue(BinaryTree.isMirrored(root));
    }

    @Test
    public void shouldReturnFalseForNonMirroredTree() {

        Node root = create(0, create(1, null, null), create(2, null, null));
        Assert.assertFalse(BinaryTree.isMirrored(root));
    }

    @Test
    public void shouldReturnTrueForComplexMirroredTree() {

        Node root = create(0, create(1, create(2, null, null), create(3, null, null)),
                create(1, create(3, null, null), create(2, null, null)));
        Assert.assertTrue(BinaryTree.isMirrored(root));
    }
}
