//DATE: 01/19/23
//NAME: Ravishan Thanarajah


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.*;
import java.util.*;
import java.text.*;
import sun.audio.*;
import java.io.*;
import java.io.FileInputStream.*;

public class ThanarajahRaviSneakyCards extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1, card2, card3, card4, card5;
    CardLayout cdLayout = new CardLayout ();

    //Team 1
    JLabel picture;
    JLabel count;
    JLabel toString;
    JLabel toString2;
    //Team 2
    JLabel picture2;
    JLabel count10;
    JLabel toString10;
    JLabel toString20;
    int i = 0;
    //Deck Pile (Box)
    Deck pile = new Deck ();
    Deck2 pile2 = new Deck2 ();
    int num = 0;
    int num2 = 0;
    //Extra Feature: Music
    AudioClip soundFile;
    //Formatting
    Color backgroundColour = new Color (0, 0, 0);
    Color progress = new Color (255, 255, 255);
    Color progress2 = new Color (255, 166, 73);
    Color buttonColour = new Color (56, 182, 255);
    Color buttonColour1 = new Color (253, 101, 194);
    Color buttonColour2 = new Color (255, 22, 22);
    Color buttonColour3 = new Color (253, 217, 73);
    Color buttonColour4 = new Color (126, 217, 87);
    Color buttonColour5 = new Color (140, 82, 255);
    Color buttonText = Color.white;
    Color titleColour = Color.white;
    Font titleFont = new Font ("Arial Black", Font.PLAIN, 12);
    Font buttonFont = new Font ("Arial Black", Font.PLAIN, 10);


    public void init ()
    {
        //Init
        Panel p = new Panel ();
        p_card = new Panel ();
        p_card.setLayout (cdLayout);
        //Music
        soundFile = getAudioClip (getDocumentBase (), "Trust.snd");
        soundFile.loop ();
        //Screens
        screen1 ();
        screen2 ();
        screen3 ();
        screen4 ();
        screen5 ();
        resize (300, 580);
        setLayout (new BorderLayout ());
        add ("Center", p_card);
    }


    public void screen1 ()
    {
        //Opening Screen
        card1 = new Panel ();
        card1.setBackground (Color.black);
        JLabel pic1 = new JLabel (createImageIcon ("pic.png"));
        //Buttons
        //Extra Feature: Unicode
        JButton fArrow = new JButton ("\u00Ae");
        //Next
        JButton next0 = new JButton ("               GO               ");
        //Extra Feature: Unicode
        JButton bArrow = new JButton ("\u00Ae");
        //Button Formatting
        //Design1
        bArrow.setFont (titleFont);
        bArrow.setBackground (Color.black);
        bArrow.setForeground (Color.white);
        //Go
        next0.setFont (titleFont);
        next0.setBackground (backgroundColour);
        next0.setForeground (buttonText);
        next0.setActionCommand ("s2");
        next0.addActionListener (this);
        //Design2
        fArrow.setFont (titleFont);
        fArrow.setBackground (Color.black);
        fArrow.setForeground (Color.white);
        //Add Buttons
        card1.add (pic1);
        card1.add (bArrow);
        card1.add (next0);
        card1.add (fArrow);
        p_card.add ("1", card1);
    }


    public void screen2 ()
    {
        //Instructions
        card2 = new Panel ();
        card2.setBackground (Color.black);
        //Screen Images
        JLabel title = new JLabel (createImageIcon ("instructions1.png"));
        JLabel title2 = new JLabel (createImageIcon ("instructions2.png"));
        JLabel title3 = new JLabel (createImageIcon ("instructions3.png"));
        //Buttons
        JButton next = new JButton ("Next");
        next.setFont (buttonFont);
        next.setBackground (buttonColour);
        next.setForeground (buttonText);
        next.setActionCommand ("s3");
        next.addActionListener (this);
        //Add Buttons
        card2.add (title);
        card2.add (title2);
        card2.add (title3);
        card2.add (next);
        p_card.add ("2", card2);
    }


    public void screen3 ()
    {
        //Game Screen
        card3 = new Panel ();
        card3.setBackground (Color.black);
        JLabel title4 = new JLabel (createImageIcon ("team1.png"));
        //Next Button
        JButton next2 = new JButton ("Team 2");
        next2.setFont (buttonFont);
        next2.setBackground (buttonColour5);
        next2.setForeground (buttonText);
        next2.setActionCommand ("s4");
        next2.addActionListener (this);
        //Reset Button
        JButton reset = new JButton ("Reset");
        reset.setFont (buttonFont);
        reset.setBackground (buttonColour4);
        reset.setForeground (buttonText);
        reset.addActionListener (this);
        reset.setActionCommand ("reset");
        //Push Button
        JButton push = new JButton ("Push");
        push.setFont (buttonFont);
        push.setBackground (buttonColour1);
        push.setForeground (buttonText);
        push.addActionListener (this);
        push.setActionCommand ("push");
        //Pop Button
        JButton pop = new JButton ("Pop");
        pop.setFont (buttonFont);
        pop.setBackground (buttonColour2);
        pop.setForeground (buttonText);
        pop.addActionListener (this);
        pop.setActionCommand ("pop");
        //Shuffle Button
        JButton shuffle = new JButton ("Shuffle");
        shuffle.setFont (buttonFont);
        shuffle.setBackground (buttonColour3);
        shuffle.setForeground (buttonText);
        shuffle.addActionListener (this);
        shuffle.setActionCommand ("shuffle");
        //Win Button
        JButton done = new JButton ("Done");
        done.addActionListener (this);
        done.setActionCommand ("s5");
        done.setBackground (buttonColour);
        done.setForeground (buttonText);
        done.setFont (buttonFont);
        picture = new JLabel (createImageIcon ("backcard.png"));
        card3.add (title4);
        //Information 1
        count = new JLabel ("");
        count.setForeground (Color.white);
        toString = new JLabel ("");
        toString.setForeground (Color.white);
        toString2 = new JLabel ("");
        toString2.setForeground (Color.white);
        toString.setPreferredSize (new Dimension (250, 20));
        //Panel 2
        Panel p2 = new Panel (new GridLayout (1, 3));
        p2.add (push);
        p2.add (pop);
        p2.add (shuffle);
        card3.add (p2);
        //Panel 3
        Panel p3 = new Panel (new GridLayout (1, 3));
        card3.add (picture);
        p3.add (reset);
        p3.add (next2);
        p3.add (done);
        card3.add (p3);
        //Panel 4
        Panel p4 = new Panel (new GridLayout (3, 1));
        p4.add (count);
        p4.add (toString);
        p4.add (toString2);
        card3.add (p4);
        p_card.add ("3", card3);
    }


    public void screen4 ()
    {
        //Game Screen 2
        card4 = new Panel ();
        card4.setBackground (Color.black);
        JLabel team2 = new JLabel (createImageIcon ("team2.png"));
        picture2 = new JLabel (createImageIcon ("backcard.png"));
        //Previous Button
        JButton prev = new JButton ("Team 1");
        prev.setFont (buttonFont);
        prev.setBackground (buttonColour3);
        prev.setForeground (buttonText);
        prev.setActionCommand ("s3");
        prev.addActionListener (this);
        //Reset Button
        JButton reset2 = new JButton ("Reset");
        reset2.setFont (buttonFont);
        reset2.setBackground (buttonColour);
        reset2.setForeground (buttonText);
        reset2.addActionListener (this);
        reset2.setActionCommand ("reset2");
        //Push Button
        JButton push2 = new JButton ("Push");
        push2.setFont (buttonFont);
        push2.setBackground (buttonColour5);
        push2.setForeground (buttonText);
        push2.addActionListener (this);
        push2.setActionCommand ("push2");
        //Pop Button
        JButton pop2 = new JButton ("Pop");
        pop2.setFont (buttonFont);
        pop2.setBackground (buttonColour4);
        pop2.setForeground (buttonText);
        pop2.addActionListener (this);
        pop2.setActionCommand ("pop2");
        //Shuffle Button
        JButton shuffle2 = new JButton ("Shuffle");
        shuffle2.setFont (buttonFont);
        shuffle2.setBackground (buttonColour2);
        shuffle2.setForeground (buttonText);
        shuffle2.addActionListener (this);
        shuffle2.setActionCommand ("shuffle2");
        //Win Button
        JButton done2 = new JButton ("Done");
        done2.addActionListener (this);
        done2.setActionCommand ("s5");
        done2.setBackground (buttonColour1);
        done2.setForeground (buttonText);
        done2.setFont (buttonFont);
        //Text Info
        count10 = new JLabel ("");
        count10.setForeground (Color.white);
        toString10 = new JLabel ("");
        toString10.setForeground (Color.white);
        toString20 = new JLabel ("");
        toString20.setForeground (Color.white);
        toString10.setPreferredSize (new Dimension (250, 20));
        //Formating
        card4.add (team2);
        Panel p5 = new Panel (new GridLayout (1, 3));
        p5.add (push2);
        p5.add (pop2);
        p5.add (shuffle2);
        card4.add (p5);
        card4.add (picture2);
        Panel p6 = new Panel (new GridLayout (1, 3));
        p6.add (prev);
        p6.add (reset2);
        p6.add (done2);
        card4.add (p6);
        Panel p7 = new Panel (new GridLayout (3, 1));
        p7.add (count10);
        p7.add (toString10);
        p7.add (toString20);
        card4.add (p7);
        p_card.add ("4", card4);
    }


    public void screen5 ()
    {
        //Win
        card5 = new Panel ();
        card5.setBackground (Color.black);
        JLabel win = new JLabel (createImageIcon ("win1.png"));
        JLabel win1 = new JLabel (createImageIcon ("crownfinal.gif"));
        JLabel win2 = new JLabel (createImageIcon ("congrats.png"));
        //Add Images/Buttons
        card5.add (win);
        card5.add (win1);
        card5.add (win2);
        p_card.add ("5", card5);
    }


    public void drawblank ()
    {
        //Team 1
        picture.setIcon (createImageIcon ("backcard.png"));
        count.setText ("");
        toString.setText ("");
        toString2.setText ("");
    }


    public void drawblank2 ()
    {

        //Team 2
        picture2.setIcon (createImageIcon ("backcard.png"));
        count10.setText ("");
        toString10.setText ("");
        toString20.setText ("");
    }


    public void showCard (Card d)
    {
        //Team 1
        picture.setIcon (createImageIcon (d.getPicName () + ".png"));
        count.setText ("                         Completed: " + num + "/40");
        count.setFont (buttonFont);
        toString.setText (d.toString ());
        toString.setFont (buttonFont);
        toString2.setText (d.toString2 ());
        toString2.setFont (buttonFont);
    }


    public void showCard2 (Card2 w)
    {

        //Team 2
        picture2.setIcon (createImageIcon (w.getPicName2 () + ".png"));
        count10.setText ("                         Completed: " + num2 + "/40");
        count10.setFont (buttonFont);
        toString10.setText (w.toString10 ());
        toString10.setFont (buttonFont);
        toString20.setText (w.toString20 ());
        toString20.setFont (buttonFont);
    }


    public void actionPerformed (ActionEvent e)
    {
        i++;
        //moves between the screens
        if (e.getActionCommand ().equals ("s1"))
            cdLayout.show (p_card, "1");
        else if (e.getActionCommand ().equals ("s2"))
            cdLayout.show (p_card, "2");
        else if (e.getActionCommand ().equals ("s3"))
            cdLayout.show (p_card, "3");
        else if (e.getActionCommand ().equals ("s4"))
            cdLayout.show (p_card, "4");
        else if (e.getActionCommand ().equals ("s5"))
            cdLayout.show (p_card, "5");

        else if (e.getActionCommand ().equals ("reset"))
        { //set num to 0
            num = 0;
            //clear box
            pile.clear ();
            //call drawblank
            drawblank ();
        }

        else if (e.getActionCommand ().equals ("reset2"))
        { //set num to 0
            num2 = 0;
            //clear box
            pile2.clear2 ();
            //call drawblank
            drawblank2 ();
        }
        else if (e.getActionCommand ().equals ("push"))
        {
            //make a new random donut
            Card d = new Card ();
            //if the box isn't full
            if (!pile.isFull ())
            {
                //Push d onto the box
                pile.push (d);
                //add one to num
                num++;
                //Call showDonut, pass in d
                showCard (d);
            }
        }
        else if (e.getActionCommand ().equals ("push2"))
        {
            //make a new random donut
            Card2 w = new Card2 ();
            //if the box isn't full
            if (!pile2.isFull2 ())
            {
                //Push d onto the box
                pile2.push2 (w);
                //add one to num
                num2++;
                //Call showDonut, pass in d
                showCard2 (w);
            }
        }
        else if (e.getActionCommand ().equals ("pop"))
        { //if the box isn't empty
            if (!pile.isEmpty ())
            { //pop a donut from the box, save it
                Card d = pile.pop ();
                //subtract one from num
                num--;
                //call showDonut, pass in d
                showCard (d);
            }
            else
            {
                //set num to 0
                num = 0;
                //at the bottom, call drawblank
                drawblank ();
            }
        }
        else if (e.getActionCommand ().equals ("pop2"))
        { //if the box isn't empty
            if (!pile2.isEmpty2 ())
            { //pop a donut from the box, save it
                Card2 w = pile2.pop ();
                //subtract one from num
                num2--;
                //call showDonut, pass in d
                showCard2 (w);
            }
            else
            {
                //set num to 0
                num2 = 0;
                //at the bottom, call drawblank
                drawblank2 ();
            }
        }

        else if (e.getActionCommand ().equals ("shuffle"))
        { //clear box
            pile.clear ();
            //call shuffle
            pile.shuffle ();
            //pop a donut, store it in a variable
            Card d = pile.pop ();
            //call showDonut, pass in the variable
            showCard (d);
        }
        else if (e.getActionCommand ().equals ("shuffle2"))
        { //clear box
            pile2.clear2 ();
            //call shuffle
            pile2.shuffle2 ();
            //pop a donut, store it in a variable
            Card2 w = pile2.pop ();
            //call showDonut, pass in the variable
            showCard2 (w);
        }
    }



    protected static ImageIcon createImageIcon (String path)
    {
        java.net.URL imgURL = ThanarajahRaviSneakyCards.class.getResource (path);
        if (imgURL != null)
            return new ImageIcon (imgURL);
        else
            return null;
    }
}
