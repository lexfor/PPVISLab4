package src.listners;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ListenerLabel implements src.listners.Listeners {

    private static ListenerLabel actionLabel;

    public static ListenerLabel getLabel() {
        return actionLabel;
    }

    private Label label;

    public ListenerLabel(Composite parent) {
        this.label = new Label(parent, SWT.BORDER);
        label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
        this.actionLabel = this;
    }

    @Override
    public void action() {
        String answer = Double.toString(src.listners.StackCalculator.getCalculator().getAnswer());
        label.setText(answer);

        label.getParent().layout();
    }

}