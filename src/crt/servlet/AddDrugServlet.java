package crt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crt.bean.Patient;
import crt.dao.PatientDAO;

public class AddDrugServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String pno = req.getParameter("pno");
		PatientDAO pd = new PatientDAO();
		Patient patient = pd.selectByPno(Integer.parseInt(pno));
		req.getSession().setAttribute("patient", patient);
		req.getRequestDispatcher("frame/addDrug.jsp").forward(req, resp);
		
		
	}

}
