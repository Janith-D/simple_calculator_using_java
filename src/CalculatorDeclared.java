import javax.swing.*;
import java.awt.*;


public class CalculatorDeclared {
    JFrame frame = new JFrame();
    TextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[10];
    JButton addButton,subButton,multButton,divButton;
    JButton decButton,delButton,equButton,clrButton,negButton;
    JPanel panel;
    Font myFont = new Font("sansSerif Bold",Font.BOLD,30);

    double num1=0,num2=0,result=0;
    char operator;
}
