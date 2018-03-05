package mbiosinfo.app.backend.bean;

import java.time.LocalDateTime;

public class Booking {
	
	private String id;
	private String vehicleId;
	private String firstName;
	private String lastName;
	private LocalDateTime pickupDate;
	private LocalDateTime createdAt;
	private LocalDateTime cancelledAt;
	private String cancelledReason;
	
}
