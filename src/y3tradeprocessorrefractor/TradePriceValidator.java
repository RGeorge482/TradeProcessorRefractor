package y3tradeprocessorrefractor;

public class TradePriceValidator implements DataValidation{

    @Override
    public boolean validateData(String[] fields) {
        boolean isValid = true;
       try{
           double tradePrice = Double.parseDouble(fields[2]);
       } catch(Exception e) {
           isValid = false;
       }
       return isValid;
    }
    
}
