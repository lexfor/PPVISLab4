package src.listners;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import src.view.Additional;

public class ButtonAdd implements src.listners.Listeners {

    private Text inputTextField;
    private Button button;
    private boolean isCollapsed = true;
    private Composite parent;
    private src.view.Additional additional;

    public ButtonAdd(String value, Composite parent, Text inputField) {
        this.inputTextField = inputField;
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
        this.additional = new src.view.Additional(parent, inputField);
    }

    @Override
    public void action() {
        if(isCollapsed) {
            additional.show();
            this.isCollapsed = false;
        } else {
            additional.hide();
            this.isCollapsed = true;
        }
    }

}