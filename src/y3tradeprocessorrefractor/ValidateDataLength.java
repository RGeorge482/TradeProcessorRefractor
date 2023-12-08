
package y3tradeprocessorrefractor;

public class ValidateDataLength implements DataValidation{

    @Override
    public boolean validateData(String[] fields) {
       return fields.length == 3; 
    } 
}
