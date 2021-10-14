/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *@author SAKHUMZI.NONTLANGA
 */
public class Node {
    int value;
    Node left;
    Node right;
    public Node (int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public int getValue(){
        return value;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public void Disp(){
            System.out.println(value);
        if(right !=null){
            right.Disp();
        }
        else
            {System.out.println("*");}
        if(left != null){
            left.Disp();
        }
        else
            {System.out.println("*");}
    }
    
}
