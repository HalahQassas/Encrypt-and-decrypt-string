/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author alanoudAli
 */
public class Duplicate<E> {
    public Node head = null;
    public Node tail=null;
    
    
   public void addNode(E data)
{  
    
    Node b = new Node(data);  
    if(head == null)
    {  
        head = b;  
        tail = b;  
        b.nextNode = head;  
    }  
    else 
    {  
        tail.nextNode= b;  
        tail = b;  
       
        tail.nextNode = head;  
    }  
}  
    public boolean  checkDuplicate (Node<E> head) {  
        boolean dd= false;
        
        Node current = head, 
        index = null,
        t = null;  
        if(head == null)   
            System.out.println("SOORY THE LIST IS EMBTY");  
        else {  
              do{    
                    t= current;  
                     
                    index = current.nextNode;  
                    while(index != head) 
                        {  
                        if(current.data.equals( index.data))
                        return true;                    
                        index= index.nextNode;  
                        }  
                    current =current.nextNode;  
                }while(current.nextNode != head);  
             } 
        return dd;
} 
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("SOORY THE LIST IS EMPTY  \n");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list:    \n");  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print("    "+ current.data +"  \n");  
                current = current.nextNode;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    
}
