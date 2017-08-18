package ProgramaEstudos;

public class Principal {
    /* -- Banco de dados --
    CREATE DATABASE PROGRAMA_ESTUDOS CHARSET LATIN1 COLLATE LATIN1_GENERAL_CS;
    USE PROGRAMA_ESTUDOS;

    CREATE TABLE USUARIO(
	NOME_USUARIO VARCHAR(60) PRIMARY KEY,
        SENHA_USUARIO VARCHAR(60) NOT NULL
    );

    CREATE TABLE TEMA(
	COD_TEMA INT AUTO_INCREMENT PRIMARY KEY,
        TITULO_TEMA VARCHAR(60) NOT NULL,
        MATERIA_TEMA VARCHAR(20) NOT NULL,
        PRIVADO BOOLEAN NOT NULL,
        NOME_USUARIO VARCHAR(60) NOT NULL,
        FOREIGN KEY(NOME_USUARIO) REFERENCES USUARIO(NOME_USUARIO)
    );

    CREATE TABLE QC(
	TERMO_PERGUNTA VARCHAR(2000) NOT NULL,
        CONCEITO_RESPOSTA VARCHAR(2000) NOT NULL,
        COD_TEMA INT NOT NULL,
    FOREIGN KEY(COD_TEMA) REFERENCES TEMA(COD_TEMA)
    );
    */
    
    
    //colocar instrução de evento no botão voltar do perfil do usuário
    //colocar os ToolTipText
    //colocar a primeira letra do nome do usuario maiuscula quando mostra o perfil
    //por .trim() em tudo
    //perguntar se deseja sair quando ta cadastrando novo usuário/tema e clica em voltar
}
