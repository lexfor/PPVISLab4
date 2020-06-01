package src.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import src.actions.ButtonAdd;
import src.actions.ButtonClear;
import src.actions.ButtonEquals;
import src.actions.ButtonInput;
import src.actions.ButtonInvert;
import src.actions.ActionText;
import src.actions.ButtonState;

public class Numpad extends Composite {

    public Numpad(Composite parent, int style) {
        super(parent, style);
        Text inputField = ActionText.getTextField().getText();
        this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));
        this.setLayout(new GridLayout(5, true));

        ButtonState undoButton = new ButtonState(this, "<");

        ButtonState redoButton = new ButtonState(this, ">");

        ButtonClear clearButton = new ButtonClear(inputField, "C", this);

        ButtonInput leftBracketButton = new ButtonInput(inputField, "(", this);

        ButtonInput rightBracketButton = new ButtonInput(inputField, ")", this);

        ButtonInput nineButton = new ButtonInput(inputField, "9", this);

        ButtonInput eightButton = new ButtonInput(inputField, "8", this);

        ButtonInput sevenButton = new ButtonInput(inputField, "7", this);

        ButtonInput plusButton = new ButtonInput(inputField, "+", this);

        ButtonInput minusButton = new ButtonInput(inputField, "-", this);

        ButtonInput sixButton = new ButtonInput(inputField, "6", this);

        ButtonInput fiveButton = new ButtonInput(inputField, "5", this);

        ButtonInput fourButton = new ButtonInput(inputField, "4", this);

        ButtonInput multiplyButton = new ButtonInput(inputField, "*", this);

        ButtonInput divisionButton = new ButtonInput(inputField, "/", this);

        ButtonInput oneButton = new ButtonInput(inputField, "1", this);

        ButtonInput twoButton = new ButtonInput(inputField, "2", this);

        ButtonInput threeButton = new ButtonInput(inputField, "3", this);

        ButtonInput moduloButton = new ButtonInput(inputField, "%", this);

        ButtonInvert invertButton = new ButtonInvert(inputField, "1/x", this);

        ButtonInput zeroButton = new ButtonInput(inputField, "0", this);

        ButtonInput commButton = new ButtonInput(inputField, ".", this);

        ButtonEquals equalsButton = new ButtonEquals("=", this);

        ButtonAdd additionalButton = new ButtonAdd("Additional", this, inputField);
    }

}