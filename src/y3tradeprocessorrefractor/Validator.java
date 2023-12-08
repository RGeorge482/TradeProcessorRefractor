
package y3tradeprocessorrefractor;

import java.util.ArrayList;

public class Validator implements DataValidation{
    // components are our validators
    // this represent the composite pattern from SOLID principles
    ArrayList<DataValidation> components = new ArrayList<>();
    public void addComponent(DataValidation validator) {
        components.add(validator);
    }
    
    @Override
    public boolean validateData(String[] fields) {
        boolean isValid = true;
        for (DataValidation component : components) {
            isValid = isValid && component.validateData(fields);
        }
        return isValid;
    }
    
    public boolean validateDataInput(String[] fields) {
        addComponent (new ValidationDecorator(new ValidateDataLength(), "Warning: Incorrect number of fields"));
        addComponent (new ValidationDecorator(new ValidateTradeCurrencyLength(), "Warning: Trade currencies malformed"));
        addComponent (new ValidationDecorator(new TradeAmontValidator(), "Warning: Trade amount not a valid integer"));
        addComponent (new ValidationDecorator(new TradePriceValidator(), "Warning: Trade price not a valid decimal"));
        
        boolean isValid = validateData(fields);
        components.clear();
        return isValid;
    }
     
}
