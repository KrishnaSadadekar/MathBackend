package com.example.DataStructure.binaryModel;

import java.util.*;

public class BinaryTree {


    private Node root=new Node();

    public BinaryTree() {
        this.root = null;
    }


    public Node insertData(int nodes[]){

        Node rootNode=new Node(nodes[0]);
        for (int i = 1; i <nodes.length ; i++) {

            buildTree(nodes[i],rootNode);
        }

        return rootNode;
    }

    private void buildTree(int data, Node rootNode) {

        if (rootNode.data > data) {
            if (rootNode.left != null) {
                buildTree(data, rootNode.left);
            } else {
                System.out.println(data + " inserted to the left of " + rootNode.data);
                rootNode.left = new Node(data);
            }
        } else if (rootNode.data < data) {
            if (rootNode.right != null) {
                buildTree(data, rootNode.right);
            } else {
                System.out.println(data + " inserted to the right of " + rootNode.data);
                rootNode.right = new Node(data);
            }
        }

    }
}
