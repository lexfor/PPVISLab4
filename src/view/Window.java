package src.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import src.listners.ListenerLabel;
import src.listners.ListenerText;
import src.listners.ListenerTree;
import src.listners.StackCalculator;

public class Window {
    private Display display = new Display();
    private Shell shell = new Shell(display);

    public Window() {
        GridLayout layout = new GridLayout(7, true);
        shell.setLayout(layout);

        ListenerLabel output = new ListenerLabel(shell);

        ListenerText input = new ListenerText(shell);

        ListenerTree tree = new ListenerTree(shell);

        src.view.Numpad numpad = new src.view.Numpad(shell, SWT.BORDER);

        StackCalculator calculator = new StackCalculator();
    }

    public void run() {
        shell.open();
        while(!shell.isDisposed()) {
            if(!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
    }
}