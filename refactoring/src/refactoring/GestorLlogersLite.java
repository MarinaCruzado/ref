package refactoring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLlogersLite {
	
	public static void main(String[] args ) throws ParseException {
		// demostració de construcció d'un vehicle de categoria BASIC
		Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

		// demostració de construccuó d'un lloguer amb una data
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);

		// demostració de formatat d'una data
		//System.out.println(dateFormat.format(lloguerBasic.getData()));
		
		Client c = new Client("123456", "Marina", "6666666");
		
	    SimpleDateFormat dateFormat1 = new SimpleDateFormat("d/M/yyyy");
		Vehicle v1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
	    Date date1 = dateFormat1.parse("2/8/2013");
	    Lloguer ll1 = new Lloguer(date1, 2, v1);
	    
	    Vehicle v2 = new Vehicle ("Hyundai", "Atos", Vehicle.LUXE);
	    Date date2 = dateFormat1.parse("2/10/2017");
	    Lloguer ll2 = new Lloguer(date2, 1, v2);
	    
	    Vehicle v3 = new Vehicle("Seat","Cupra", Vehicle.GENERAL);
	    Date date3 = dateFormat1.parse("2/8/2020");
	    Lloguer ll3 = new Lloguer(date3, 5, v3);
	    
		
	}
	
}
