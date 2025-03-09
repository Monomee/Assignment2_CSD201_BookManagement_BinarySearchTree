/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagement2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static HandleChoice c = new HandleChoice();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menuOfMain();
    }
    public static void menuOfMain(){
        MenuScene.menuMain();
        int choice = c.handleChoice(3);
        switch (choice) {
            case 1:
                MenuScene.menuBook();
                int bookChoice;
                do{
                    bookChoice = c.handleChoice(15);
                } while(c.userBookChoice(bookChoice));
                menuOfMain();
                break;
            case 2:
                MenuScene.menuReader();
                int readerChoice;
                do{
                    readerChoice = c.handleChoice(6);
                } while(c.userReaderChoice(readerChoice));
                menuOfMain();
                break;
            case 3:
                MenuScene.menuLending();
                int lendingChoice;
                do{
                    lendingChoice = c.handleChoice(10);
                } while(c.userLendingChoice(lendingChoice));
                menuOfMain();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Wrong more than 3 times!");
        }
    }
}
