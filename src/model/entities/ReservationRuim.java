package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class ReservationRuim {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;	
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	
	public ReservationRuim(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();          // diverença entre datas em milliseconds;
		return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);   // converte o valor diff em milliseconds para dias;
		
	}
	
	public String updateDates(Date checkIn, Date checkOut) {		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return "Reservation dates for update must be future dates";
		}
		if (!checkOut.after(checkIn)) {
			return "Check-out date must be after check-in date";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}

	@Override
	public String toString() {
		return "roomNumber " 
	            + roomNumber 
	            + ", checkIn : " 
	            + sdf.format(checkIn) 
	            + ", checkOut : " 
	            + sdf.format(checkOut) 
	            + ", "
	            + duration()
	            + " Nights ";
	}		

}


