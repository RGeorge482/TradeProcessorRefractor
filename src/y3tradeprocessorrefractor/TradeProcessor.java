
package y3tradeprocessorrefractor;

import java.io.IOException;
import java.util.List;


/**
 * @author George
 */
public class TradeProcessor {
    
    /*
    1. Reading all the rows from the csv files
    2. Validating each row
    3. Make a new TradeRecord from the validated and parsed data
    4. Setting up database
    5. Inserting trades into database
    */
    
     public void processTrades()
            throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        // Part 1
        System.out.println("Start");
        DataInput input = new CSVReader();
        List<String> lines = input.getData();
                              
        // Part 2
        // Part 3
        TradeParser tradeParser = new TradeParser(lines);
        // Validates before parsing
        List<TradeRecord> trades = tradeParser.parseInputData();
        
        //Part 4
        boolean dbTableReady = Database.setupDatabase();
        if(dbTableReady) {
            
        }
     
     }   
}
