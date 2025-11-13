package com.anudip.service;

import com.anudip.dao.BookDAO;
import com.anudip.dao.IssueDAO;
import com.anudip.model.Issue;
import java.sql.SQLException;
import java.util.List;

public class IssueService {
    private IssueDAO issueDAO = new IssueDAO();
    private BookDAO bookDAO = new BookDAO();

    public void issueBook(Issue issue) {
        try {
            issueDAO.issueBook(issue);
            bookDAO.updateBookAvailability(issue.getBookId(), false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Issue> getAllIssues() {
        try {
            return issueDAO.getAllIssues();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
