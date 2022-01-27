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

import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 


public class Main1 {

	protected Shell shell;
	private Text text;
	
	
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
		lblS.setBounds(250, 10, 59, 14);
		lblS.setText("Second");
		
		
		DateTime dateTime = new DateTime(composite, SWT.BORDER | SWT.TIME);
		dateTime.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 66, SWT.NORMAL));
		dateTime.setBounds(38, 30, 336, 96);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(87, 206, 320, 33);
		text.setText(FT);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				String Tm = st.setTime();
			
			
				
				
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

//		Settime st = new Settime();
//		st.setTime();
		
	}
	
	
}
