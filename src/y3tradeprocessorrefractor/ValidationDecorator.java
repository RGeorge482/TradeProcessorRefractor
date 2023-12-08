/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y3tradeprocessorrefractor;

/**
 *
 * @author 35386
 */
public class ValidationDecorator implements DataValidation{
    private DataValidation validator;
    private String errorMessage;

    public ValidationDecorator(DataValidation validator, String errorMessage) {
        this.validator = validator;
        this.errorMessage = errorMessage;
    }
    
    @Override
    public boolean validateData(String[] fields) {
        boolean isValid = validator.validateData(fields);
            if(!isValid) System.out.println(errorMessage);
        return isValid;
    }   
}
