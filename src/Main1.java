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
	
	private String time;
	SimpleDateFormat timeFormat;	

	private String JTex;
	private Label lblCl;
	private Label lblcl2;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	
	
	
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

	
	public void setTime() {
		
		Thread clock = new Thread() {

			

			public void run() {
				
				try {
					
					for(;;) {
						
						Calendar cal = new GregorianCalendar();
						int  sec = cal.get(Calendar.SECOND);
						int  minute = cal.get(Calendar.MINUTE);
						int  houre = cal.get(Calendar.HOUR);
						
						
						System.out.println("Time  : "+houre+":"+ minute +":"+ sec);
						//lblNewLabel.setText("Time"+houre + minute + sec);
					
						
						JTex = houre+":"+ minute +":"+ sec;
						System.out.println("JTex  : "+JTex);
						
						//jtext.setText("Time"+houre + minute + sec);
						 
						 
					sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		
		
		
	};
	
	clock.start();
}
		
	
	
	public Main1() {
		
		setTime();


		
	}
	
	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		
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
		shell.setText("SWT Application");
	    LocalTime Time = LocalTime.now();
		Normal Nm = new Normal();
		Settime st = new Settime();
		
		
		
//		Settime st = new Settime();
//		st.setTime();
		
		
		DateTimeFormatter Time1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		
		String FT = Time.format(Time1);
		
		System.out.println(FT);
	    
	    
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(30, 10, 415, 136);
		
		Label lblH = new Label(composite, SWT.NONE);
		lblH.setBounds(67, 10, 59, 14);
		lblH.setText("Hour");
		
		Label lblM = new Label(composite, SWT.NONE);
		lblM.setBounds(159, 10, 59, 14);
		lblM.setText("Minute");
		
		Label lblS = new Label(composite, SWT.NONE);
		lblS.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 11, SWT.NORMAL));
		lblS.setBounds(250, 10, 59, 14);
		lblS.setText("Second");
		

		

		
	    lblCl = new Label(composite, SWT.NONE);
		lblCl.setBounds(35, 30, 289, 42);
		lblCl.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		
		lblcl2 = formToolkit.createLabel(composite, "Clock", SWT.NONE);
		lblcl2.setBounds(35, 89, 152, 37);
		
		
		
		
		DateTime dateTime = new DateTime(composite, SWT.BORDER | SWT.TIME);
		dateTime.setBounds(216, 86, 105, 28);
		formToolkit.adapt(dateTime);
		formToolkit.paintBordersFor(dateTime);
		lblcl2.setText(JTex);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				
			
				
				
			}
		});
		btnNewButton.setBounds(41, 166, 177, 49);
		btnNewButton.setText("Normal");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
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
		
		
		setTime();
		
	}
}
