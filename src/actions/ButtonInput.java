package src.actions;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class ButtonInput implements src.actions.Actions {

    private Text inputField;
    private String value;
    private Button button;

    public ButtonInput(Text inputField, String value, Composite parent) {
        this.inputField = inputField;
        this.value = value;
        this.button = new Button(parent, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        button.setText(value);
        button.addListener(SWT.MouseDown, new Listener(){

            @Override
            public void handleEvent(Event e) {
                action();
            }
        });
    }

    public void DisposeButton() {
        button.dispose();
    }

    @Override
    public void action() {
        inputField.setText(inputField.getText() + value);
    }

}