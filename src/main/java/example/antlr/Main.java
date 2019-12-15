package example.antlr;

import org.antlr.v4.runtime.CharStreams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        LOG.info("Running the example...");

        ExprLexer lexer = new ExprLexer(CharStreams.fromString("100+2*6"));
    }
}
