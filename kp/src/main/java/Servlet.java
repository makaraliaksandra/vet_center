import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "ShowServlet",urlPatterns = { "/ShowServlet" })
public class Servlet extends HttpServlet {
    private String login;
    private String password;

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String command = request.getParameter("command");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        if (command.equals("Show")){
            showDocs(request,response);}else {
            if(command.equals("Add")) {
                try {
                    addDocs(request, response);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().print("<h2>This is " + this.getClass().getName()
                + ", using the GET method</h2>");
    }

    public void destroy(){
        super.destroy();
    }

    public void showDocs(HttpServletRequest request, HttpServletResponse response){
        try {
            request.setAttribute("log", login);
            request.setAttribute("pass", password);

            request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void addDocs(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException {
        login = request.getParameter("login");
        password = request.getParameter("password");

        try {
            DB db= new DB();
            con = DriverManager.getConnection(db.url, db.login, db.password);
            stmt = con.createStatement();
            String query = "INSERT INTO user (login, password) \n" +
                            " VALUES ('"+login+"','"+password+"');";

            stmt.executeUpdate(query);
            request.setAttribute("login", login);
            request.setAttribute("password", password);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
        try { con.close(); } catch(SQLException se) { /*can't do anything */ }
        try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
        try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
         }


    }
}
