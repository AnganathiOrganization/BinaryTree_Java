/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class NewMain {

    public static void main(String[] args) {
        Node root;
        Node n4 = new Node(4);
        Node n9 = new Node(9);
        Node n15 = new Node(15);
        Node n2 = new Node(2);
        Node n16 = new Node(16);
        Node n11 = new Node(11);
        Node n10 = new Node(10);
        Node n6 = new Node(6);
        Node n5 = new Node(5);
        Node n13 = new Node(13);
        Node n1 = new Node(1);
        Node n3 = new Node(3);
        
        root = n3;
        n3.left = n1;
        n3.right = n10;
        
        n1.left = n13;
        n1.right = n5;
        
        n10.left = n6;
        n10.right =n16;
        
        n5.left = n11;
        
        n16.left = n15;
        n16.right =n2;
        
        n15.left = n9;
        n15.right = n4;
        
        root.Disp();
        
        
    }
    
}
