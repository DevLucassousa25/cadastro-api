<h1>Cadastro API</h1>

<p>API REST para cadastro de pessoas, desenvolvida com Spring Boot, Lombok e PostgreSQL.</p>

<h2>Tecnologias Utilizadas</h2>
<ul>
  <li>Java + Spring Boot</li>
  <li>Lombok</li>
  <li>PostgreSQL</li>
  <li>Maven</li>
</ul>

<h2>Configuração do Banco (application.properties)</h2>
<pre>
spring.datasource.url=jdbc:postgresql://localhost:9999/cadastrodb
spring.datasource.username=postgres
spring.datasource.password=123
spring.jpa.hibernate.ddl-auto=update
</pre>

<h2>Endpoints da API</h2>
<table>
  <tr>
    <th>Rota</th>
    <th>Método</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>/pessoa/cadastro</td>
    <td>POST</td>
    <td>Cadastrar pessoa</td>
  </tr>
  <tr>
    <td>/pessoa/listar</td>
    <td>GET</td>
    <td>Listar pessoas</td>
  </tr>
  <tr>
    <td>/pessoa/listar/{id}</td>
    <td>GET</td>
    <td>Buscar pessoa por ID</td>
  </tr>
  <tr>
    <td>/pessoa/delete/{id}</td>
    <td>DELETE</td>
    <td>Deletar pessoa</td>
  </tr>
  <tr>
    <td>/pessoa/update/{id}</td>
    <td>PUT</td>
    <td>Atualizar pessoa</td>
  </tr>
</table>

<h3>Exemplo de JSON (cadastro)</h3>
<pre>
{
  "nome": "João",
  "sobrenome": "Silva",
  "cpf": "12345678900",
  "rg": "112233445",
  "genero": "Masculino",
  "email": "joao@gmail.com",
  "telefone": "11999999999"
}
</pre>

<h2>Como Rodar o Projeto</h2>
<ol>
  <li>Clone o repositório: <code>git clone https://github.com/seu-usuario/cadastro-api.git</code></li>
  <li>Acesse a pasta: <code>cd cadastro-api</code></li>
  <li>Crie o banco PostgreSQL: <code>CREATE DATABASE cadastrodb;</code></li>
  <li>Configure o <code>application.properties</code></li>
  <li>Execute: <code>mvn spring-boot:run</code></li>
</ol>

<h2>Estrutura do Projeto</h2>
<pre>
src/main/java/dev/java10x/CadastroAPI
├── controller
├── model
├── repository
├── service
└── CadastroApiApplication.java
</pre>

