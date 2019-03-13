package ormedia.src.main.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class Servlet extends HttpServlet  {
    private Service service = new Service();
    private static final String ERROR_HTML = "error.html";
    private static final String CONTENT_DISPOSITION = "Content-disposition";
    private static final String S_1 = "attachment; filename=result.";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        try {
            String typeContent = request.getParameter("typeContent");
            OutputStream outputStream = response.getOutputStream();
            response.setContentType(typeContent);
            response.setHeader(CONTENT_DISPOSITION, S_1.concat(typeContent.split("/")[1]));

            service.download(outputStream, typeContent);
            throw new Exception();
        }
        catch (Exception e) {
            response.sendRedirect(ERROR_HTML);
            e.printStackTrace();
            throw new ServletException();
        }

    }
}
