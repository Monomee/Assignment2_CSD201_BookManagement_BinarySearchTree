/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagement2;

/**
 *
 * @author PC
 */
public class BSTree {
     Node root;
   BSTree() {
     root=null;  
   }
   void clear() {
     root=null;  
   }
   boolean isEmpty() {
      return(root==null); 
   }
   Node search(Node p, int x) {
      if(p==null) return(null);
      if(p.info==x) return(p);
      if(x<p.info)
         return(search(p.left,x));
        else
         return(search(p.right,x));
   }
   void insert(int x) {

   }
   void insertMany(int [] a) {
      for(int i=0;i<a.length;i++) insert(a[i]); 
   }
   void visit(Node p) {
      if(p!=null) System.out.print(p.info + " ");
   }
   void breadth(Node p) {
      if(p==null) return;
      MyQueue q = new MyQueue();
      q.enqueue(p); Node r;
      while(!q.isEmpty()) {
         r=q.dequeue();
         visit(r);
         if(r.left!=null) q.enqueue(r.left);
         if(r.right!=null) q.enqueue(r.right);
      }
   }
   void preOrder(Node p) {
      if(p==null) return;
      visit(p);
      preOrder(p.left);
      preOrder(p.right);
   }
   void inOrder(Node p) {
      if(p==null) return;
      inOrder(p.left);
      visit(p);
      inOrder(p.right);
   }
   void postOrder(Node p) {
      if(p==null) return;
      postOrder(p.left);
      postOrder(p.right);
      visit(p);
   }


}
