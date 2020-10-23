package Controller;

import Dao.Impl.TodoDaoImpl;
import Dao.TodoDao;
import Model.Todo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/main")
public class TodoController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private TodoDao todoDao;

    public void init() {
        todoDao = new TodoDaoImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertTodo(request, response);
                    break;
                case "/delete":
                    deleteTodo(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateTodo(request, response);
                    break;
                case "/list":
                    listTodo(request, response);
                    break;
                default:
                    RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                    dispatcher.forward(request, response);
                    break;
            }
        } catch (SQLException exception) {
            throw new ServletException(exception);
        }
    }

    private void listTodo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Todo> listTodo = todoDao.selectAllTodos();
        request.setAttribute("listTodo", listTodo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("todo-list.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("todo-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Todo existingTodo = todoDao.SelectTodo(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("todo-form.jsp");
        request.setAttribute("todo", existingTodo);
        dispatcher.forward(request, response);
    }

    private void insertTodo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        String title = request.getParameter("title");
        String username = request.getParameter("username");
        String description = request.getParameter("description");

         /*DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate targetDate = LocalDate.parse(request.getParameter("targetDate"),df);*/

        boolean isDone = Boolean.valueOf(request.getParameter("isDone"));
        Todo newTodo = new Todo(title, username, description, LocalDate.now(), isDone);
        todoDao.insertTodo(newTodo);
        response.sendRedirect("list");
    }

    private void updateTodo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));

        String title = request.getParameter("title");
        String username = request.getParameter("username");
        String description = request.getParameter("description");
        //DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate targetDate = LocalDate.parse(request.getParameter("targetDate"));

        boolean isDone = Boolean.valueOf(request.getParameter("isDone"));
        Todo updateTodo = new Todo(id, title, username, description, targetDate, isDone);

        todoDao.updateTodo(updateTodo);

        response.sendRedirect("list");
    }

    private void deleteTodo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        todoDao.deleteTodo(id);
        response.sendRedirect("list");
    }

}
