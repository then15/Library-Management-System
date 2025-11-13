package com.anudip.dao;

import com.anudip.model.Issue;
import java.sql.*;
import java.util.*;

public class IssueDAO {

    public void issueBook(Issue issue) throws SQLException {
        String query = "INSERT INTO issues (bookId, memberId, issueDate, returnDate) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, issue.getBookId());
            ps.setInt(2, issue.getMemberId());
            ps.setDate(3, new java.sql.Date(issue.getIssueDate().getTime()));
            ps.setDate(4, issue.getReturnDate() != null ? new java.sql.Date(issue.getReturnDate().getTime()) : null);
            ps.executeUpdate();
        }
    }

    public List<Issue> getAllIssues() throws SQLException {
        List<Issue> list = new ArrayList<>();
        String query = "SELECT * FROM issues";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                list.add(new Issue(
                    rs.getInt("id"),
                    rs.getInt("bookId"),
                    rs.getInt("memberId"),
                    rs.getDate("issueDate"),
                    rs.getDate("returnDate")
                ));
            }
        }
        return list;
    }
}
