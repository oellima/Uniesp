# classe que representa um nó da lista
class No:
  # construtor da classe
  def __init__(self, valor):
    self.valor = valor
    self.proximo = None

  # retorna o valor do nó
  def obter_valor(self):
    return self.valor

# classe que representa a lista sequencial
class ListaSequencial:
  # construtor da classe
  def __init__(self):
    self.inicio = None

  # método que pesquisa um valor na lista
  def pesquisar(self, valor):
    no = self.inicio
    while no is not None:
      if no.valor == valor:
        print("\nO valor foi encontrado na lista\n")
        return
      no = no.proximo

    print("\nO valor não foi encontrado na lista\n")

  # método que percorre todos os elementos da lista (iterator)
  def __iter__(self):
    no = self.inicio
    while no is not None:
        yield no
        no = no.proximo

  # método que permite inserir um novo item na lista
  def inserir(self, no):
    if self.inicio is None:
      self.inicio = no
    else:
      temp = self.inicio
      while temp.proximo is not None:
        temp = temp.proximo
      
      temp.proximo = no

  # método que remove um valor da lista
  def remover(self, valor):
    # a lista está vazia?
    if self.inicio is None:
      print("\nA lista está vazia\n")
      return

    # o valor pesquisado está no início da lista?
    if self.inicio.valor == valor:
      self.inicio = self.inicio.proximo
      print("\nO valor foi removido com sucesso.\n")
      return

    no_anterior = self.inicio
    for no in self:
      if no.valor == valor:
        no_anterior.proximo = no.proximo
        print("\nO valor foi removido com sucesso.\n")
        return
    
      no_anterior = no

    print("\nO valor pesquisado não foi encontrado.\n")

  # método que imprime a lista
  def imprimir(self):
    # a lista está vazia?
    if self.inicio is None:
      print("\nA lista está vazia\n")
      return
    else:
      print("\nVALORES NA LISTA:\n")

      no = self.inicio
      while no is not None:
        print(no.valor)
        no = no.proximo      

def main():
  # cria uma nova lista
  lista = ListaSequencial()

  # vamos criar o menu de opções
  while(True):
    print("\n---------- FILA SEQUENCIAL ----------\n")
    print("1. Verificar se um número pertence lista")
    print("2. Inserir um novo elemento na lista")
    print("3. Remover um elemento da lista")
    print("4. Imprimir os valores da lista")
    print("5. Sair")
    
    # vamos ler a opção informada pelo usuário
    opcao = int(input("Sua opção: "))

    if(opcao == 1): # pesquisa um número na lista
      numero = input("\nInforme o número: ")
      lista.pesquisar(numero)

    elif(opcao == 2): # insere um novo número na lisat
      numero = input("\nInforme o número: ")
      lista.inserir(No(numero))
      print("\nNúmero inserido com sucesso.\n")

    elif(opcao == 3): # remove um número da lista
      numero = input("\nInforme o número: ")
      lista.remover(numero)

    elif(opcao == 4): # imprima a lista
      lista.imprimir()

    elif(opcao == 5):
      break

if __name__== "__main__":
  main()    

