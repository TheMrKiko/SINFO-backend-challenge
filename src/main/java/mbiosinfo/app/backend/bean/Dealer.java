package mbiosinfo.app.backend.bean;

import java.time.DayOfWeek;
import java.util.List;

public class Dealer {
	
	/**
	 * Unique identifier for a dealer
	 */
	private String id;
	/**
	 * Name of the Dealer
	 */
	private String name;
	/**
	 * Latitude of dealer's location
	 */
	private Double Latitude;
	
	/**
	 * Longitude of dealer's location
	 */
	private Double Longitude;
	
	/**
	 * List of vehicles in that dealer
	 */
	private List<Vehicle> vehicles;
	
	/**
	 * List of days that the dealer is closed for business
	 */
	private List<String> closed;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLatitude() {
		return Latitude;
	}

	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}

	public Double getLongitude() {
		return Longitude;
	}

	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<String> getClosed() {
		return closed;
	}

	public void setClosed(List<String> closed) {
		this.closed = closed;
	}

	public Dealer() {
	}

}
