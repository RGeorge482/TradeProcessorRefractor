package y3tradeprocessorrefractor;

import java.io.IOException;


/**
 * @author George
 */
public class Y3TradeProcessorRefractor {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        TradeProcessor tradeProcessor = new TradeProcessor();
        tradeProcessor.processTrades();
    }   
}
