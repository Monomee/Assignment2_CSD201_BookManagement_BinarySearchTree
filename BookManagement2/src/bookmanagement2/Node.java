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
public class Node {
    int info;
   Node left,right;
   Node() {
       
   }
   Node(int x) {
     info=x;left=right=null;  
   }
}
