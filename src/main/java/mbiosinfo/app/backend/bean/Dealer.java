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
	private List<DayOfWeek> closed;

	public Dealer() {
	}

}
