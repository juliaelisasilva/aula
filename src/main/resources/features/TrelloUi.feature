#language: pt
#enconding: UTF-8
@ui

  Funcionalidade: Trello UI
    @ui
    Esquema do Cenario: Criando, comentando e deletando um card
      Dado que esteja logado no trello
      E acesse o board
      Quando crio um card com o nome "<card Name>"
      E comento "<Comment>"
      Então o card deve estar na lista
      Quando excluo o card
      Então o card não existe mais
      Exemplos:
        |card Name  | Comment                   |
        |Teste card | Comentario teste no card  |
        |Teste card | Coments 2                 |
