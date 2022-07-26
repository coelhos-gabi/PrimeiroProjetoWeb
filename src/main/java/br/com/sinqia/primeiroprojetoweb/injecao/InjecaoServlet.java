package br.com.sinqia.primeiroprojetoweb.injecao;

import jdk.jfr.Name;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (value = "/teste-injecao")
public class InjecaoServlet extends HttpServlet {
    @Inject
    //@Name("amarela")
    @VermelhaQualifier
    private Cor cor;

//    @Inject
//    public InjecaoServlet(Cor cor) {
//        this.cor = cor;
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Cor cor = new Amarela();
        //new InjecaoServlet(this.cor);
        //setCor(this.cor);
        System.out.println(cor.definirCor());

    }
//    @Inject
//    public void setCor(Cor cor) {
//        this.cor = cor;
//    }
}
