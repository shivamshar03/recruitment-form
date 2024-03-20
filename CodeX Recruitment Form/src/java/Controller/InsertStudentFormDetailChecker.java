package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DTO.UserDTO;
import Model.InsertStudentFormDetailAuth;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mayank_matkar
 */
public class InsertStudentFormDetailChecker extends HttpServlet 
{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      response.sendRedirect("CodeXForm.html");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      String enrollment = request.getParameter("enrollment");
      String name = request.getParameter("name");
      String email = request.getParameter("email");
      String contact = request.getParameter("contact");
      String branch = request.getParameter("branch");
      String program = request.getParameter("program");
      String dept = request.getParameter("dept");
      String year = request.getParameter("year");
      String sec = request.getParameter("sec");
      String linkedin = request.getParameter("linkedin");
      String github = request.getParameter("github");
      String brief = request.getParameter("brief");
      String driveb = request.getParameter("driveb");
      
      UserDTO user = new UserDTO();
      user.setEnrollment(enrollment);
      user.setName(name);
      user.setEmail(email);
      user.setContact(contact);
      user.setBranch(branch);
      user.setProgram(program);
      user.setDept(dept);
      user.setYear(year);
      user.setSec(sec);
      user.setLinkedin(linkedin);
      user.setGithub(github);
      user.setBrief(brief);
      user.setDriveb(driveb);
      
      InsertStudentFormDetailAuth i1 = new InsertStudentFormDetailAuth();
      boolean insert = i1.isInsert(user);
      
      if(insert)
      {
        HttpSession session = request.getSession(true);
        session.setAttribute("enrollment", enrollment);
        response.sendRedirect("Submitted Form.jsp");
      }   
      else
      {
        response.sendRedirect("CodeXForm.html");
      }    
    }
}
