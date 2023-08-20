import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    //Metodo main, que chama os arquivos lexer e parser para o inicio da compilação

    public static void main(String[] args) {

        try {
            IsiLexer lexer;
            IsiParser parser;

            lexer = new IsiLexer(CharStreams.fromFileName("src/input2.isi"));

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            parser = new IsiParser(tokenStream);

            parser.prog();

            System.out.println("Compilacao bem sucedida");

            parser.generateCode();
        }
        catch(Exception e){
            System.out.println("Existe uma exception: "+e.getMessage());
        }
    }
}