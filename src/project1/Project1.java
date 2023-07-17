/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
 

public class Project1 {

    
    public static void main(String[] args) {
       Duplicate<String> cv = new Duplicate<String>();
               Cipher c = new Cipher();
        Duplicate d = new Duplicate();
        SingleyLinkedList l = new SingleyLinkedList();
       String p = "hi welcome back";
       String ci = "lm aipgsqi fego";
       System.out.println("plain text: "+p);
       System.out.println("cipher Text: "+c.encoder(p, 4));
       System.out.println("cipher Text: "+ci);
       System.out.println("plain text: "+c.decoder(ci, 4));
       
        cv.addNode("hala");
       cv.addNode("anoud");
       cv.addNode("sara");
       cv.addNode("afnan");
       cv.addNode("lana");
       cv.addNode("sara");
       cv.display();
       if(cv.checkDuplicate(cv.head))
           System.out.println("Have word duplicate");
       else
           System.out.println("no have word duplicate");   
       
       l.addLast("The");
       l.addLast("grade");
       l.addLast("is");
       l.addLast("A");
       System.out.println("The String: ");
       l.print();
       System.out.println("The string after reverse:\n"+l.reverse(l.head));

    }
    
}
