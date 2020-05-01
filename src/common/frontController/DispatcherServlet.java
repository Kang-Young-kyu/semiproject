package common.frontController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HandlerMapping hm = new HandlerMapping();
	private HandlerAdapter ha = new HandlerAdapter();

	public DispatcherServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String[] uriArr = request.getRequestURI().split("/");
		System.out.println(Arrays.toString(uriArr));
		


		Controller ctr = hm.getController(uriArr);
		String methodName = hm.getMethod(uriArr);
		ModelAndView mav = ha.excute(ctr, methodName, request);
		// view로 전송
		if (mav.getView().equals("ajax")) {
			
<<<<<<< HEAD
=======
			PrintWriter pw = response.getWriter();
			String res = (String) mav.getData().get("userId");
			pw.write(res);
			
>>>>>>> c75afb6cb98c3905af409b3783a9bd7246c988a7
		} else if (mav.getView().equals("file")) {
			
		} else {
			request.setAttribute("data", mav.getData());
			ViewResolver vr = new ViewResolver(mav.getView());
			RequestDispatcher rd = request.getRequestDispatcher(vr.getView());
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
