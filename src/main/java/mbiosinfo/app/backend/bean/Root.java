package mbiosinfo.app.backend.bean;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

import javax.persistence.Entity;

//@Entity
public class Root {
	private List<Dealer> dealers;
	private List<Booking> bookings;
	
	public List<Dealer> getDealers() {
		return dealers;
	}
	public void setDealers(List<Dealer> dealers) {
		this.dealers = dealers;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

}
