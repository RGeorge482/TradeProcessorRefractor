package y3tradeprocessorrefractor;

public class TradeAmontValidator implements DataValidation{

    @Override
    public boolean validateData(String[] fields) {
       boolean isValid = true;
       try{
           int tradeAmount = Integer.parseInt(fields[1]);
       } catch(Exception e) {
           isValid = false;
       }
       return isValid;
    }
    
}
