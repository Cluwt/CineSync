CREATE DATABASE CineSync;

use CineSync;

-- Criação das tabelas

-- Tabela para armazenar informações dos usuários
CREATE TABLE Usuarios (
    ID INT PRIMARY KEY,
    Nome VARCHAR(100),
    Email VARCHAR(100),
    Senha VARCHAR(100),
    TipoUsuario ENUM('Administrador', 'Comum')
);

-- Tabela para gestão de funcionários
CREATE TABLE Funcionarios (
    ID INT PRIMARY KEY,
    Nome VARCHAR(100),
    Cargo VARCHAR(100),
    DataContratacao DATE,
    Salario DECIMAL(10, 2),
    Departamento VARCHAR(100),
    Email VARCHAR(100),
    Telefone VARCHAR(20)
);

-- Tabela para controle de horários de trabalho dos funcionários
CREATE TABLE HorariosTrabalho (
    ID INT PRIMARY KEY,
    IDFuncionario INT,
    Data DATE,
    HoraEntrada TIME,
    HoraSaida TIME,
    FOREIGN KEY (IDFuncionario) REFERENCES Funcionarios(ID)
);

-- Tabela para registrar atividades dos usuários no sistema
CREATE TABLE RegistroAtividades (
    ID INT PRIMARY KEY,
    IDUsuario INT,
    DataHoraAcao DATETIME,
    AcaoRealizada VARCHAR(255),
    FOREIGN KEY (IDUsuario) REFERENCES Usuarios(ID)
);

-- Tabela para controle de bilheteria
CREATE TABLE Bilheteria (
    ID INT PRIMARY KEY,
    NomeCliente VARCHAR(100),
    TipoIngresso VARCHAR(50),
    Preco DECIMAL(10, 2),
    FormaPagamento VARCHAR(50),
    DataHoraVenda DATETIME,
    StatusOffline BOOLEAN
);

-- Tabela para controle de sessões
CREATE TABLE Sessao (
    ID INT PRIMARY KEY,
    TituloFilme VARCHAR(100),
    HoraInicio TIME,
    SalaID INT,
    FOREIGN KEY (SalaID) REFERENCES Salas(ID)
);

-- Tabela para tipos de ingressos por sessão
CREATE TABLE TiposIngressoSessao (
    ID INT PRIMARY KEY,
    IDSessao INT,
    TipoIngresso VARCHAR(50),
    Preco DECIMAL(10, 2),
    FOREIGN KEY (IDSessao) REFERENCES Sessao(ID)
);

-- Tabela para combos promocionais de ingressos
CREATE TABLE CombosPromocionais (
    ID INT PRIMARY KEY,
    NomeCombo VARCHAR(100),
    Descricao VARCHAR(255),
    Preco DECIMAL(10, 2)
);

-- Tabela para produtos da bomboniere
CREATE TABLE Bomboniere (
    ID INT PRIMARY KEY,
    NomeProduto VARCHAR(100),
    TipoProduto VARCHAR(50),
    Preco DECIMAL(10, 2),
    QuantidadeEstoque INT
);

-- Tabela para controle de níveis de usuários
CREATE TABLE ControleUsuarios (
    ID INT PRIMARY KEY,
    NomeUsuario VARCHAR(100),
    NivelAcesso INT
);

-- Tabela para controle de vendas e fidelidade
CREATE TABLE VendasFidelidade (
    ID INT PRIMARY KEY,
    IDCliente INT,
    ValorTotal DECIMAL(10, 2),
    Pontuacao INT,
    DataHoraVenda DATETIME,
    FOREIGN KEY (IDCliente) REFERENCES Clientes(ID)
);


-- Tabela para controle de totens de autoatendimento
CREATE TABLE TotensAutoatendimento (
    ID INT PRIMARY KEY,
    Localizacao VARCHAR(100),
    StatusOperacional BOOLEAN
);

-- Tabela para controle de salas VIP
CREATE TABLE SalasVIP (
    ID INT PRIMARY KEY,
    NumeroSala INT,
    Capacidade INT,
    StatusDisponibilidade BOOLEAN
);

-- Tabela para controle de fluxo de entrada
CREATE TABLE ControleFluxoEntrada (
    ID INT PRIMARY KEY,
    IDEvento INT,
    IDCliente INT,
    DataHoraEntrada DATETIME,
    TipoEntrada VARCHAR(50),
    FOREIGN KEY (IDEvento) REFERENCES Eventos(ID),
    FOREIGN KEY (IDCliente) REFERENCES Clientes(ID)
);

-- Tabela para controle fiscal
CREATE TABLE ControleFiscal (
    ID INT PRIMARY KEY,
    TipoDocumentoFiscal VARCHAR(50),
    ValorTotal DECIMAL(10, 2),
    DataEmissao DATETIME,
    FOREIGN KEY (IDVenda) REFERENCES Vendas(ID)
);

-- Tabela para programação centralizada
CREATE TABLE ProgramacaoCentralizada (
    ID INT PRIMARY KEY,
    TituloFilme VARCHAR(100),
    DataLancamento DATE,
    DuracaoMinutos INT,
    Genero VARCHAR(50),
    Sinopse TEXT
);

-- Tabela para envio de dados automatizado
CREATE TABLE EnvioDadosAutomatizado (
    ID INT PRIMARY KEY,
    Destinatario VARCHAR(100),
    TipoDocumento VARCHAR(50),
    DataEnvio DATETIME,
    StatusEnvio VARCHAR(50)
);

-- Tabela para controle de TV de publicidade
CREATE TABLE TVPublicidade (
    ID INT PRIMARY KEY,
    NomeCanal VARCHAR(100),
    Programacao TEXT,
    UltimaAtualizacao DATETIME,
    StatusOperacional BOOLEAN
);

-- Tabela para programa de fidelidade
CREATE TABLE ProgramaFidelidade (
    ID INT PRIMARY KEY,
    NomePrograma VARCHAR(100),
    Descricao VARCHAR(255),
    Beneficios VARCHAR(255)
);

-- Tabela para controle financeiro
CREATE TABLE ControleFinanceiro (
    ID INT PRIMARY KEY,
    TipoMovimento VARCHAR(50),
    Valor DECIMAL(10, 2),
    DataMovimento DATETIME,
    FOREIGN KEY (IDVenda) REFERENCES Vendas(ID)
);

-- Tabela para estoque e inventário
CREATE TABLE EstoqueInventario (
    ID INT PRIMARY KEY,
    NomeProduto VARCHAR(100),
    QuantidadeEstoque INT,
    PrecoUnitario DECIMAL(10, 2),
    UltimaAtualizacao DATETIME
);

-- Tabela para compras
CREATE TABLE Compras (
    ID INT PRIMARY KEY,
    IDProduto INT,
    Quantidade INT,
    PrecoUnitario DECIMAL(10, 2),
    DataCompra DATETIME,
    StatusCompra VARCHAR(50),
    FOREIGN KEY (IDProduto) REFERENCES EstoqueInventario(ID)
);

-- Tabela para análises e relatórios
CREATE TABLE AnalisesRelatorios (
    ID INT PRIMARY KEY,
    NomeRelatorio VARCHAR(100),
    Descricao VARCHAR(255),
    TipoAnalise VARCHAR(50),
    UltimaAtualizacao DATETIME
);


