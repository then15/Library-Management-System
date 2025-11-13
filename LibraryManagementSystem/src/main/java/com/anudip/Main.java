package com.anudip;

import com.anudip.model.*;
import com.anudip.service.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        IssueService issueService = new IssueService();

        // Add book
        bookService.addBook(new Book(0, "Java Programming", "James Gosling", "Sun Press", true));

        // Add member
        memberService.addMember(new Member(0, "Ravi", "ravi@gmail.com", "9876543210"));

        // Issue book
        issueService.issueBook(new Issue(0, 1, 1, new Date(), null));

        // Display all books
        System.out.println("Books:");
        bookService.getAllBooks().forEach(System.out::println);

        // Display all members
        System.out.println("\nMembers:");
        memberService.getAllMembers().forEach(System.out::println);

        // Display issued books
        System.out.println("\nIssued Books:");
        issueService.getAllIssues().forEach(System.out::println);
    }
}
