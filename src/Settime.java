import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

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



//public void setTime() {
//	timeFormat = new SimpleDateFormat("hh:mm:ss a");
//	
//	
//	Thread clock = new Thread() {
//		
//		public void run() {
//			
//			  while(true) {
//				  
//		
//				  try {
//				   time = timeFormat.format(Calendar.getInstance().getTime());
//				   text.setText(time);
//				   System.out.println(time);
//				   sleep(1000);
//				  } catch (InterruptedException e) {
//				 
//				   e.printStackTrace();
//				  }
//				  }
//			
//		}
//	
//	 };
//	 clock.start();
//}



//public void setTime() {
//	
//	Thread clock = new Thread() {
//
//		
//
//			public void run() {
//				
//				try {
//					
//					for(;;) {
//						
//						Calendar cal = new GregorianCalendar();
//						 sec = cal.get(Calendar.SECOND);
//						 minute = cal.get(Calendar.MINUTE);
//						 houre = cal.get(Calendar.HOUR);
//						
//						
//						//System.out.println("Time  : "+houre+":"+ minute +":"+ sec);
//						//lblNewLabel.setText("Time"+houre + minute + sec);
//						
//					
//						 text.setText("Time"+houre + minute + sec);
//					sleep(1000);
//					}
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				
//			}
//		
//		
//		
//	};
//	
//	clock.start();
//	
//}



//
//
//Calendar cal = new GregorianCalendar();
// sec = cal.get(Calendar.SECOND);
// minute = cal.get(Calendar.MINUTE);
// houre = cal.get(Calendar.HOUR);
//
// String s=String.valueOf(sec);
//
//
//System.out.println("Time  : "+houre+":"+ minute +":"+ sec);
//
////text.setText( "Time  : "+ houre+":"+ minute +":"+ sec );
////this.Cl.setText("Time  : ");

	
	
	