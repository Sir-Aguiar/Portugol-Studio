package br.univali.portugol.nucleo.bibliotecas;

import br.univali.portugol.nucleo.bibliotecas.base.Biblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.ErroExecucaoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.TipoBiblioteca;
import br.univali.portugol.nucleo.bibliotecas.base.anotacoes.*;

@PropriedadesBiblioteca(tipo = TipoBiblioteca.COMPARTILHADA)
@DocumentacaoBiblioteca(descricao = "Biblioteca adicionando métodos de operação à vetores", versao = "1.0")
public final class Vetores extends Biblioteca {
  @DocumentacaoFuncao(
          descricao = "Encontra o índice do elemento passado, se houver mais de um retornará o primeiro",
          retorno = "Retornará o índice do elemento correspondente, ou -1 caso não haja",
          parametros = {
                  @DocumentacaoParametro(nome = "vetor", descricao = "Vetor a ser iterado"),
                  @DocumentacaoParametro(nome = "elemento", descricao = "Elemento a ser encontrado no vetor")
          },
          autores = {
                  @Autor(nome = "Felipe Aguiar", email = "felipeferreiraaguiar9@gmail.com")
          }
  )
  public int encontrar_indice_elemento(Object[] vetor, Object elemento) throws ErroExecucaoBiblioteca, InterruptedException {
    for (int index = 0; index < vetor.length; index++) {
      if (vetor[index].equals(elemento)) {
        return index;
      }
    }

    return -1;
  }

  @NaoExportar
  public int encontrar_indice_elemento(String[] vetor, String elemento) throws ErroExecucaoBiblioteca, InterruptedException {
    for (int index = 0; index < vetor.length; index++) {
      if (vetor[index].equals(elemento)) {
        return index;
      }
    }

    return -1;
  }

  @NaoExportar
  public int encontrar_indice_elemento(int[] vetor, int elemento) throws ErroExecucaoBiblioteca, InterruptedException {
    for (int index = 0; index < vetor.length; index++) {
      if (vetor[index] == (elemento)) {
        return index;
      }
    }

    return -1;
  }

  @NaoExportar
  public int encontrar_indice_elemento(double[] vetor, double elemento) throws ErroExecucaoBiblioteca, InterruptedException {
    for (int index = 0; index < vetor.length; index++) {
      if (vetor[index] == (elemento)) {
        return index;
      }
    }

    return -1;
  }

  @NaoExportar
  public int encontrar_indice_elemento(char[] vetor, char elemento) throws ErroExecucaoBiblioteca, InterruptedException {
    for (int index = 0; index < vetor.length; index++) {
      if (vetor[index] == (elemento)) {
        return index;
      }
    }

    return -1;
  }

  @DocumentacaoFuncao(
          descricao = "Soma os números do vetor",
          retorno = "Retorna a soma dos valores no vetor informado",
          parametros = {
                  @DocumentacaoParametro(nome = "vetor", descricao = "Vetor a ser iterado")
          },
          autores = {
                  @Autor(nome = "Felipe Aguiar", email = "felipeferreiraaguiar9@gmail.com")
          }
  )
  public int soma_elementos(int[] vetor) throws ErroExecucaoBiblioteca, InterruptedException {
    int soma = 0;

    for (int i : vetor) {
      soma += i;
    }

    return soma;
  }

  @NaoExportar
  public double soma_elementos(double[] vetor) throws ErroExecucaoBiblioteca, InterruptedException {
    double soma = 0;

    for (double i : vetor) {
      soma += i;
    }

    return soma;
  }

  @NaoExportar
  public long soma_elementos(long[] vetor) throws ErroExecucaoBiblioteca, InterruptedException {
    long soma = 0;

    for (long i : vetor) {
      soma += i;
    }

    return soma;
  }

  @DocumentacaoFuncao(
          descricao = "Calcular a média dos valores numéricos do vetor em questão",
          retorno = "Retorna a média dos valores do vetor",
          parametros = {
                  @DocumentacaoParametro(nome = "vetor", descricao = "Vetor a ser iterado")
          },
          autores = {
                  @Autor(nome = "Felipe Aguiar", email = "felipeferreiraaguiar9@gmail.com")
          }
  )
  public double media_elementos(Object vetor) throws ErroExecucaoBiblioteca, InterruptedException {
    if (vetor instanceof int[]) {
      return media_elementos((int[]) vetor);
    } else if (vetor instanceof double[]) {
      return media_elementos((double[]) vetor);
    } else if (vetor instanceof long[]) {
      return media_elementos((long[]) vetor);
    }

    throw new ErroExecucaoBiblioteca("Este método não suporta este tipo de vetor");
  }

  @NaoExportar
  public double media_elementos(int[] vetor) throws ErroExecucaoBiblioteca, InterruptedException {
    if (vetor.length == 0) {
      return 0;
    }

    int soma = 0;

    for (int i : vetor) {
      soma += i;
    }

    return (double) soma / vetor.length;
  }

  @NaoExportar
  public double media_elementos(double[] vetor) throws ErroExecucaoBiblioteca, InterruptedException {
    if (vetor.length == 0) {
      return 0;
    }

    double soma = 0;

    for (double i : vetor) {
      soma += i;
    }

    return soma / vetor.length;
  }

  @NaoExportar
  public double media_elementos(long[] vetor) throws ErroExecucaoBiblioteca, InterruptedException {
    if (vetor.length == 0) {
      return 0;
    }

    long soma = 0;

    for (long i : vetor) {
      soma += i;
    }

    return (double) soma / vetor.length;
  }


}
