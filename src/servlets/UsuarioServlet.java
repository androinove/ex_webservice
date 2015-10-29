package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import app.EntityGenerator;
import entity.Usuario;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet({ "/UsuarioServlet", "/usuarios", "/usuario/list" })
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsuarioServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Requisição recebida.");
		System.out.println("Processando requisição...");

		Usuario[] usuarios = EntityGenerator.arrayUsuario();

		String jsonUsuarios = new Gson().toJson(usuarios, Usuario[].class);

		response.getWriter().append(jsonUsuarios);

		System.out.println("Requisição processada.");
		System.out.println("Retornando response");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jsonUsuario = request.getParameter("Usuario");
		System.out.println("Request do aplicativo: " + jsonUsuario);
		Usuario usuario = new Gson().fromJson(jsonUsuario, Usuario.class);
		usuario.setId(1234);
		System.out.println(usuario.toString());
		response.getWriter().append("OK");
	}

}
