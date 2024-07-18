# WorkIn

## Status do Projeto
**Em Desenvolvimento**

## Tecnologias Aplicadas
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- HTML
- CSS
- JavaScript (jQuery)
- Apache Maven

## Time de Desenvolvedores
- Nome do Desenvolvedor 1
- Nome do Desenvolvedor 2
- Nome do Desenvolvedor 3

## Objetivo do Software
O **WorkIn** é um sistema de gerenciamento de academia que tem como objetivo principal auxiliar os usuários a acompanhar e gerenciar seus treinos, metas e progressos. O sistema permite que os usuários cadastrem seus dados pessoais, criem metas de treino, registrem seus treinos e acompanhem o progresso ao longo do tempo.

## Funcionalidades do Sistema
### Requisitos Funcionais
1. **Cadastro de Usuário**
   - O usuário deve ser capaz de criar uma conta fornecendo nome, email, senha e data de nascimento.
   - O sistema deve permitir que o usuário atualize suas informações pessoais.

2. **Gerenciamento de Metas**
   - O usuário pode criar e gerenciar suas metas de treino.
   - O sistema deve permitir que o usuário visualize todas as suas metas.

3. **Registro de Treinos**
   - O usuário pode criar, visualizar, atualizar e deletar registros de treino.
   - O sistema deve associar cada treino a um usuário específico.

4. **Gerenciamento de Exercícios de Treino**
   - O usuário pode adicionar exercícios aos seus treinos.
   - O sistema deve permitir a visualização e gerenciamento dos exercícios associados a cada treino.

5. **Acompanhamento de Progresso**
   - O usuário pode registrar seu progresso ao longo do tempo, incluindo a frequência de treinos.
   - O sistema deve permitir a visualização do progresso acumulado.

6. **Alternância de Tema**
   - O sistema deve oferecer a opção de alternar entre temas claro e escuro.
   - A escolha do tema deve ser persistente, armazenada via cookies.

### Requisitos Não Funcionais
1. **Persistência de Dados**
   - Utilização do banco de dados MySQL para armazenar todas as informações dos usuários, metas, treinos e progresso.

2. **Interface de Usuário**
   - Desenvolvimento de uma interface amigável e responsiva para facilitar a interação do usuário com o sistema.

3. **Segurança**
   - Implementação de autenticação e autorização para garantir que apenas usuários autorizados possam acessar suas informações pessoais.

4. **Desempenho**
   - O sistema deve ser capaz de responder a solicitações do usuário de forma rápida e eficiente, garantindo uma experiência de uso fluida.

5. **Manutenibilidade**
   - O código deve ser bem estruturado e documentado para facilitar futuras manutenções e extensões do sistema.

## Estrutura do Projeto
A estrutura do projeto é organizada conforme as melhores práticas de desenvolvimento com Spring Boot, incluindo pacotes separados para modelos, repositórios, serviços e controladores.

**Modelo:** Contém as classes de entidades que representam a estrutura do banco de dados.
**Repositório:** Contém as interfaces que estendem `JpaRepository` para interação com o banco de dados.
**Serviço:** Contém as classes de serviço que encapsulam a lógica de negócio.
**Controlador:** Contém as classes de controlador que lidam com as requisições HTTP.

## Como Executar o Projeto
1. **Clone o repositório:**
   ```sh
   git clone https://github.com/usuario/workin.git
