
package y3tradeprocessorrefractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CSVReader implements DataInput {
    BufferedReader myReader;
    List<String> lines = new ArrayList<>();
 
    @Override
    public List<String> getData() throws IOException {
       myReader = new BufferedReader(new FileReader("trades.csv"));
       String inputLine = myReader.readLine();
       while ((inputLine = myReader.readLine()) != null) {
            lines.add(inputLine);
       } 
       return lines;
    }
}
