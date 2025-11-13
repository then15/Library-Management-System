package com.anudip.service;

import com.anudip.dao.MemberDAO;
import com.anudip.model.Member;
import java.sql.SQLException;
import java.util.List;

public class MemberService {
    private MemberDAO memberDAO = new MemberDAO();

    public void addMember(Member member) {
        try {
            memberDAO.addMember(member);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Member> getAllMembers() {
        try {
            return memberDAO.getAllMembers();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
