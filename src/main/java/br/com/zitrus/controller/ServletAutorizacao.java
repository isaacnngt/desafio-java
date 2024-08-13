package br.com.zitrus.controller;

import br.com.zitrus.model.SolicitacaoAutorizacao;
import br.com.zitrus.model.RegraAutorizacao;
import br.com.zitrus.repository.ImplementacaoRepositorioSolicitacaoAutorizacao;
import br.com.zitrus.repository.ImplementacaoRepositorioRegraAutorizacao;
import br.com.zitrus.service.ServicoAutorizacao;
import br.com.zitrus.service.ImplementacaoServicoAutorizacao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/autorizacao")
public class ServletAutorizacao extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8483457101322058449L;
	private ServicoAutorizacao servicoAutorizacao;

    @Override
    public void init() throws ServletException {
        super.init();
        ImplementacaoRepositorioRegraAutorizacao repositorioRegra = new ImplementacaoRepositorioRegraAutorizacao();
        ImplementacaoRepositorioSolicitacaoAutorizacao repositorioSolicitacao = new ImplementacaoRepositorioSolicitacaoAutorizacao();
        this.servicoAutorizacao = new ImplementacaoServicoAutorizacao(repositorioRegra, repositorioSolicitacao);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");

        if ("listarRegras".equals(acao)) {
            listarRegras(request, response);
        } else if ("listarSolicitacoes".equals(acao)) {
            listarSolicitacoes(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");

        if ("salvarRegra".equals(acao)) {
            salvarRegra(request, response);
        } else if ("solicitarAutorizacao".equals(acao)) {
            solicitarAutorizacao(request, response);
        }
    }

    private void salvarRegra(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String codigoProcedimento = request.getParameter("codigoProcedimento");
        int idade = Integer.parseInt(request.getParameter("idade"));
        char sexo = request.getParameter("sexo").charAt(0);
        boolean permitido = Boolean.parseBoolean(request.getParameter("permitido"));

        RegraAutorizacao regra = new RegraAutorizacao();
        regra.setCodigoProcedimento(codigoProcedimento);
        regra.setIdade(idade);
        regra.setSexo(sexo);
        regra.setPermitido(permitido);

        servicoAutorizacao.salvarRegra(regra);

        response.sendRedirect("autorizacao?acao=listarRegras");
    }

    private void solicitarAutorizacao(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String codigoProcedimento = request.getParameter("codigoProcedimento");
        int idade = Integer.parseInt(request.getParameter("idade"));
        char sexo = request.getParameter("sexo").charAt(0);

        SolicitacaoAutorizacao solicitacao = new SolicitacaoAutorizacao();
        solicitacao.setCodigoProcedimento(codigoProcedimento);
        solicitacao.setIdade(idade);
        solicitacao.setSexo(sexo);

        servicoAutorizacao.salvarSolicitacao(solicitacao);

        response.sendRedirect("autorizacao?acao=listarSolicitacoes");
    }

    private void listarRegras(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<RegraAutorizacao> regras = servicoAutorizacao.buscarTodasRegras();
        request.setAttribute("regras", regras);
        request.getRequestDispatcher("/WEB-INF/views/listarRegras.jsp").forward(request, response);
    }

    private void listarSolicitacoes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SolicitacaoAutorizacao> solicitacoes = servicoAutorizacao.buscarTodasSolicitacoes();
        request.setAttribute("solicitacoes", solicitacoes);
        request.getRequestDispatcher("/WEB-INF/views/listarSolicitacoes.jsp").forward(request, response);
    }
}