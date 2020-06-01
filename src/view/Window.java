package src.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import src.actions.ActionLabel;
import src.actions.ActionText;
import src.actions.ActionTree;
import src.actions.StackCalculator;

public class Window {
    private Display display = new Display();
    private Shell shell = new Shell(display);

    public Window() {
        GridLayout layout = new GridLayout(7, true);
        shell.setLayout(layout);

        ActionLabel answer = new ActionLabel(shell);

        ActionText input = new ActionText(shell);

        ActionTree tree = new ActionTree(shell);

        src.view.Numpad numpad = new src.view.Numpad(shell, SWT.BORDER);

        StackCalculator calculator = new StackCalculator();
    }

    public void startWindow() {
        shell.open();
        while(!shell.isDisposed()) {
            if(!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
    }
}