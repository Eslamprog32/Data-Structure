/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ds;

import java.util.Scanner;

/**
 *
 * @author eslam
 */
public class ProjectDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("you want stack or queue? to stack press 1 to queue press 2");
            n = input.nextInt();
        } while (n > 2 || n < 1);
        if (n == 1) {
            Stack<Integer> s = new Stack<>();
            boolean ca = true;
            do {
                do {
                    System.out.println("To push element in stack press 1");
                    System.out.println("To peek element in stack press 2");
                    System.out.println("To pop element in stack press 3");
                    System.out.println("To display all elements in stack press 4");
                    System.out.println("To Exit program press 5");
                    n = input.nextInt();
                } while (n > 5 || n < 1);
                switch (n) {
                    case 1:
                        System.out.println("Enter The Value");
                        s.push(input.nextInt());
                        break;
                    case 2:
                        if (s.peek() == null) {
                            System.out.println("______The stack is empty______");
                        } else {
                            System.out.println("The Value of element = " + s.peek());
                        }
                        break;
                    case 3:
                        if (s.peek() == null) {
                            System.out.println("______The stack is empty______");
                        } else {
                            System.out.println("The Value of element = " + s.pop());
                        }
                        break;
                    case 4:
                        if (s.isEmpty()) {
                            System.out.println("______The stack is empty______");
                        } else {
                            System.out.println("All elements in stack : ");
                            s.diplayAll();
                            System.out.println("__________________________________________________");
                        }
                        break;
                    case 5:
                        System.out.println("Thank You");
                        ca = false;
                        break;
                }

            } while (ca);
        } else {
            Queue<Integer> s = new Queue<>();
            boolean ca = true;
            do {
                do {
                    System.out.println("To enqueue element in queue press 1");
                    System.out.println("To peek element in queue press 2");
                    System.out.println("To dequeue element in queue press 3");
                    System.out.println("To display all elements in queue press 4");
                    System.out.println("To Exit program press 5");
                    n = input.nextInt();
                } while (n > 5 || n < 1);
                switch (n) {
                    case 1:
                        System.out.println("Enter The Value");
                        s.enQueue(input.nextInt());
                        break;
                    case 2:
                        if (s.peek() == null) {
                            System.out.println("______The queue is empty_____");
                        } else {
                            System.out.println("The Value of element = " + s.peek());
                        }
                        break;
                    case 3:
                        if (s.peek() == null) {
                            System.out.println("______The queue is empty_____");
                        } else {
                            System.out.println("The Value of element = " + s.deQueue());
                        }
                        break;
                    case 4:
                        if (s.isEmpty()) {
                            System.out.println("______The queue is empty_____");
                        } else {
                            System.out.println("All elements in queue : ");
                            s.diplayAll();
                            System.out.println("__________________________________________________");
                        }
                        break;
                    case 5:
                        System.out.println("Thank You");
                        ca = false;
                        break;
                }

            } while (ca);
        }
    }
}
