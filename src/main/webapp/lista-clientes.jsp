<%--
  Created by IntelliJ IDEA.
  User: gabrielacoelho
  Date: 23/07/2022
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Lista de Clientes</title>
    </head>
    <body>
        <h1>Lista de Clientes cadastrados</h1>
        <h3>Cliente  de id: ${ idClientSalvo } , cadastrado com sucesso!</h3>

        <table border="solid">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>Email</th>
                <th>Idade</th>
                <th>Maior de idade</th>
            </tr>
            <c:forEach items="${ clients }" var="cliente" varStatus="id">
                <tr>
                    <td>${id.count}</td>
                    <td>${cliente.nome}</td>
                    <td>${cliente.cpf}</td>
                    <td>${cliente.email}</td>
                    <td>${cliente.idade}</td>
                    <td>
                        <c:choose>
                            <c:when test = "${cliente.idade > 65}">
                                Melhor idade
                            </c:when>
                            <c:when test = "${cliente.idade >= 18}">
                                Sim
                            </c:when>
                            <c:when test = "${cliente.idade < 18}">
                                Não
                            </c:when>
                            <c:otherwise>
                                Não foi registrado no cartorio
                            </c:otherwise>
                        </c:choose>

                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="cadastro-cliente.jsp">Cadastre um novo Cliente</a>
    </body>
</html>
