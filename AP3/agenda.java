package AP3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class agenda {

  public void escrita(String nome, String telefone) {
    try {
      // Filewriter permite escrever no arquivo. O true adiciona novos dados sem
      // apagar os que já estão.
      FileWriter fw = new FileWriter("c:/arquivo/agenda.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(nome + ";" + telefone);
      bw.newLine();

      bw.close();
      fw.close();
    } catch (IOException e) {
      e.printStackTrace(); // exibe erros caso algo de errado
    }
  }

  public void lerTodos() {
    try {
      // FileReader le o arquivo e bufferedReader facilita a leitura linha por linha
      FileReader fr = new FileReader("c:/arquivo/agenda.txt");
      BufferedReader br = new BufferedReader(fr);
      // le todas as linhas
      while (br.ready()) {
        String aux = br.readLine();
        String[] dados = aux.split(";");

        System.out.println("Nome:" + dados[0] + " - Telefone:" + dados[1]);
      }
      br.close();
      fr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
