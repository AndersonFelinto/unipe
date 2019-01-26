# language: pt

@all @req001

Funcionalidade: REQ001 - Calcular Desconto

  Esquema do Cenario: Cálculo do Desconto dos Produtos

    Dado que estou na página inicial do sistema
    Quando clico no menu de acesso à funcionalidade atual
      |menu |<menu> |
    E verifico se estou listagem de produtos
      |titulo| <titulo>|
    E seleciono o primeiro produto para calcular desconto
    E verifico se estou na página de desconto
      |pagDesconto| <pagDesconto>|
    E informo os daods para calcular o desconto
      |tipo_cliente| <tipo_cliente>|
      |quantidade  | <quantidade>  |
    E clico no botão calcular desconto
    Entao verifico se o resultado corresponde ao esperado
      |fatorDesconto| <fatorDesconto>|
      |msg| <msg>|


    Exemplos:
    | menu                    | titulo                       | pagDesconto                       | tipo_cliente | quantidade | fatorDesconto  |msg                             |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| A            | 10         | 0,9            |Operação realizada com sucesso! |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| A            | 101        | 0,85           |Operação realizada com sucesso! |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| A            | 2000       | 0,8            |Operação realizada com sucesso! |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| B            | 10         | 0,95           |Operação realizada com sucesso! |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| B            | 101        | 0,9            |Operação realizada com sucesso! |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| B            | 2000       | 0,85           |Operação realizada com sucesso! |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| C            | 10         | 1              |Operação realizada com sucesso! |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| C            | 101        | 0,95           |Operação realizada com sucesso! |
    | Calcular Desconto       | Listagem de Produtos         | Cálculo do Desconto para o Produto| C            | 2000       | 0,9            |Operação realizada com sucesso! |





