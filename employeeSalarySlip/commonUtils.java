package employeeSalarySlip;
import java.text.*;
import java.util.*;

public class commonUtils {

    Locale locale;
    
    public commonUtils(String lang,String country) {
        locale = new Locale(lang,country);
    }

    public String getProperName(String name) {
        String nameArr[] = name.split(" ");
        String properName = "";
        for(String n : nameArr) {
            char firstChar = n.charAt(0);
            String firstLetter = String.valueOf(firstChar).toUpperCase();
            String remainingName = n.substring(1).toLowerCase();
            properName += firstLetter + remainingName + " ";
        }
        return properName;
    }

    public String formatDate() {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
        return df.format(date);
    }

    public String formatNumber(double salary) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(salary);
    }
}
