
package y3tradeprocessorrefractor;

public class ValidateDataLengthDecorator implements DataValidation{
    private ValidateDataLength validator = new ValidateDataLength();

    @Override
    public boolean validateData(String[] fields) {
        boolean isValid = validator.validateData(fields);
        if(!validator.validateData(fields)) System.out.println("Warning: Incorrect number of fields");
        return isValid;
    }
    
}
