/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author halah1421
 */
public class SingleyLinkedList<E> {
    Node head;
    Node tail;
    String s="";
    String c;
  public void addLast(String e){
        Node newest = new Node();
        newest.data1=e;
        if(head==null) 
            head=newest;
        else {
        Node node = head;
        while(node.nextNode!=null) 
           { node = node.nextNode; }
        tail=node;
        node.nextNode=newest;
        tail.nextNode=newest;
        newest.nextNode=null;
        tail=newest;
        }

    }
   public void print(){
        if(head==null)
            System.out.println("The list is empty");
        else {
        Node node = head;
        while(node.nextNode!=null) {
            System.out.print(node.data1+" ");
            node = node.nextNode; 
        }
        System.out.println(node.data1);
    }
    }
    String reverse (Node<E> node) {
        if(node==null) 
           return " ";
        else {
            c="";
            for(int i = node.data1.length()-1;i>-1;i--) 
                c+=node.data1.charAt(i);
           node.data1=c;
           reverse(node.nextNode);
           s+=(node.data1+" ");
       return s;
        } 
    }
    
}
