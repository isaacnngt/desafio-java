<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sistema de Autorização de Procedimentos Médicos</title>
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
        nav ul {
            list-style-type: none;
            padding: 0;
            text-align: center;
        }
        nav ul li {
            display: inline-block;
            margin: 10px;
        }
        nav ul li a {
            text-decoration: none;
            color: #fff;
            background-color: #007bff;
            padding: 10px 15px;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        nav ul li a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Sistema de Autorização de Procedimentos Médicos</h1>
    <nav>
        <ul>
            <li><a href="autorizacao?acao=listarRegras">Listar Regras</a></li>
            <li><a href="cadastrarRegra.jsp">Cadastrar Regra</a></li>
            <li><a href="autorizacao?acao=listarSolicitacoes">Listar Solicitações</a></li>
            <li><a href="solicitarAutorizacao.jsp">Solicitar Autorização</a></li>
        </ul>
    </nav>

    <button id="testConnectionBtn">Test Database Connection</button>

    <script>
        document.getElementById('testConnectionBtn').addEventListener('click', function() {
            fetch('/test-connection')
                .then(response => response.text())
                .then(result => {
                    alert(result === 'true' ? 'Connection successful!' : 'Connection failed.');
                })
                .catch(error => {
                    alert('Error testing connection: ' + error);
                });
        });
    </script>
</div>
</body>
</html>