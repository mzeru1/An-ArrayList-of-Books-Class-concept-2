package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<Book>();
        String answere = "y";



        System.out.println("Do you want to enter a book?");

        while (answere.equalsIgnoreCase("y")){
            answere = keyboard.nextLine();


            if(answere.equalsIgnoreCase("y")){
                Book book = new Book();
                System.out.println("Enter book title: ");
                book.setTitle(keyboard.nextLine());
                System.out.println("Eneter Book author: ");
                book.setAuthor(keyboard.nextLine());
                bookList.add(book);
                System.out.println("do you wnat to enter another book?");
            }
        }

        System.out.println("the books are : ");
        for (Book enhLoop:bookList) {
            System.out.println(enhLoop.getTitle());
            System.out.println(" ");
            System.out.println(enhLoop.getAuthor());
            System.out.println();
        }

    }
}
