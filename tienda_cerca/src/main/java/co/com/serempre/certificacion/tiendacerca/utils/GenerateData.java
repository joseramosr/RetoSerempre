package co.com.serempre.certificacion.tiendacerca.utils;
import java.util.Calendar;
import java.util.TimeZone;

public class GenerateData {

    private String month;
    private String day;
    private String hour;
    private String minutes;
    private String second;
    private String milliseconds;

    public GenerateData() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("America/Bogota"));
        this.month = reformatDate(calendar.get(Calendar.MONTH)+1);
        this.day = reformatDate(calendar.get(Calendar.DAY_OF_MONTH));
        this.hour = reformatDate(calendar.get(Calendar.HOUR_OF_DAY));
        this.minutes = reformatDate(calendar.get(Calendar.MINUTE));
        this.second = reformatDate(calendar.get(Calendar.SECOND));
        this.milliseconds = reformatDate(calendar.get(Calendar.MILLISECOND));
    }

    public static GenerateData ofTheUser(){
        return new GenerateData();
    }

    public String getCellPhoneNumber() {
        String formatDate = month+day+hour+minutes+second;
        return formatDate;
    }

    public String getCellPhoneNumberGreaterThanTenDigits() {
        String formatDate = month+day+hour+minutes+second+milliseconds;
        return formatDate;
    }

    public String getCellPhoneNumberLessThanEightDigits() {
        String formatDate = month+day+hour;
        return formatDate;
    }

    private String reformatDate(int date){
        if(date < 10){
            return '0'+String.valueOf(date);
        }else{
            return String.valueOf(date);
        }
    }

}
