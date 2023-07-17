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
public class Cipher {
        
    String encoder(String s,int n) {
        char [] a = s.toCharArray();
            char c=' ';
        for(int i=0;i<a.length;i++) {
            c=a[i];
            if(c!=' ')
              c+=n;
            if(c>'z')
                c='a';
        a[i]=c;
            
        }
         s=String.valueOf(a);
                 return  s;
    }
    
    String decoder(String s,int n){
        char [] a = s.toCharArray();
        char c = ' ';
        for(int i = 0 ;i<a.length;i++) {
            c=a[i];
        if(c!=' ') {
              c-=n;
        if(c>'z') {
            c='a';
        c-=n;
        }
        if(c<'a') {
            c='z';
        c-=(n-1); 
        }
        }
             a[i]=c;
        }
        s=String.valueOf(a);
        return s;
    }
    
}
