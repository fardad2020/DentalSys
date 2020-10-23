package Controller;

import Dao.PersonDao;
import Model.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class PersonController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegisterPerson(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    private void RegisterPerson(HttpServletRequest request, HttpServletResponse response) {
        String FirstName = request.getParameter("firstname");
        String LastName = request.getParameter("lastname");
        String NationalCode = request.getParameter("nationalcode");
        String Phone = request.getParameter("phone");
        String Address = request.getParameter("address");

        Person person = new Person();
        person.setFirstName(FirstName);
        person.setLastName(LastName);
        person.setNationalCode(NationalCode);
        person.setPhone(Phone);
        person.setAddress(Address);

        HttpSession session = request.getSession(true);
        try {
            PersonDao personDao = new PersonDao();
            personDao.addPersonDetails(person);
            response.sendRedirect("Success");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
