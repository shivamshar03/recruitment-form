<%-- 
    Document   : Submitted Form
    Created on : 27 Aug, 2023, 5:27:46 AM
    Author     : mayank_matkar
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>CodeX</title>
        <link href="formdesign.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
<%
   String enrollment = (String)session.getAttribute("enrollment");
   if(enrollment.equals("") || enrollment == null)
   {
     response.sendRedirect("CodeXForm.html");
   }
%>        
          <div class="form-style-10">
          <center><h1>CodeX<span>Recruitment form!</span></h1></center>
                  <form>
                  <div class="section"><b>Your details are submitted successfully.Thanks to fill this form we will contact you soon.</b></div>
    <div class="inner-wrap">
        <label>Enrollment no. <a href="">home</a></label>
    </div>
    </form>
    </body>
</html>
