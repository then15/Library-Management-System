package com.anudip.service;

import com.anudip.dao.BookDAO;
import com.anudip.model.Book;
import java.sql.SQLException;
import java.util.List;

public class BookService {
    private BookDAO bookDAO = new BookDAO();

    public void addBook(Book book) {
        try {
            bookDAO.addBook(book);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getAllBooks() {
        try {
            return bookDAO.getAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
