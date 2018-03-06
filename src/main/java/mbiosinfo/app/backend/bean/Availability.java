package mbiosinfo.app.backend.bean;

import java.util.List;

public class Availability {
	
	private String key; //DayOfWeek
	private List<String> value; //LocalTime
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<String> getValue() {
		return value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}

}
