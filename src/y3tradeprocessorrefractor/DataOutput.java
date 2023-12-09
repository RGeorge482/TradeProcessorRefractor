
package y3tradeprocessorrefractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface DataOutput {
    public void saveData(List<TradeRecord> trades) throws IOException; 
}
