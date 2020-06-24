package imprimir;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class imprimir
 */
@WebServlet("/imprimir")
public class imprimir extends HttpServlet {
	public static final long serialVersionUID = 1L;
       
    private String Mensaje1;
    private String Mensaje2;
    private String Mensaje3;
    private Date Fecha;
    private int Contador;
    
    public imprimir(String mensaje1, String mensaje2, String mensaje3, int contador) {
        super();
        this.Mensaje1 = mensaje1;
        this.Mensaje2 = mensaje2;
        this.Mensaje3 = mensaje3;
        this.Fecha = new Date();
        this.Contador = contador;
    }
    
    public imprimir() {}

	public String getMensaje1() {
		return Mensaje1;
	}

	public void setMensaje1(String mensaje1) {
		Mensaje1 = mensaje1;
	}

	public String getMensaje2() {
		return Mensaje2;
	}

	public void setMensaje2(String mensaje2) {
		Mensaje2 = mensaje2;
	}

	public String getMensaje3() {
		return Mensaje3;
	}

	public void setMensaje3(String mensaje3) {
		Mensaje3 = mensaje3;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public int getContador() {
		return Contador;
	}

	public void setContador(int contador) {
		Contador = contador;
	}
    

}