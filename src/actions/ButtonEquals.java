package src.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ButtonEquals implements src.actions.Actions {

    private String value;
    private Button button;

    private List<src.actions.Actions> listeners = new ArrayList<>();

    public ButtonEquals(String value, Composite parent) {
        this.value = value;
        this.button = new Button(parent, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        button.setText(value);
        button.addListener(SWT.MouseDown, new Listener() {

            @Override
            public void handleEvent(Event e) {
                action();
            }
        });
    }

    @Override
    public void action() {
        if (!src.actions.ActionText.getTextField().getText().getText().isEmpty()) {
            listeners.add(src.actions.StackCalculator.getCalculator());
            listeners.add(src.actions.ActionLabel.getLabel());
            listeners.add(src.actions.ActionText.getTextField());
            listeners.add(src.actions.ActionTree.getTree());
            for (src.actions.Actions listener : listeners) {
                listener.action();
            }
        }
        listeners.clear();
    }

}