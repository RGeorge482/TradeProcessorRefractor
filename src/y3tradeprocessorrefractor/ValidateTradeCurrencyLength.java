
package y3tradeprocessorrefractor;


public class ValidateTradeCurrencyLength implements DataValidation{

    @Override
    public boolean validateData(String[] fields) {
       return fields[0].length() != 6; 
    }
    
}
