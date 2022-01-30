import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

import P1.From1;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Normal {

	protected Shell shell;
	private Text text;
	public int GMT ;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Normal window = new Normal();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblYourGmt = new Label(shell, SWT.NONE);
		lblYourGmt.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 44, SWT.NORMAL));
		lblYourGmt.setBounds(10, 76, 200, 84);
		lblYourGmt.setText("Your GMT");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(206, 68, 220, 77);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				GMT = Integer.parseInt(text.getText());
			
				fm2.close();
				
				
			}
		});
		btnNewButton.setBounds(20, 161, 406, 77);
		btnNewButton.setText("Summit Normal Setting");

	}
}
