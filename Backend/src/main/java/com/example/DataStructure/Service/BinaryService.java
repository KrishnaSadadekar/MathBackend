package com.example.DataStructure.Service;

import com.example.DataStructure.binaryModel.BinaryTraversal;
import com.example.DataStructure.binaryModel.BinaryTree;
import com.example.DataStructure.binaryModel.Node;
import com.example.DataStructure.binaryModel.Traversal;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BinaryService {

    Traversal b=new Traversal();



    public Traversal createBinary(int [] myArray)
    {
        BinaryTree binary = new BinaryTree();
        Node r = binary.insertData(myArray);
        b.setPreOrder(preOrder(r));
        b.setInOrder(inOrder(r));
        b.setPostOrder(postOrder(r));
        return b;
    }

    public List<Integer> preOrder(Node r) {
        BinaryTraversal bs = new BinaryTraversal();
        return bs.PreOder(r);
    }

    public List<Integer> inOrder(Node r) {
        BinaryTraversal bs = new BinaryTraversal();
        return bs.InOrder(r);
    }

    public List<Integer> postOrder(Node r) {
        BinaryTraversal bs = new BinaryTraversal();

        return bs.PostOrder(r);
    }

}
