package com.example.DataStructure.binaryModel;


import java.util.*;

public class BinaryTraversal {

     List<Integer> ls=new ArrayList<>();

    public List<Integer> PreOder( Node root)
    {

        if(root==null)
        {
            return ls;
        }
        ls.add(root.data);
        System.out.print(root.data+" ");
        PreOder(root.left);
        PreOder(root.right);


        return ls;
    }
    public  List<Integer> PostOrder(Node root)
    {
        if (root==null)
        {
            return ls;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        ls.add(root.data);
        System.out.print(root.data+" ");
        return ls;
    }

    public List<Integer> InOrder(Node root)
    {
        if (root==null)
        {
            return ls;
        }
        InOrder(root.left);
        ls.add(root.data);
        System.out.print(root.data+" ");
        InOrder(root.right);
        return ls;
    }




}
