package Model;

/**
 *
 * @author mayank_matkar
 */
import DB.DBconnector;
import DTO.UserDTO;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentFormDetailAuth 
{
  public boolean isInsert(UserDTO user)
  {
    String enrollment = user.getEnrollment();
    String name = user.getName();
    String contact = user.getContact();
    String email = user.getEmail();
    String branch = user.getBranch();
    String program = user.getProgram();
    String dept = user.getDept();
    String year = user.getYear();
    String sec = user.getSec();
    String linkedin = user.getLinkedin();
    String github = user.getGithub();
    String brief = user.getBrief();
    String driveb = user.getDriveb();

    try
    {
      Statement st = DBconnector.getStatement();
      String q = "INSERT INTO studentform VALUES('"+enrollment+"', '"+name+"', '"+contact+"', '"+email+"', '"+branch+"', '"+program+"', '"+dept+"', '"+year+"', '"+sec+"', '"+linkedin+"', '"+github+"', '"+brief+"', '"+driveb+"')";
      
      int i = st.executeUpdate(q);
      if(i>0)
      {
        return true;  
      }    
    }  
    catch(SQLException e)
    {
      System.out.println(e);   
    }    
    return false;  
  }        
}
