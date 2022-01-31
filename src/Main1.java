import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.wb.swt.SWTResourceManager;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class Main1 {

	protected Shell shell;
	

	SimpleDateFormat timeFormat;	

	private String JTex;
	private Text text;
	private int  sec ;
	private int  minute ;
	private int  houre ;
	public int Gmt  = 0;
	public int r  = 0;
	public int ah  = 0;
	public int am = 0;
	public int as  = 0;
	Normal Nm = new Normal();
	Alert Al = new Alert();
	Alert2 Al2 = new Alert2();
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		

		try {
			
			Main1 window = new Main1();
			window.open();
		 	

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	public Main1() {
		
		
		

		
	}
	
	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		setTime();
		createContents();
		shell.open();
		shell.layout();
	
		while (!shell.isDisposed()) {
			
			if (!display.readAndDispatch()) {
				
				display.sleep();
			
			}
		}
		
	}

	
	
	
	
	
	
	/**
	 * Create contents of the window.
	 */
	
	protected void createContents() {
		shell = new Shell();
		shell.setSize(473, 327);
		shell.setText("Current Clock");

	    
		//setTime();
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(30, 10, 415, 136);
		
		Label lblH = new Label(composite, SWT.NONE);
		lblH.setBounds(82, 10, 59, 14);
		lblH.setText("Hour");
		
		Label lblM = new Label(composite, SWT.NONE);
		lblM.setBounds(177, 10, 59, 14);
		lblM.setText("Minute");
		
		Label lblS = new Label(composite, SWT.NONE);
		lblS.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 11, SWT.NORMAL));
		lblS.setBounds(278, 10, 59, 14);
		lblS.setText("Second");
		
		text = new Text(composite, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		text.setEditable(false);
		text.setBounds(39, 30, 323, 80);
		//formToolkit.adapt(text, true, true);
		
		
		
		
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				
				Nm.open();
					
				Gmt = Nm.getGMT();
				if(Gmt >=24) {
					Gmt = Gmt - 24;
					
				}
				//System.out.println("Gmtnnbn = " + Gmt);
					
				
			}
		});
		btnNewButton.setBounds(41, 166, 177, 49);
		btnNewButton.setText("Normal");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				
				
				Al.open();
				setAlert();
				System.out.println("timeMainii =  " + ah + " : " + am +" : " + as);
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(247, 166, 177, 49);
		btnNewButton_1.setText("Alert");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_2.setBounds(41, 231, 177, 49);
		btnNewButton_2.setText("Countdown");
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_3.setBounds(247, 231, 177, 49);
		btnNewButton_3.setText("Stop");
		


	}
	
	
	public void setTime() {
		
		new Thread(new Runnable() {
		      public void run() {
		         while (true) {
		            try { Thread.sleep(1000); } catch (Exception e) { }
		            Display.getDefault().asyncExec(new Runnable() {
		               public void run() {
		            	   
								Calendar cal = new GregorianCalendar();
								minute = cal.get(Calendar.MINUTE);
								houre = cal.get(Calendar.HOUR_OF_DAY);
								sec = cal.get(Calendar.SECOND);
								
								
								System.out.println("In Thtread : "+houre +"+"+ Gmt);
								houre = houre+Gmt;
								
								
								if(houre >=24) {
									
									houre = houre- 24;
									
								}
								
								if(houre == ah && minute == am && sec == as) {
									
									Al2.open();
									
									
								}
								//System.ou
								JTex ="      "+ houre +"     :    "+ minute +"     :     "+ sec;
								text.setText(JTex);

		               }
		            });
		         }
		      }
		   }).start();
		
		
		
		
	}
	
	public void setAlert() {
		
		 ah = Al.h ;
		 am = Al.m ;
		 as = Al.s;

		
	}
	
}
