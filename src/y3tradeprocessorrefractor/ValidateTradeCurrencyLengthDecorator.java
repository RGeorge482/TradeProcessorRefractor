
package y3tradeprocessorrefractor;

public class ValidateTradeCurrencyLengthDecorator implements DataValidation{
    DataValidation validator = new ValidateTradeCurrencyLength();
    
    @Override
    public boolean validateData(String[] fields) {
        boolean isValid = validator.validateData(fields);
        if(!isValid) System.out.println("Warning: Trade currencies malformed");
        return isValid;
    } 
}
