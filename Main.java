import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DroneContext droneContext = new DroneContext();
        DroneListener droneListener = new DroneListener(droneContext);

        while (true) {
            System.out.print("> ");
            String input = reader.readLine();
            if (input == null || input.equals("exit")) {
                break;
            }

            ANTLRInputStream antlrInput = new ANTLRInputStream(input);
            comandosDronLexer lexer = new comandosDronLexer(antlrInput);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            comandosDronParser parser = new comandosDronParser(tokens);
            ParseTree tree = parser.comando();

            ParseTreeWalker.DEFAULT.walk(droneListener, tree);

            // Agregamos una linea en blanco entre comandos
            System.out.println();
        }
    }
}

