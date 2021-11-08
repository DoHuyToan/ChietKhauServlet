import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator", value = "/DiscountCalculator")
public class DiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        double discountAmount = price * percent * 0.01;
//        do percent tính theo %

        double discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        if(price>0 && percent>0){
            writer.println("<h1>Description: " + description + "</h1>");
            writer.println("<h1>Price: " + price + "</h1>");
            writer.println("<h1>Percent: " + percent + "</h1>");
            writer.println("<h1>DiscountAmount: " + discountAmount + "</h1>");
            writer.println("<h1>DiscountPrice: " + discountPrice + "</h1>");
        } else {
            writer.println("So phai lon hon 0");
        }
        writer.println("</html>");
    }
}
