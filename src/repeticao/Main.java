package repeticao;
import java.io.File;
import java.io.IOException;
public class Main {
    public Main() {
        // TODO Auto-generated constructor stub
    }
    public static void main(String[] args) throws IOException {
        File file = new File("../sem_repeticao/src/numero_station"); //Coloca o caminho do arquivo desejado
        Facade facade = new Facade();
        facade.readArchive(file);
        System.out.println("Total de valores sem repeticao: " + facade.getValores().size()); //Imprime quantidade total de valores achados sem repeticao
        System.out.println(facade.toString()); //Imprime os valores
    }
}