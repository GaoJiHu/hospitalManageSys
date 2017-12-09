package com.rl.Servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServletDemo extends javax.servlet.http.HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println(config.getInitParameter("username"));

    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String cookie = req.getHeader("cookie");
        System.out.println(cookie);
        System.out.println(req.getParameter("name"));
//        System.out.println(req.getParameter());
    }

    /*  protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        ServletConfig sc = getServletConfig();
        ServletContext context = sc.getServletContext();
        String path = context.getRealPath("/WEB-INF/test.properties");
        InputStream inStream = context.getResourceAsStream("/WEB-INF/test.properties");
        if (inStream == null) {
            System.out.println("inStream is null");
        }
        Properties pro = new Properties();
        try {
            pro.load(inStream);
            System.out.println(pro.get("ortonwu"));
        } catch (Exception e) {
            System.out.println(e);
        }

        //获取src下的资源文件，src下的都是classpath
        InputStream In = this.getClass().getClassLoader().getResourceAsStream("test2.properties");
        Properties p = new Properties();
        p.load(In);
        System.out.println(p.get("key"));

        System.out.println(path);
    }*/
}
