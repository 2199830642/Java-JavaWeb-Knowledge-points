package chen.study.web.ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * 研究ServletContext域对象
 */
@WebServlet("/servletContextDemo05")
public class servletContextDemo05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        //获取文件的服务器路径
        String realPath1 = context.getRealPath("/WEB-INF/classes/a.txt");
        String realPath2 = context.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(realPath1);///Users/chen/Desktop/IdeaProjects/out/artifacts/day23_Response_war_exploded/a.txt
        System.out.println(realPath2);///Users/chen/Desktop/IdeaProjects/out/artifacts/day23_Response_war_exploded/WEB-INF/classes/a.txt
        File file = new File(realPath1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
