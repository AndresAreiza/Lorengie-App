/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 * Class provider
 * @author Asus
 */
public class Provider {
    private String codeProvider; /** Code provider*/
    private String nameProvider; /** Name provider*/
    private String telephoneNumberProvider; /**Telephone number provider*/

    /**
     * Default constructor
     */
    public Provider() {
    }
    /**
     * 
     * @param codeProvider Code provider
     * @param nameProvider Name provider
     * @param telephoneNumberProvider Telephone number provider
     */
    public Provider(String codeProvider, String nameProvider, String telephoneNumberProvider) {
        this.codeProvider = codeProvider;
        this.nameProvider = nameProvider;
        this.telephoneNumberProvider = telephoneNumberProvider;
    }
    /**
     * Get code provider
     * @return Code provider
     */
    public String getCodeProvider() {
        return codeProvider;
    }
    /**
     * Set code provider
     * @param codeProvider code provider
     */
    public void setCodeProvider(String codeProvider) {
        this.codeProvider = codeProvider;
    }
    /**
     * Get name product
     * @return name provider
     */
    public String getNameProvider() {
        return nameProvider;
    }
    /**
     * Set name provider
     * @param nameProvider  name provider
     */
    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }
    /**
     * Get telephone number provide
     * @return telephone number provide
     */
    public String getTelephoneNumberProvider() {
        return telephoneNumberProvider;
    }
    /**
     * Set telephone number provide
     * @param telephoneNumberProvider telephone number provide
     */
    public void setTelephoneNumberProvider(String telephoneNumberProvider) {
        this.telephoneNumberProvider = telephoneNumberProvider;
    }
    
    
}