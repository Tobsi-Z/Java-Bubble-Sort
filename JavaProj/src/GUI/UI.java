/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Main.RandomNumber;
import Main.Sorter;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;


/**
 *
 * @author Tobsi
 */
public class UI implements ActionListener
{
    // Variables
    public final String NameAndVersion = "BubbleSorter V1.0";
    public final String Developer = "by: Tobsi";
    
    private int TestCount = 0;
    
    private JFrame frame;
    private JPanel BGpanel;
    private JLabel label;
    
    
    private JRadioButton LeftTRight;
    private JLabel LeftText;
    
    private JRadioButton RightTLeft;
    private JLabel RightText;
    
    public boolean LRBool = true; // hvis den bliver sorteret fra venstre til højre så er den = true
    
    
    private final Font StandardTextFont = new Font("Segoe UI", Font.PLAIN, 12); // font, Italic bold or normal, font size.
    
    private final Color bgColor = new Color(46,48,50); // takes a RGB value (Red Green Blue). 51, 51, 51
    
    // UI Title bar ------------------------------------------------------------
    private JPanel titlePanel;
    private JLabel titleLable;
    
    private final Color TitleColor = new Color(0,102,102);
    
    private final Font TitleFont = new Font("Segoe UI", Font.BOLD, 24);
    // UI Title bar END --------------------------------------------------------
    
    // Bullet Switches ---------------------------------------------------------
    
    private final Color BulletBGColor = new Color(42, 44, 46); // Background color Same as BG, but 5% darker (CMYK)
    private final Color BulletFGColor = new Color(255, 255, 255); // Foreground color
    
    private final Font BulletFont = new Font("Segoe UI", Font.PLAIN, 12); // Font
    
    private final String LeftTRightString = "Large to small";
    private final String RightTLeftString = "Small to large";
    
    private JLabel RadioBG;
    
    // Bullet Switches END -----------------------------------------------------
    
    // Array Lable -------------------------------------------------------------
    
    public JTextArea ArrLabel;
    public JTextArea ArrLabelSorted;
    
    public JScrollPane ScrollOne;
    public JScrollPane ScrollTwo;
    
    private final Color ArrColor = new Color(42, 44, 46);
    private final Color ArrOUTColor = new Color(50,52,54);
    
    private final Font OutputFont = new Font("Monospaced", Font.PLAIN, 12);
    
    // Array Lable END ---------------------------------------------------------
    
    // Numb Input --------------------------------------------------------------
    
    private JSpinner NumbInput;
    private JSpinner NumbInputTwo;
    private JLabel NumbInputLabel;
    private JLabel NumbInputTop;
    private JLabel NumbInputBottom;
    private int RandomRangeNumb = 199;
    private int ArrayNumber = 130;
    
    // Numb Input END ----------------------------------------------------------
    
    // Setup Text Method -------------------------------------------------------
    
    private RandomNumber RNG = new RandomNumber();
    private Sorter sorter = new Sorter();    
    private String TempString = "";
    
    // Setup Text Method -------------------------------------------------------
    
    // Var ---------------------------------------------------------------------
    
    private JLabel minLable;
    private JLabel maxLable;
    private JLabel middelLable;
    private JLabel spreedLable;
    
    private JLabel VarBGLabel;
    
    private final Color VarLableColor = new Color(42, 44, 46);
    private final Color VarLableColor2 = new Color(36, 38, 40);// Background color Same as BG, but 5% darker (CMYK)
    //private final Color BulletFGColor = new Color(255, 255, 255); // Foreground color
    
    private final Font VarLableFont = new Font("Segoe UI", Font.PLAIN, 12);
    
    // Var END -----------------------------------------------------------------
    
    // Konstructor
    public UI()
    {
        frame = new JFrame(); // gets JFrame
        //frame.setSize(480, 360);
        frame.setSize(480, 634);
        //UIManager.setLookAndFeel(new );
        
        BGpanel = new JPanel(); // gets JPanel
        
        BGpanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 320, 480)); // panel længde fra top, panel længde fra venstre, y-længde af panel, x-længde af panel
        BGpanel.setBackground(bgColor);
        
        //BGpanel.setLayout(new GridLayout(0, 1));
        
        frame.add(BGpanel); // , BorderLayout.CENTER
        
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        setComponents(BGpanel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(NameAndVersion);
        //frame.pack();
        frame.setVisible(true);
        //frame.getContentPane().setLayout(new FlowLayout());
        
    }
    
    // Methods

    public void setStringToLable(String StringToAdd)
    {
        label.setText(StringToAdd);
    }
    
    private void setComponents (JPanel panel){
        BGpanel.setLayout(null); // Sets the layout to null. Dont know how to use it. But you can do something with Grids.
        
        BGpanel.setBackground(bgColor);
        
        // Lable 1 -------------------------------------------------------------
        label = new JLabel("Number of clicks: 0"); // Test lable
        label.setForeground(Color.WHITE);
        label.setFont(StandardTextFont);
        label.setBounds(180, 60, 260, 35); // (10, 95, 260, 35)
        
        //label.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3, true)); // DEBUGGING
        
        panel.add(label); // adds the label to the panel
        // Lable 1 end ---------------------------------------------------------
        
        
        // Button 1 ------------------------------------------------------------
        JButton button = new JButton("New Sort"); // Test BTN
        button.addActionListener(this); // adds a listener to the button
        
        button.setBounds(10, 60, 160, 35);
        
        panel.add(button); // adds the button to the panel
        // Button 1 end --------------------------------------------------------
        
        
        // UI Title bar --------------------------------------------------------
        
        //NOTE: hvad der bliver tilføjet først er det der kommer øverst.
        
        // lable 
        
        titleLable = new JLabel(NameAndVersion + "                     " + Developer); // måske fjern et enkelt mellemrum
        
        titleLable.setForeground(Color.WHITE);
        titleLable.setFont(TitleFont);
        titleLable.setBounds(2, -2, 480, 50);
        
        panel.add(titleLable);
        
        // panel
        titlePanel = new JPanel();
        
        titlePanel.setBounds(0, 0, 480, 50);
        titlePanel.setBackground(TitleColor);
        
        panel.add(titlePanel);
        // UI Title bar end ----------------------------------------------------
        
        // test radio button ---------------------------------------------------
        
        LeftText = new JLabel();
        RightText = new JLabel();
        LeftTRight = new JRadioButton("Left");
        RightTLeft = new JRadioButton("Right");
        RadioBG = new JLabel("");
        
        LeftTRight.setSelected(true);
        RightTLeft.setSelected(false);
        
        LeftTRight.addActionListener(this);
        RightTLeft.addActionListener(this);
        
        // Sets the colors of the radio buttons, but i call them Bullet (Bulleton Board)
        RightTLeft.setBackground(BulletBGColor);
        RightTLeft.setForeground(BulletFGColor);
        RightTLeft.setFont(BulletFont);
        
        LeftTRight.setBackground(BulletBGColor);
        LeftTRight.setForeground(BulletFGColor);
        LeftTRight.setFont(BulletFont);
        
        RadioBG.setBackground(BulletBGColor);
        RadioBG.setForeground(BulletFGColor);
        RadioBG.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        RadioBG.setOpaque(true);
        // Set Colors END
        
        /*60.       den er 20px høj.*/
        RadioBG.setBounds(10, 130, 122, 60);
        LeftTRight.setBounds(11, 132, 118, 20);
        LeftText.setBounds(15, 132, 118, 20);
        RightTLeft.setBounds(11, 164, 118, 20);
        RightText.setBounds(15, 164, 118, 20);
        
        LeftTRight.setText(LeftTRightString);
        RightTLeft.setText(RightTLeftString);
        
        panel.add(LeftTRight);
        panel.add(RightTLeft);
        panel.add(RadioBG);
        
        // test radio button END -----------------------------------------------
        
        // Array Lable ---------------------------------------------------------
        
        ArrLabel = new JTextArea(100, 200);
        ArrLabelSorted = new JTextArea(100, 200);
        
        //ArrLabel.setBounds(10, 180, 217, 120); // max width er lig med 445 (som er 465 med den padding jeg har sat som er på 10 px)
        //ArrLabelSorted.setBounds(237,180,217,120);
        
        ArrLabel.setBounds(10, 200, 444, 120); // der er et mellemrum på præsis 10 px på hvær side.
        ArrLabelSorted.setBounds(10, 340, 444, 120);
        
        ArrLabel.setBackground(BulletBGColor);
        ArrLabelSorted.setBackground(BulletBGColor);
        
        ArrLabel.setForeground(Color.WHITE);
        ArrLabelSorted.setForeground(Color.WHITE);
        
        ArrLabel.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        ArrLabelSorted.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        
        ArrLabel.setFont(OutputFont);
        ArrLabelSorted.setFont(OutputFont);
        
        ArrLabel.setOpaque(true);
        ArrLabelSorted.setOpaque(true);
        
        ArrLabel.setText("Hello. Press \"New Sort\" to get a random sorted array.");
        ArrLabelSorted.setText("This is where the sorted array will be displayed.");
        
        // Scroll stuff        
        ScrollOne = new JScrollPane(ArrLabel);
        ScrollTwo = new JScrollPane(ArrLabelSorted);
        
        ScrollOne.setBounds(ArrLabel.getBounds());
        ScrollTwo.setBounds(ArrLabelSorted.getBounds());
        
        ScrollOne.setViewportView(ArrLabel);
        ScrollTwo.setViewportView(ArrLabelSorted);
        
        ScrollOne.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        ScrollTwo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        ScrollOne.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        ScrollTwo.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        // And back again
        
        panel.add(ScrollOne);
        panel.add(ScrollTwo);
        //panel.add(ArrLabel);
        //panel.add(ArrLabelSorted);
        
        //panel.setVisible(true);
        
        
        
        // Array Lable END -----------------------------------------------------
        
        // Number Input --------------------------------------------------------
        
        /*
        TODO: 
            Lav en som "styre" antallet af tal i arrayen. [ ]
            Lav et nyt Lable som står for at "binde det hele sammen" (baggrunden og kanten). [ ]
            Lav en ny JSpinner som står for antallet af Array "Kasser". [ ]
        */
        NumbInput = new JSpinner();
        NumbInputTwo = new JSpinner();
        
        NumbInputLabel = new JLabel();
        NumbInputTop = new JLabel("Max number:");
        NumbInputBottom = new JLabel("Amount of numbers to sort:");
        
        NumbInput.setValue(RandomRangeNumb);
        NumbInputTwo.setValue(ArrayNumber);
        
        NumbInput.setBounds(359, 135, 90, 20);
        NumbInputTwo.setBounds(359, 165, 90, 20);
        NumbInputLabel.setBounds(200, 130, 254, 60);
        NumbInputTop.setBounds(205, 135, 100, 20);
        NumbInputBottom.setBounds(205, 165, 150, 20);
        
        NumbInputLabel.setBackground(BulletBGColor);
        NumbInputLabel.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        NumbInputLabel.setOpaque(true);
        
        NumbInputTop.setBackground(BulletBGColor);
        NumbInputTop.setForeground(Color.WHITE);
        NumbInputTop.setFont(StandardTextFont);
        
        NumbInputBottom.setBackground(BulletBGColor);
        NumbInputBottom.setForeground(Color.WHITE);
        NumbInputBottom.setFont(StandardTextFont);
        
        panel.add(NumbInput);
        panel.add(NumbInputTwo);
        panel.add(NumbInputTop);
        panel.add(NumbInputBottom);
        panel.add(NumbInputLabel);
        
        // Number Input END ----------------------------------------------------
        
        // Stats/info ----------------------------------------------------------
        
        /* TODO:
        
            vis data som min, max, middel værdi [ ] // afstand = (MaxStørelse - (padding * antalKomponenter - 1)) / antalKomponenter = (444 px - (5 px * 1)) / 2 = 219,5 px i x-aksen. (runder ned til 219 px så mellemrummet skal være på 6 px).
             [ ]
        
        */
        
        minLable = new JLabel();
        maxLable = new JLabel();
        middelLable = new JLabel();
        spreedLable = new JLabel();
        
        VarBGLabel = new JLabel();
        
        VarBGLabel.setBackground(BulletBGColor);
        VarBGLabel.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        VarBGLabel.setOpaque(true);
        
        minLable.setBounds(16, 483, 213, 20); // 7 px
        minLable.setBackground(VarLableColor2);
        minLable.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        minLable.setOpaque(true);
        minLable.setForeground(Color.white);
        minLable.setFont(VarLableFont);
        
        maxLable.setBounds(235, 483, 213, 20); // 7 px
        maxLable.setBackground(VarLableColor2);
        maxLable.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        maxLable.setOpaque(true);
        maxLable.setForeground(Color.white);
        maxLable.setFont(VarLableFont);
        
        middelLable.setBounds(16, 509, 213, 20); // 7 px
        middelLable.setBackground(VarLableColor2);
        middelLable.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        middelLable.setOpaque(true);
        middelLable.setForeground(Color.white);
        middelLable.setFont(VarLableFont);
        
        spreedLable.setBounds(235, 509, 213, 20); // 7 px
        spreedLable.setBackground(VarLableColor2);
        spreedLable.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        spreedLable.setOpaque(true);
        spreedLable.setForeground(Color.white);
        spreedLable.setFont(VarLableFont);
        
        // BG STUFF ------------------------------------------------------------
        VarBGLabel.setBackground(BulletBGColor);
        VarBGLabel.setBorder(BorderFactory.createLineBorder(ArrOUTColor, 1, true));
        VarBGLabel.setOpaque(true);
        
        VarBGLabel.setBounds(10, 477, 444, 100);
        // BG STUFF END---------------------------------------------------------
        
        panel.add(minLable);
        panel.add(maxLable);
        panel.add(middelLable);
        panel.add(spreedLable);
        panel.add(VarBGLabel);
        
        // Stats/info END ------------------------------------------------------
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        /*
        System.err.println(e);
        System.err.println(e.getActionCommand());*/ // DEBUGGING
        
        if (e.getActionCommand() == "New Sort"){
            TestCount++;
            //label.setText("Number of clicks: " + TestCount);
            label.setText("Press \"New Sort\" to generate a new array.");
            
            SetupTextForNewSort();
        }
        
        if (e.getActionCommand() == LeftTRightString){ // Checks for the radioButton ( Event-Listeners heder actionsPerformed i java)
            System.out.println("BTN 1"); // DEBUGGING
            if (LRBool == true) // if LRBool == true then we know which btn is "active"
            { // LRBool == true
                // sets the active buttons so we dont have 2 active at once [active] [disabled]
                RightTLeft.setSelected(LRBool); 
                LeftTRight.setSelected(!LRBool);
                LRBool = false;
            }
            
            else{ // LRBool == false
                RightTLeft.setSelected(LRBool);
                LeftTRight.setSelected(!LRBool);
                LRBool = true;
            }
            
        }
        
        if (e.getActionCommand() == RightTLeftString){ // the same, but for radioButton2
            System.out.println("BTN 2");
            if (LRBool == true){
                RightTLeft.setSelected(LRBool);
                LeftTRight.setSelected(!LRBool);
                LRBool = false;
            }
            else{
                RightTLeft.setSelected(LRBool);
                LeftTRight.setSelected(!LRBool);
                LRBool = true;
            }
        }
        
    }

    private void SetupTextForNewSort()
    {
        
        int TempInteger;
        int TempIntegerArrayAmount;
        
        try // tror ikke jeg har brug for denne del (try catch), men jeg har ikke testede det 100% endnu (om man kan indsætte tegn og det).
        {
            TempInteger = (int) NumbInput.getValue(); // gets the current value
            TempIntegerArrayAmount = (int) NumbInputTwo.getValue();
        } catch (Exception e)
        {
            System.out.println("ERROR: NOT A NUMBER!");
            
            TempInteger = RandomRangeNumb;
            TempIntegerArrayAmount = ArrayNumber;
        }
        
        //System.out.println(TempInteger);
        //System.out.println("HELLO"); // DEBUGGING
        // System.out.println("BOOL: " + LRBool); // DEBUGGING
        
        TempString = "";
        
        int[] TempTestArr = RNG.GetRandomUneven(TempIntegerArrayAmount, TempInteger); // TempArray, Holds the unsorted
        
        System.out.println("Unsorted:");
        TempString = RNG.PrintFormatToString(TempTestArr); // Converts the Array to readable string
        
        ArrLabel.setText(TempString); // Sets the text of ArrLable to the readable Array String
        
        if (LRBool == true) // checks the way the user wants the array to be sorted
        {
            TempTestArr = sorter.BubbleBackTFront(TempTestArr);
        }
        else {
            TempTestArr = sorter.BubbleFrontTBack(TempTestArr);
        }
        
        System.out.println("Sorted:");
        TempString = RNG.PrintFormatToString(TempTestArr);
        
        ArrLabelSorted.setText(TempString);     
        
        // Data Var
        
        double middelStr = sorter.MiddelVar(TempTestArr);
        
        if (LRBool)
        {
            minLable.setText("Minimum value: " + String.valueOf(TempTestArr[TempIntegerArrayAmount-1]));
            maxLable.setText("Maximum value: " + String.valueOf(TempTestArr[0]));
        }
        else {
            minLable.setText("Minimum value: " + String.valueOf(TempTestArr[0]));
            maxLable.setText("Maximum value: " + String.valueOf(TempTestArr[TempIntegerArrayAmount-1]));
        }
        middelLable.setText("Middle value: " + middelStr);
        spreedLable.setText("Spread: " + String.valueOf(sorter.Spreed(middelStr, TempTestArr)));
        
    }
}
