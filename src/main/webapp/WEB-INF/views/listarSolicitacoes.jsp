<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Listar Solicitações de Autorização</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      line-height: 1.6;
      margin: 0;
      padding: 0;
      background-color: #f0f0f0;
    }
    .container {
      width: 80%;
      margin: 20px auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    h1 {
      color: #333;
      text-align: center;
    }
    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
    }
    th, td {
      padding: 12px;
      text-align: left;
      border-bottom: 1px solid #ddd;
    }
    th {
      background-color: #007bff;
      color: white;
    }
    tr:hover {
      background-color: #f5f5f5;
    }
    .voltar {
      display: block;
      text-align: center;
      margin-top: 20px;
      color: #007bff;
      text-decoration: none;
    }
  </style>
</head>
<body>
<div class="container">
  <h1>Solicitações de Autorização</h1>
  <table>
    <thead>
    <tr>
      <th>Código do Procedimento</th>
      <th>Idade</th>
      <th>Sexo</th>
      <th>Autorizado</th>
      <th>Data da Solicitação</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="solicitacao" items="${solicitacoes}">
      <tr>
        <td>${solicitacao.codigoProcedimento}</td>
        <td>${solicitacao.idade}</td>
        <td>${solicitacao.sexo}</td>
        <td>${solicitacao.autorizado ? 'Sim' : 'Não'}</td>
        <td>${solicitacao.dataSolicitacao}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <a href="${pageContext.request.contextPath}/index.jsp" class="voltar">Voltar</a>
</div>
</body>
</html>