"""
3 - Construa um programa em Python de acordo com situação problema descrita: Um grupo
de soldados está cercado e não há esperança de vitória, porém existe somente um cavalo
disponível para escapar e buscar por reforços. Para determinar qual soldado deve escapar
para encontrar ajuda, eles formam um círculo (Fila Circular) e sorteiam um número de um
chapéu. Começando por um soldado sorteado aleatoriamente, uma contagem é realizada
até o número sorteado. Quando a contagem terminar, o soldado em que a contagem
parou é removido do círculo, um novo número é sorteado e a contagem recomeça no
soldado seguinte ao que foi eliminado. A cada rodada, portanto, o círculo diminui em um,
até que somente um soldado reste e seja escolhido para a tarefa.
"""

import random

class FilaCircular:
  # construtor da classe
  def __init__(self, tamanho):
    self.tamanho = tamanho
         
    # inicializa os elementos da fila
    self.fila = [None for i in range(tamanho)]
    self.inicio = self.final = -1
 
  def enfileirar(self, elemento):
    if ((self.final + 1) % self.tamanho == self.inicio):
      print("\nFila está cheia\n")
             
    elif (self.inicio == -1):
      self.inicio = 0
      self.final = 0
      self.fila[self.final] = elemento
    else:
      self.final = (self.final + 1) % self.tamanho
      self.fila[self.final] = elemento
             
  def desenfileirar(self):
    if (self.inicio == -1):
      print("\nA fila está vazia.\n")
             
    elif (self.inicio == self.final):
      temp = self.fila[self.inicio]
      self.inicio = -1
      self.final = -1
      return temp
    else:
      temp = self.fila[self.inicio]
      self.inicio = (self.inicio + 1) % self.tamanho
      return temp

def main():
  # cria uma nova fila circular
  fila = FilaCircular(10)

  # insere 10 chapéus na fila
  for i in range(1, 11):
    fila.enfileirar(i)  
 
  # gera o chapéu aleatório de 1 até 10 
  numero = random.randrange(1, 11)

  for i in range(1, numero):
     removido = fila.desenfileirar()
     if(removido != numero):
       fila.enfileirar(removido)
 
  removido = fila.desenfileirar()
  print("O chapéu restante é o {0}".format(removido))

if __name__== "__main__":
  main()    
