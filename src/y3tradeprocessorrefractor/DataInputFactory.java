package y3tradeprocessorrefractor;

public class DataInputFactory {
    public DataInput makeDataInput(DataIOTypes inputType) {
        switch (inputType) {
            case CSV : return new CSVReader();
            default: return null;
        }
    }
    
}
