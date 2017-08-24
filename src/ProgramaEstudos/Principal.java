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
    
    
    
    //TIRAR O NOME DOS MÉTODOS NAS MENSAGENS DE EERO COM BD
    
    //arrumar o retorna qcS : precisa pegar todos os resultados, ele repete pra pegar todos mas pega só o ultimo
    //dai o ultimo aparece o numero do tamanho da lista
    
    
    
    //pensar na mensagenzinha no novotema quando ele quer adicionar conteúdo e deu pau na conexão com o BD
    //
    
    //tirar as cerquilhas dps de salvar tema
    
    //NÃO TA PEGANDO O COD DO TEMA
    
    /////////AQUIIII
    //quando um tema estava sendo cadastrado e ele aperta em adicionar conteúdo,
    //o "pré-tema" é salvo
    //mas se der pau e o programa fechar, aquele pré-tema, que é diferente de um tema já cadastrado,
    //continuou no BD pq so isso ser atualizado quando ele salavasse o tema
    //então quando o programa começa a rodar, depois de verificar se tem alguém logado...
        //se tiver já verifica se tem algum pré-tema dele salvo no BD
        //toda vez que um usuario ´fizer login, vifica se tem algum pré-tema dele no BD
        //quando tiver a gente da um JOption de opção (sla) e pergunta se ele quer continuar o cadastro
            //se ele quiser manda ele pro cadastra tema com os dados do pré-tema (dai tem que ver o que fazer com o codigo pra por os conteúdos tbm...)
            //senão, apaga o pré-tema do BD
}
