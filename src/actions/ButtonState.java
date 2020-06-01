package src.actions;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ButtonState implements src.actions.ControlState, src.actions.Actions {

    private String value;
    private Button button;

    public ButtonState(Composite parent, String value) {
        this.value = value;
        this.button = new Button(parent, SWT.PUSH);
        button.setText(value);
        button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        button.addListener(SWT.MouseDown, new Listener(){

            @Override
            public void handleEvent(Event e) {
                action();
            }
        });
    }

    @Override
    public void action() {
        switch(value) {
            case "<":
            {
                previousState();
            }
            break;
            case ">":
            {
                nextState();
            }
            break;
            default:
                break;
        }
    }

    @Override
    public void nextState() {
        src.actions.ActionText.getTextField().nextState();
        src.actions.ActionTree.getTree().nextState();
    }

    @Override
    public void previousState() {
        src.actions.ActionText.getTextField().previousState();
        src.actions.ActionTree.getTree().previousState();
    }

}