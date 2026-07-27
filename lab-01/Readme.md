# Sistema de Controle de Versão

## Configuração inicial para uso do Git

### Configuração de nome de usuário e e-mail no Git

Antes de enviar commits em um repositório, é necessário configurar um nome de usuário e um endereço de e-mail no Git. Essas informações são utilizadas para identificar o autor de cada commit, permitindo que o histórico do projeto registre quem realizou cada alteração. Essa configuração precisa ser feita apenas uma vez no computador. Para isso, execute os seguintes comandos no terminal:

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seuemail@exemplo.com"
```

### Criando Personal Access Token (PAT) no GitHub

O Personal Access Token (PAT) é uma forma de autenticação utilizada pelo GitHub para substituir o uso da senha em operações realizadas pelo Git, como enviar e receber alterações de um repositório. O uso do PAT aumenta a segurança da conta, permite definir quais permissões o token terá e também configurar um tempo de validade, fazendo com que ele expire automaticamente após o período escolhido.

1. Acesse o site do GitHub (https://github.com/) e faça login em sua conta.
2. Clique na foto do perfil e acesse **Settings**.
3. No menu lateral, entre em **Developer settings**.
4. Selecione **Personal access tokens** e depois **Tokens (classic)**.
5. Clique em **Generate new token (classic)**.
6. Defina um nome, um período de validade para o token e as permissões desejadas.
7. Clique em **Generate token** e copie o código gerado, pois ele será exibido apenas uma vez.

### Salvar em cache as credenciais do PAT

## Qual a diferença entre git merge e git rebase?
