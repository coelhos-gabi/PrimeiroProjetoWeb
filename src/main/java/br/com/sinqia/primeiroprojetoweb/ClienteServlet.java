package br.com.sinqia.primeiroprojetoweb;

import br.com.sinqia.primeiroprojetoweb.bo.ClienteBusinessObjectI;
import br.com.sinqia.primeiroprojetoweb.injecao.email.EmailService;
import br.com.sinqia.primeiroprojetoweb.injecao.email.ServicoGmailQualifier;
import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/cliente-servlet")
public class ClienteServlet extends HttpServlet {
    @Inject
    @ServicoGmailQualifier
    private EmailService emailService;
    private final ClienteBusinessObjectI businessObject;
    @Inject
    public ClienteServlet(ClienteBusinessObjectI businessObjectI) {
        this.businessObject = businessObjectI;
    }

    @Override
    public void init() {
        System.out.println("Inciando Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Chamando Metodo");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {


        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String email = request.getParameter("email");
        String idade = request.getParameter("idade");

        // injeção de dependência com o new clienteDAO
        //ClienteBusinessObject businessObject = new ClienteBusinessObject();

        Integer idadeCliente = null;
        if(!idade.isEmpty()){
            idadeCliente = Integer.parseInt(idade);
        }
        Cliente cliente = new Cliente(nome, cpf, email, idadeCliente);
        Cliente clienteSalvo = businessObject.save(cliente);

        emailService.enviaEmailBoasVindas(cliente);

        var clientes = businessObject.findAll();

        request.setAttribute("idClientSalvo", clienteSalvo.getId());
        request.setAttribute("clients", clientes);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/lista-clientes.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("Destruindo Servlet");
    }
}
