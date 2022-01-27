import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Settime {

	
	private String time;
	SimpleDateFormat timeFormat;	
	
	public String setTime() {
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		 
		  while(true) {
			  
		  time = timeFormat.format(Calendar.getInstance().getTime());
		  System.out.println(time)  ;

		  try {
		   Thread.sleep(1000);
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  }
		 }
	
	
	
	
}
