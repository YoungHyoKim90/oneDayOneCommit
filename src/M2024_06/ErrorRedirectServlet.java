package M2024_06;
/*
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorRedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 예제에서는 URL 파라미터로 에러 코드를 전달받는다고 가정
        String errorCodeParam = request.getParameter("errorCode");

        // 에러 코드가 없거나 유효하지 않은 경우 기본 페이지로 이동
        if (errorCodeParam == null || !errorCodeParam.matches("\\d{3}")) {
            response.sendRedirect("defaultPage.html");
            return;
        }

        int errorCode = Integer.parseInt(errorCodeParam);

        // 에러 코드에 따라 리디렉션할 URL 설정
        String redirectUrl = getErrorPageUrl(errorCode);

        // 리디렉션 수행
        response.sendRedirect(redirectUrl);
    }

    private String getErrorPageUrl(int errorCode) {
        if (errorCode >= 100 && errorCode < 200) {
            return "errorPages/1xx.html";
        } else if (errorCode >= 200 && errorCode < 300) {
            return "errorPages/2xx.html";
        } else if (errorCode >= 300 && errorCode < 400) {
            return "errorPages/3xx.html";
        } else if (errorCode >= 400 && errorCode < 500) {
            return "errorPages/4xx.html";
        } else if (errorCode >= 500 && errorCode < 600) {
            return "errorPages/5xx.html";
        } else {
            return "errorPages/default.html";
        }
    }
}
*/

/*
 * <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
                             http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" 
         version="3.1">
    <servlet>
        <servlet-name>ErrorRedirectServlet</servlet-name>
        <servlet-class>ErrorRedirectServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>ErrorRedirectServlet</servlet-name>
        <url-pattern>/handleError</url-pattern>
    </servlet-mapping>
</web-app>
*/
