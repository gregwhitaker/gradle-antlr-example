package example.antlr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyListener extends ExprBaseListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyListener.class);

    @Override
    public void enterExpr(ExprParser.ExprContext ctx) {
        LOG.info(ctx.getText());
    }
}
