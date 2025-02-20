algoritmo "exercicio_aula_05"
var
   valor, parcelas, valor_juros, valor_parcelas: Real
inicio
      Escreva("Qual o valor do empréstimo? ")
      Leia(valor)
      Escreva("Quantas parcelas? ")
      Leia(parcelas)
      valor_juros <- valor + (valor * 20 / 100)
      valor_parcelas <- valor_juros / parcelas
      Escreval("Vou pagar", parcelas, " parcelas de R$", valor_parcelas)
      Escreva("O valor totaliza em:", valor_juros)
fimalgoritmo