package com.example.DataStructure.binaryModel;

import lombok.Data;

@Data
public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }


    public Node() {

    }
}
