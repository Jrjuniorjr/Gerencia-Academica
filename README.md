# Gerencia-Academica
Projeto da disciplina BDII.

#Como fazer funcionar?
Tem praticamente duas coisas necessárias após fazer download do projeto:
1 -> Importar as libs: Para importar as libs, o projeto tem que está já aberto na IDE. Realizem os seguintes passos no Eclipse:
	1.1: Clicar com o botão direito em cima do projeto.
	1.2: Build Path -> Configure Build Path.
	1.3: Na aba Libraries, apague todas as libraries, exceto a JRE.
	1.4: Clique em Add External JARs.
	1.5: Procure pela pasta libs dentro da pasta do projeto.
	1.6: Selecione todos os JARs dentro da pasta libs. Importe-as clicando em OK.
	1.7: Clique em Apply.
	1.8: Feche a janela.
2 -> Configurar o persistence.xml:
	2.1: Depos de feitos os passos 1, abra o projeto.
	2.2: Abra a pasta META-INF.
	2.3: Abra o arquivo persistence.xlm.
	2.4: Nele, vai ter duas abas: Design e Source. Clique em Source:
	2.5: Troque a url para a url do seu banco de dados.
	2.6: Troque o user para o seu user do banco de dados.
	2.7: Coleque a passwoord(pass) do seu banco de dados.

E a aplicação está pronta para uso.

