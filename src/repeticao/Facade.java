package repeticao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Facade {
HashSet<String> valores;
        public Facade() {
                this.valores = new HashSet();
        }
        public void readArchive(File path) throws IOException{
                FileReader arq = new FileReader(path);// Prepara um buffer
                // para a leitura de
                // arquivo
                BufferedReader lerArq = new BufferedReader(arq); // Ler a primeira linha
                                                                                                                        // do arquivo
                String linha;
                // vertice do grafo, as arestas que o
                // conectam a outros vertices
                while ((linha = lerArq.readLine()) != null) {
                                        valores.add(linha);
                }
                arq.close();
                lerArq.close();
        }
        @Override
        public String toString() {
                return "Valores sem repeticao : " + valores + "]";
        }
        public HashSet<String> getValores() {
                return valores;
        }
        public void setValores(HashSet<String> valores) {
                this.valores = valores;
        }
}