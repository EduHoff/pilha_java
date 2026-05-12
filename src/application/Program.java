package application;

import entities.Stack;
import utils.ConsoleUtils;

public class Program {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        ConsoleUtils.clear();

        System.out.println("Pilha vazia (" + pilha.length() + "):");
        pilha.printList();
        System.out.println();


        pilha.push(10);
        System.out.println("Push 10 (" + pilha.length() + "):");
        pilha.printList();
        System.out.println();


        pilha.push(20);
        System.out.println("Push 20 (" + pilha.length() + "):");
        pilha.printList();
        System.out.println();


        pilha.push(50);
        System.out.println("Push 50 (" + pilha.length() + "):");
        pilha.printList();
        System.out.println();


        System.out.println("Peek top (" + pilha.peek() + "):");
        pilha.printList();
        System.out.println();


        pilha.pop();
        System.out.println("Pop (" + pilha.length() + "):");
        pilha.printList();
        System.out.println();

        
        for(int i=0; i<= 25; i++){
            pilha.pop();
        }
        System.out.println("Pop (" + pilha.length() + "):");
        pilha.printList();
        System.out.println();
    }
}