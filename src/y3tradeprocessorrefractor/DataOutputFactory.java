package y3tradeprocessorrefractor;

public class DataOutputFactory {
      public DataOutput makeDataOutput(DataIOTypes type) {
        switch (type) {
            case DATABASE : return new DatabaseOutput();
            default : return null;
        }
    }
    
}
