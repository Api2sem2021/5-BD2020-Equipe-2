<h1 align="center">Projeto Antenas</h1
\
\

![Antenas Logo](https://gitlab.com/jesscahelen/antenas-integracao/uploads/1e6947974c3be4ac0bc1026f297f904a/image.png)

<p align="center">
    <a href="#visao-geral">Visão Geral</a> -
    <a href="#fases-dos-projetos">Fases dos Projetos</a> -
    <a href="#acesso-ao-sistema">Acesso ao Sistema</a> -
    <a href="#tecnologias-utilizadas">Tecnologias Utilizadas</a>
</p>


# Visão Geral
O projeto Antenas permite que empresas, em conjunto com alunos, professores e gestores da [Fatec São José dos Campos - Prof. Jessen Vidal.](https://fatecsjc-prd.azurewebsites.net/) (FATEC-SJC), colaborem para a resolução de problemas, criação de novas funcionalidades em seus produtos e recrutamento de profissionais do ramo da tecnologia.

Através da criação e acompanhamento de um projeto no sistema Antenas, qualquer empresa da região de São José dos Campos e proximidades pode sugerir a realização de alguma solução tecnológica (seja a criação de uma nova tecnologia ou a resolução de algum problema atual da organização) e, após a aprovação de gestores do [Centro de Apoio ao Desenvolvimento e Inovação](https://fatecsjc-prd.azurewebsites.net/cadi.php) (CADI) da FATEC-SJC, essa solução é direcionada para um time de alunos, orientados por um professor, para ser realizada e entregue à empresa solicitante.

### Disciplina Laboratório de Projetos de Bancos de Dados
Este projeto foi desenvolvido por alunos do quinto semestre do curso de Tecnologia em Bancos de Dados da FATEC-SJC durante o primeiro semestre de 2020.
\
\
Visualize os membros do projeto e o histórico de entregas na página da [Wiki](https://gitlab.com/jesscahelen/antenas-integracao/-/wikis/Time-e-Hist%C3%B3rico-de-Entregas).


# Fases dos projetos
![Projeto](https://gitlab.com/jesscahelen/antenas-integracao/uploads/168eac80fffc7e03b71e25ae07768826/image.png)
Em resumo, as 6 fases de um projeto no sistema Antenas são compostas pelos seguintes passos:

### I - Cadastro Inicial:
- Empresa se cadastra no sistema envia uma primeira proposta de projeto contendo apenas uma breve descrição.

### II - Avaliação Inicial:
- Membro do Cadi aprova a primeira proposta e dá prosseguimento ao projeto

### III - Cadastro Detalhado:
- Empresa envia proposta de projeto com informações adicionais, como descriçao completa, lista de tecnologias utilizadas e links externos

### IV - Avaliação Detalhada:
- Membro do CADI aceita a proposta completa enviada pela empresa e retorna a ela uma lista de datas para a realição de uma reunião presencial com os responsáveis pelo projeto e um membro do CADI

### V - Reunião:
- Empresa escolhe a data da reunião e, após sua realização, escolhe um professor responsável por supervisionar um time de alunos que desenvolverá o projeto

### VI - Entrega:
- Após a organização do time e estabelecimento de uma data de entrega, cada aluno envia a parte do projeto pela qual é responsável e a solução completa é enviada à empresa solicitante.

![Projeto](https://gitlab.com/jesscahelen/antenas-integracao/uploads/e007f1f61bc292170fb75021de1701f2/image.png)

# Acesso ao sistema
Acesse uma versão de demonstração do sistema Antenas no link: [Link]

### Teste a aplicação
Para testar uma versão do projeto em um ambiente local, clone o projeto para uma máquina com ambiente JDK e gerenciador de projeto Maven instalados e rode os seguintes comandos no diretório do projeto:

>mvn clean install

>java -jar ./target/antenas.jar

Após a inicialização da aplicação, acesse o sistema através do endereço http://localhost:8080/.

# Tecnologias utilizadas
Entre as principais tecnologias utilizadas no sistema estão:
- Uso do framework Spring Boot para maior segurança no back-end e maior velocidade na manutenção do código e criação de novas funcionalidades

- Banco de dados Mongo Atlas hospedado em nuvem, propiciando segurança dos dados mantidos e versionamento baseado em novos lançamentos da apluicação

- Realização de testes unitarios e de integração após o envio de novos commits para garantia da estabilidade da aplicação 

- Ciclos de CI e CD implementados pela plataforma GitLab. 

- Análise de performance da aplicação com a ferramenta JavaMelody e monitoramento de qualidade do código pela ferramenta SonarCube Cloud.


Para detalhes das tecnologias do sistema, acesse nossa [Wiki](https://gitlab.com/jesscahelen/antenas-integracao/-/wikis/home).











# Projeto Antenas

- [Jean Pierro](https://gitlab.com/JeanLPierro)
- [Jéssica Rosado](https://gitlab.com/jesscahelen/)
- [Marcelo Teixeira](https://gitlab.com/marcelofsteixeira)
- [Rodrigo Prado](https://gitlab.com/RodrigoPradoDaSilva)
- [Rone Bento](https://gitlab.com/ronefb)

## Entregas
Issues da primeira entrega:\
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/1 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/2 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/3 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/5 \
\
Issues da segunda entrega: \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/4 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/10 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/12 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/15 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/16 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/17 

Issues da terceira entrega: \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/6 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/7 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/11 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/18 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/20 \
https://gitlab.com/jesscahelen/antenas-integracao/-/issues/25 

## Refatoração do Código


Com base no código gerado em Padrões de Projeto onde foi utilizado com framework [Java Spark](http://sparkjava.com/), foi necessário realizar a refatoração, tendo em vista implementar melhorias no quesito segurança, modularidade e encapsulamento do sistema, analisando código original não atendia os requisitos não funcionais do sistema de forma adequada.
Pensando nisso, realizamos a refatoração do código no framework [Spring Boot](https://spring.io/projects/spring-boot), até o momento foi [reestruturado as rotas](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/15 "Link para Issue") e [implementado os requisitos de segurança da API](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/16 "Link para Issue") (Filter de requisição, Cookie, Token JWT) Baseado no Spring Boot Security.
\
\
Para controle de versão de release foi implementado o plugin Maven Release Plugin. Onde o plugin do Maven possibilita o incremento automático do número de versão do projeto sempre que uma nova release for lançada. [Link para a issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/7).  
\
O pipeline de CI/CD também foi adaptado para a utilização do framework Spring Boot e a ferramenta de gerenciamento de projetos [Apache Maven](https://maven.apache.org/). [Link para a issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/17).

## Testes

Na fase atual do projeto, são realizados [testes de integração](https://gitlab.com/jesscahelen/antenas-integracao/-/commit/4f894498bb7a7e4cf75a2cd1e0c133cbbb4e3825 "Link para o commit") com o banco Mongo Atlas que utilizam os frameworks JUnit 5 e SpringBootTest, baseados no modelo refatorado com base no framework Spring Boot. [Link para a issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/2).
Após a realização dos testes, é gerado um relatório de cobertura baseado na biblioteca [JaCoCo](https://www.eclemma.org/jacoco/). [Link para a issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/10).

## Gitlab

Foi escolhido Gitlab, um repositório baseado em git, possui várias ferramentas que utilizaremos para outros pontos, e tem bastante implementação com várias ferramentas.
Utilizamos o Gitlab para:
- Gerenciamento de Controle de Fonte
- Continuous Integration com o Gitlab CI
- BurnDown com as [Issues](https://gitlab.com/jesscahelen/antenas-integracao/-/issues "Issues") e [Boards Kanban](https://gitlab.com/jesscahelen/antenas-integracao/-/boards "Boards")

## Google Cloud

Para o deploy da aplicação em nuvem, utilizaremos o [Google Cloud](https://cloud.google.com), Devido a sua compatibilidade com o Gitlab, facilidade na configuração da VM de acordo com as necessidades do projeto, sua documentação detalhada, crédito inicial e estimativa de custos.
\
Até o momento uma vm foi inicializada e configurada juntamente com a configuração do Runner conectando assim o cloud ao Gitlab. [Link para Issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/3)


## CI / CD

 Para a parte de Integração Contínua e Deploy Contínuo utilizaremos o GitLab CI, uma ferramenta disponibilizada pelo GitLab para desenvolvimento de Software através de metodologias contínuas, por fazer parte do time das ferramentas disponibilizadas pelo GitLab e pelo seu set de [recursos disponíveis](https://docs.gitlab.com/ee/ci/#feature-set), de fácil configuração, que auxiliam no processo de DevOps. [Link para Issue relacionada ao arquivo gitlab-ci](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/5).
 \
 \
 As fases de CI do projeto são compostas por:
- Realização de testes unitários e de integração gerenciados pela ferramenta Maven.
- Compilação do código (fase de 'build') através da ferramenta Maven.
- Geração de uma imagem docker utilizando o projeto compilado e upload dela para o repositório projetoantenas/antenas-integracao. [Link para a issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/17).

A fase de CD do projeto passa pelos seguintes passos:
- Download da imagem mais recente do repositório projetoantenas/antenas-integracao para um servidor hospedado no serviço Google Cloud.
- Execução da [aplicação baseada em 3 pods do Google Kubernetes Engine](https://cloud.google.com/kubernetes-engine/docs/tutorials/hello-app#step_8_deploy_a_new_version_of_your_app). [Link para a issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/6).

## Database Automation - MongoDB Atlas + Mongock

Para o banco de dados, utilizaremos o [MongoDB Atlas](https://www.mongodb.com/cloud/atlas), para ter uma segurança a mais que o banco de dados estará disponível, já que estará na Cloud do MongoDB, facilitando também o acesso dos integrantes da equipe e não sobrecarregando menos a máquina virtual em que o aplicativo estará disponível. [Link para Issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/4).
\
No momento o Banco de dados possui 3 mapeamentos de Profile, sendo: dev, prod e test.

Em consonância, realizamos uma implementação do [Mongock](https://github.com/cloudyrock/mongock). O Mongock possui integração com Sring Boot e o Cloud Atlas,
no processo de configuração o Mongock executa inserts de acordo com a versão do schema do ambiente, ao realizar alterações de uma nova versão do Schema é possivel atualizar os ambientes automaticamente definido pelo Profile. 

Ainda estamos trabalhando para automatizar o processo de backup do MongoDB.




## Sonarqube Cloud

Para o Monitoramento do App foi escolhido o [Sonarqube Cloud](https://sonarcloud.io/), pois, possui várias métricas e relatórios de bugs, integração com [Jacoco](https://mvnrepository.com/artifact/org.jacoco/jacoco-maven-plugin) para cobertura de código e integração com Gitlab para que o repositório seja sincronizado. Auxilia a configuração que tem passos manuais e tem a disponibilidade de utilizar sem a necessidade de também sobrecarregar mais nossa máquina virtual e manter disponível o acesso dos dados por todos envolvidos no projeto. [Link para Issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/25).
O Sonarqube é um job do nosso CI, e ele é realizado sempre que há um commit na branch master.
E está disponível para consulta: [Sonarqube Cloud - Projeto Antenas](https://sonarcloud.io/dashboard?id=jesscahelen_antenas-integracao)

## JavaMelody

Para a análise de app é utilizada a [JavaMelody](https://github.com/javamelody), ferramenta Open Source compatível com a plataforma Java que fornece monitoramento de comportamento e estatisticas da aplicação (uso de recurso de sistemas, logs de acesso ao servidor da aplicação, entre outras métricas de análise).[Link para Issue](https://gitlab.com/jesscahelen/antenas-integracao/-/issues/29)

## Configuration

O Processo de configuração automatica do GitLab Runner, possibilitou implementar trabalhos simultaneos, 
instalações automáticas das imagens no google cloud, execução de comando no shell para instalação de programas e criação de cluster kubernets.
