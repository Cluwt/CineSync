# Projeto Sistema CineSync 🎬

## Descrição
O Projeto Sistema CineSync é um software desenvolvido para gerenciar as operações de um cinema. Ele oferece uma variedade de funcionalidades para facilitar a gestão de usuários, funcionários, bilheteria, programação de filmes, bomboniere e muito mais.

## Funcionalidades Principais 🛠️
- **Cadastro de Usuários e Funcionários:** Registro de informações básicas de usuários e funcionários.
- **Gestão de Horários de Trabalho:** Controle dos horários de trabalho dos funcionários.
- **Registro de Atividades:** Registro das atividades realizadas pelos usuários no sistema.
- **Controle de Bilheteria:** Registro de vendas de ingressos e informações sobre clientes, formas de pagamento, etc.
- **Gestão de Salas VIP:** Cadastro e gestão das salas VIP do cinema.
- **Programação de Sessões:** Programação de sessões de filmes, incluindo tipos de ingressos disponíveis.
- **Cadastro de Combos Promocionais:** Cadastro de combos promocionais de ingressos.
- **Gestão da Bomboniere:** Cadastro e gestão dos produtos da bomboniere.
- **Controle de Vendas e Fidelidade:** Registro de vendas e pontuação de fidelidade dos clientes.
- **Controle de Totens de Autoatendimento:** Registro da localização e status operacional dos totens de autoatendimento.
- **Controle de Fluxo de Entrada:** Registro do fluxo de entrada dos clientes nas sessões.
- **Controle Fiscal:** Registro dos documentos fiscais emitidos.
- **Programação Centralizada:** Cadastro de informações sobre os filmes em cartaz.
- **Envio de Dados Automatizado:** Registro do envio automatizado de dados para destinatários específicos.
- **Controle de TV de Publicidade:** Manutenção de informações sobre os canais de TV de publicidade.
- **Programa de Fidelidade:** Cadastro de programas de fidelidade para clientes.
- **Controle Financeiro:** Registro de movimentações financeiras associadas às vendas.
- **Controle de Estoque e Inventário:** Manutenção de informações sobre o estoque e inventário dos produtos da bomboniere.
- **Gestão de Compras:** Registro de compras de produtos da bomboniere.
- **Análises e Relatórios:** Geração de análises e relatórios sobre métricas do cinema.

## Estrutura do Projeto 📁
O projeto segue uma estrutura MVC (Model-View-Controller), onde cada parte desempenha um papel específico na arquitetura do software:

### Pacotes (Packages)
- **modelo:** Classes relacionadas aos dados e lógica de negócios.
- **visao:** Classes responsáveis pela interface gráfica do usuário.
- **controle:** Classes controladoras intermediárias entre modelo e visão.
- **dao:** Classes responsáveis pelo acesso ao banco de dados.
- **Utils:** Classes utilitárias, incluindo a conexão com o banco de dados.

### Arquivos Java
#### Modelo
- FilmeModel.java
- HorarioExibicaoModel.java
- IngressoModel.java
- ComboModel.java
- PromocaoModel.java
- UsuarioModel.java
- TerminalModel.java
- PedidoModel.java
- ProdutoModel.java
- SalaModel.java
- FidelidadeModel.java
- ProgramacaoModel.java
- ComunicacaoExternaModel.java
- Outras classes de modelo conforme necessário.

#### Visão
- TelaPrincipalView.java
- PainelFilmeView.java
- PainelHorarioExibicaoView.java
- PainelVendaView.java
- PainelPromocaoView.java
- PainelFidelidadeView.java
- PainelTotemView.java
- PainelRestauranteView.java
- PainelSalaVIPView.java
- PainelControleAcessoView.java
- Outras classes de visão conforme necessário.

#### Controle
- ControladorPrincipalController.java
- ControladorFilmeController.java
- ControladorHorarioExibicaoController.java
- ControladorVendaController.java
- ControladorPromocaoController.java
- ControladorFidelidadeController.java
- ControladorTotemController.java
- ControladorRestauranteController.java
- ControladorSalaVIPController.java
- ControladorControleAcessoController.java
- Outras classes controladoras conforme necessário.

#### DAO
- FilmeDAO.java
- HorarioExibicaoDAO.java
- IngressoDAO.java
- ComboDAO.java
- PromocaoDAO.java
- UsuarioDAO.java
- TerminalDAO.java
- PedidoDAO.java
- ProdutoDAO.java
- SalaDAO.java
- FidelidadeDAO.java
- ProgramacaoDAO.java
- ComunicacaoExternaDAO.java
- Outras classes DAO conforme necessário.

#### Utils
- ConexaoBanco.java (ou qualquer outro nome que você preferir)

### Banco de Dados
O projeto utiliza um banco de dados MySQL para armazenar as informações. Abaixo está o script SQL para criar as tabelas necessárias no banco de dados.

*[Script SQL omitido por razões de brevidade]*

## Conexão com o Banco de Dados 🛠️
O projeto utiliza o HikariCP para a conexão com o banco de dados.

## Projeto realizado por:

CineSync foi realizado e concebido por César Rodrigues Ribeiro, com essas redes:

- @Cluwt em todas as redes sociais.