
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
        DataInputFactory dataInputFactory = new DataInputFactory();
        DataIOMenu ioMenu = new DataIOMenu();
        DataIOTypes type = ioMenu.makeMenu("Where do you want to get the data from?");
        //DataInput input = dataInputFactory.makeDataInput(DataIOTypes.CSV);
        DataInput input = dataInputFactory.makeDataInput(type);
        List<String> lines = input.getData();
                              
        // Part 2
        // Part 3
        TradeParser tradeParser = new TradeParser(lines);
        // Validates before parsing
        List<TradeRecord> trades = tradeParser.parseInputData();
        
        //Part 4    
        // Part 5
        DataOutputFactory dataOutputFactory = new DataOutputFactory();
        type = ioMenu.makeMenu("Where do you want to save the data to?");
        //DataOutput output = dataOutputFactory.makeDataOutput(DataIOTypes.DATABASE);
        DataOutput output = dataOutputFactory.makeDataOutput(type);
        output.saveData(trades);
    }   
}
