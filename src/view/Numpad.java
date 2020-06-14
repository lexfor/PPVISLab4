package src.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import src.listners.ButtonAdd;
import src.listners.ButtonClear;
import src.listners.ButtonEquals;
import src.listners.ButtonInput;
import src.listners.ButtonInvert;
import src.listners.ListenerText;
import src.listners.ButtonState;

public class Numpad extends Composite {

    public Numpad(Composite parent, int style) {
        super(parent, style);
        Text inputTextField = ListenerText.getTextField().getText();
        this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));
        this.setLayout(new GridLayout(5, true));

        ButtonState undoButton = new ButtonState(this, "<");

        ButtonState redoButton = new ButtonState(this, ">");

        ButtonClear clearButton = new ButtonClear(inputTextField, "C", this);

        ButtonInput leftBracketButton = new ButtonInput(inputTextField, "(", this);

        ButtonInput rightBracketButton = new ButtonInput(inputTextField, ")", this);

        ButtonInput nineButton = new ButtonInput(inputTextField, "9", this);

        ButtonInput eightButton = new ButtonInput(inputTextField, "8", this);

        ButtonInput sevenButton = new ButtonInput(inputTextField, "7", this);

        ButtonInput plusButton = new ButtonInput(inputTextField, "+", this);

        ButtonInput minusButton = new ButtonInput(inputTextField, "-", this);

        ButtonInput sixButton = new ButtonInput(inputTextField, "6", this);

        ButtonInput fiveButton = new ButtonInput(inputTextField, "5", this);

        ButtonInput fourButton = new ButtonInput(inputTextField, "4", this);

        ButtonInput multiplyButton = new ButtonInput(inputTextField, "*", this);

        ButtonInput divisionButton = new ButtonInput(inputTextField, "/", this);

        ButtonInput oneButton = new ButtonInput(inputTextField, "1", this);

        ButtonInput twoButton = new ButtonInput(inputTextField, "2", this);

        ButtonInput threeButton = new ButtonInput(inputTextField, "3", this);

        ButtonInput moduloButton = new ButtonInput(inputTextField, "%", this);

        ButtonInvert invertButton = new ButtonInvert(inputTextField, "1/x", this);

        ButtonInput zeroButton = new ButtonInput(inputTextField, "0", this);

        ButtonInput comButton = new ButtonInput(inputTextField, ".", this);

        ButtonEquals resultButton = new ButtonEquals("=", this);

        ButtonAdd NewFunctionButton = new ButtonAdd("Trigonometric function", this, inputTextField);
    }

}