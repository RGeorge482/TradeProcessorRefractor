
package y3tradeprocessorrefractor;

import java.util.ArrayList;
import java.util.List;

public class TradeParser {
    private List<String> inputData;
    private ArrayList<TradeRecord> parsedTrades;
    private Validator validator = new Validator(); 
    

    public TradeParser(List<String> inputData) {
        this.inputData = inputData;
    }

    // validation is done while we parsing the input data
   public ArrayList<TradeRecord> parseInputData(){
       for (String line : inputData) {
          String[] fields = line.split(","); 
          Validator validator = new Validator();
          
          if(!validator.validateDataInput(fields)) continue;
          
           String sourceCurrencyCode = fields[0].substring(0, 3);
           String destinationCurrencyCode = fields[0].substring(3, 6);
           double tradePrice = Double.parseDouble(fields[2]);
           int tradeAmount = Integer.parseInt(fields[1]);

           TradeRecord trade = new TradeRecord(sourceCurrencyCode, destinationCurrencyCode, tradeAmount, tradePrice);
           parsedTrades.add(trade);
       }
       return parsedTrades;
   }
    
    
}
