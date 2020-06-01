package src.actions;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import src.view.Additional;

public class ButtonAdd implements src.actions.Actions {

    private Text inputField;
    private Button button;
    private boolean isCollapsed = true;
    private Composite parent;
    private src.view.Additional additionalNumpad;

    public ButtonAdd(String value, Composite parent, Text inputField) {
        this.inputField = inputField;
        this.parent = parent;
        this.button = new Button(parent, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        button.setText(value);
        button.addListener(SWT.MouseDown, new Listener(){

            @Override
            public void handleEvent(Event e) {
                action();
            }
        });
        this.additionalNumpad = new src.view.Additional(parent, inputField);
    }

    @Override
    public void action() {
        if(isCollapsed) {
            additionalNumpad.show();
            this.isCollapsed = false;
        } else {
            additionalNumpad.hide();
            this.isCollapsed = true;
        }
    }

}