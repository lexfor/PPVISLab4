package src.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import src.actions.ButtonInput;

public class Additional {

    private Text inputField;
    private Composite parent;
    private List<ButtonInput> buttons = new ArrayList<>();
    private Point prevSize;

    public Additional(Composite parent, Text inputField) {
        this.parent = parent;
        this.inputField = inputField;
    }

    public void show() {
        buttons.add(new ButtonInput(inputField, "sin", parent));

        buttons.add(new ButtonInput(inputField, "cos", parent));

        buttons.add(new ButtonInput(inputField, "tan", parent));

        buttons.add(new ButtonInput(inputField, "cot", parent));
        this.prevSize = parent.getSize();
        parent.pack();
        parent.setSize(prevSize);
    }

    public void hide() {
        for(int i = 0; i < buttons.size(); i++) {
            buttons.get(i).DisposeButton();
        }
        buttons.clear();
        parent.pack();
        parent.setSize(prevSize);
    }
}