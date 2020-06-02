package src.listners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ButtonEquals implements src.listners.Listeners {

    private String value;
    private Button button;

    private List<src.listners.Listeners> listeners = new ArrayList<>();

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
        if (!src.listners.ListenerText.getTextField().getText().getText().isEmpty()) {
            listeners.add(src.listners.StackCalculator.getCalculator());
            listeners.add(src.listners.ListenerLabel.getLabel());
            listeners.add(src.listners.ListenerText.getTextField());
            listeners.add(src.listners.ListenerTree.getTree());
            for (src.listners.Listeners listener : listeners) {
                listener.action();
            }
        }
        listeners.clear();
    }

}