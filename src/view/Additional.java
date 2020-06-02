package src.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import src.listners.ButtonInput;

public class Additional {

    private Text inputFieldText;
    private Composite parent;
    private List<ButtonInput> Inputbuttons = new ArrayList<>();
    private Point prevSize;

    public Additional(Composite parent, Text inputField) {
        this.parent = parent;
        this.inputFieldText = inputField;
    }

    public void show() {
        Inputbuttons.add(new ButtonInput(inputFieldText, "sin", parent));

        Inputbuttons.add(new ButtonInput(inputFieldText, "cos", parent));

        Inputbuttons.add(new ButtonInput(inputFieldText, "tg", parent));

        Inputbuttons.add(new ButtonInput(inputFieldText, "ctg", parent));
        this.prevSize = parent.getSize();
        parent.pack();
        parent.setSize(prevSize);
    }

    public void hide() {
        for(int i = 0; i < Inputbuttons.size(); i++) {
            Inputbuttons.get(i).DisposeButton();
        }
        Inputbuttons.clear();
        parent.pack();
        parent.setSize(prevSize);
    }
}