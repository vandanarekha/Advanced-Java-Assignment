import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class st extends httpservlet
{
 public void doGet(Http ServletRequest req,Http Servlet Response res)throws IO exception, Servlet Exception
{
 res.setContentType("text/html");
 PrintWriter pw=res.getWriter();
 HttpSession  hs=req.getSession(true);
 Date d=(Date)hs.getAttribute("date");
 if(d=null)
{
 hs.setAttribute("Previous_user"," ");
 hs.setAttribute("Current_user"," ");
}
String old=(String)hs.getAttribute("Previous_user");
String old=(String)hs.getAttribute("Current_user");
if(d!=null && old!=" ");
{
 pw.println("Previous login:<br>");
 pw.println("Username:"+old+"<br>");
 pw.println("login time and date:"+d+"<br>");
}
 d=new Date();
 hs.getAttribute("date",d);
 cur=req.getParameter("t1);
 hs.setAttribute("Current_user",cur);
 old=cur;
 pw.println("Current login:<br>");
 pw.println("Username:"+cur+"<br>");
 pw.println("login time and date:"+d+"<br>");
 hs.setAttribute("Previous_user",old);
 }
}





 