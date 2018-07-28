import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calc {

	protected Shell shell;
	private Text FirstNumber;
	private Text SecondNumber;
	private Button btnAdd;
	private Button btnSubtract;
	private Button btnMultiply;
	private Button btnDivide;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calc window = new Calc();
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
		shell.setText("Simple Calculator");
		
		FirstNumber = new Text(shell, SWT.BORDER);
		FirstNumber.setBounds(28, 43, 174, 26);
		
		SecondNumber = new Text(shell, SWT.BORDER);
		SecondNumber.setBounds(28, 106, 174, 26);
		
		Label lblNumber = new Label(shell, SWT.NONE);
		lblNumber.setBounds(28, 22, 70, 20);
		lblNumber.setText("Number 1");
		
		Label lblNumber_1 = new Label(shell, SWT.NONE);
		lblNumber_1.setBounds(28, 85, 70, 20);
		lblNumber_1.setText("Number 2");
		
		Label lblResult = new Label(shell, SWT.NONE);
		lblResult.setBounds(28, 170, 174, 43);
		lblResult.setText("Result");
		
		btnAdd = new Button(shell, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int n1,n2;
				try{
					n1 = Integer.parseInt(FirstNumber.getText());
				}
				catch(Exception exc){
					MessageDialog.openError(shell, "Error", "Bad First Number");
					return;
				}
				try{
					n2 = Integer.parseInt(SecondNumber.getText());
				}
				catch(Exception exc){
					MessageDialog.openError(shell, "Error", "Bad Second Number");
					return;
				}
				lblResult.setText("The answer is :" + (n1+n2));
			}
		});
		btnAdd.setToolTipText("Add");
		btnAdd.setBounds(274, 22, 90, 30);
		btnAdd.setText("Add");
		
		btnSubtract = new Button(shell, SWT.NONE);
		btnSubtract.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int n1,n2;
				try{
					n1 = Integer.parseInt(FirstNumber.getText());
				}
				catch(Exception exc){
					MessageDialog.openError(shell, "Error", "Bad First Number");
					return;
				}
				try{
					n2 = Integer.parseInt(SecondNumber.getText());
				}
				catch(Exception exc){
					MessageDialog.openError(shell, "Error", "Bad Second Number");
					return;
				}
				lblResult.setText("The answer is :" + (n1 - n2));
			}
		});
		btnSubtract.setToolTipText("Subtract");
		btnSubtract.setBounds(274, 75, 90, 30);
		btnSubtract.setText("Subtract");
		
		btnMultiply = new Button(shell, SWT.NONE);
		btnMultiply.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int n1,n2;
				try{
					n1 = Integer.parseInt(FirstNumber.getText());
				}
				catch(Exception exc){
					MessageDialog.openError(shell, "Error", "Bad First Number");
					return;
				}
				try{
					n2 = Integer.parseInt(SecondNumber.getText());
				}
				catch(Exception exc){
					MessageDialog.openError(shell, "Error", "Bad Second Number");
					return;
				}
				lblResult.setText("The answer is :" + (n1 * n2));
			}
		});
		btnMultiply.setToolTipText("Multiply");
		btnMultiply.setBounds(274, 129, 90, 30);
		btnMultiply.setText("Multiply");
		
		btnDivide = new Button(shell, SWT.NONE);
		btnDivide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int n1,n2;
				try{
					n1 = Integer.parseInt(FirstNumber.getText());
				}
				catch(Exception exc){
					MessageDialog.openError(shell, "Error", "Bad First Number");
					return;
				}
				try{
					n2 = Integer.parseInt(SecondNumber.getText());
				}
				catch(Exception exc){
					MessageDialog.openError(shell, "Error", "Bad Second Number");
					return;
				}
				lblResult.setText("The answer is :" + (n1 / n2));
			}
		});
		btnDivide.setToolTipText("Divide");
		btnDivide.setBounds(274, 183, 90, 30);
		btnDivide.setText("Divide");

	}
}
