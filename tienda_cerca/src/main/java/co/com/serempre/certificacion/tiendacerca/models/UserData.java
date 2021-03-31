package co.com.serempre.certificacion.tiendacerca.models;

import co.com.serempre.certificacion.tiendacerca.utils.GenerateData;

public class UserData {

    private String city ;
    private String userType;
    private String countryCode ;
    private String firstName;
    private String lastName ;
    private String email;
    private String address;

    public String getCity() {
        return city;
    }

    public String getUserType() {
        return userType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCellPhoneNumber() {
        return GenerateData.ofTheUser().getCellPhoneNumber();
    }

    public String getCellPhoneNumberGreaterThanTenDigits() {
        return GenerateData.ofTheUser().getCellPhoneNumberGreaterThanTenDigits();
    }

    public String getCellPhoneNumberLessThanEightDigits() {
        return GenerateData.ofTheUser().getCellPhoneNumberLessThanEightDigits();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public static UserData get(){
        return new UserData();
    }
}
