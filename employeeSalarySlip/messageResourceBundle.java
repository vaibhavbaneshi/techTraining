package employeeSalarySlip;
import java.util.*;

class messageResourceBundle {
	
	ResourceBundle rb;
	
	public messageResourceBundle() {
		rb = ResourceBundle.getBundle("message");
	}
	
	public String getValue(String key) {
		return rb.getString(key);
	}
}