public class Card
{
    //Instance variables
    private int picNum;
    private String shortForm;

    public Card ()
    { //Arrays
        String names[] = {"Care 1", "Care 2", "Care 3", "Care 4", "Care 5", "Care 6", "Care 7", "Care 8", "Care 9",
            "Create 1", "Create 2", "Create 3", "Create 4", "Create 5", "Create 6", "Create 7", "Create 8", "Create 9",
            "Connect 1", "Connect 2", "Connect 3", "Connect 4", "Connect 5", "Connect 6", "Connect 7", "Connect 8", "Connect 9",
            "Engage 1", "Engage 2", "Engage 3", "Engage 4", "Engage 5", "Engage 6", "Engage 7", "Engage 8", "Engage 9",
            "Grow 1", "Grow 2", "Grow 3", "Grow 4", "Grow 5", "Grow 6", "Grow 7", "Grow 8", "Grow 9",
            "Surprise 1", "Surprise 2", "Surprise 3", "Surprise 4", "Surprise 5", "Surprise 6", "Surprise 7", "Surprise 8", "Surprise 9",
            "Sabotage"};

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,
            10, 11, 12, 13, 14, 15, 16, 17, 18,
            19, 20, 21, 22, 23, 24, 25, 26, 27,
            28, 29, 30, 31, 32, 33, 34, 35, 36,
            37, 38, 39, 40, 41, 42, 43, 44, 45,
            46, 47, 48, 49, 50, 51, 52, 53, 54, 55};
        //Randomize
        int rand = (int) (Math.random () * names.length);

        shortForm = names [rand];
        picNum = num [rand];

    }


    //Customized Constructor
    public Card (String s, int p)
    {
        shortForm = s;
        picNum = p;
    }


    //Accessor
    public String getshortForm ()
    {
        return shortForm;
    }


    public int getpicNum ()
    {
        return picNum;
    }


    //Mutator
    public void setshortForm (String s)
    {
        shortForm = s;
    }


    public void setpicNum (int p)
    {
        picNum = p;
    }


    //Accessor
    public String toString ()
    {
        return "                            Type: " + shortForm;
    }


    public String toString2 ()
    {
        return "                              Number: " + picNum;
    }


    //Facilitator
    public int compareTo (Card d)
    {
        if (d.getpicNum () > picNum)
            return -1;
        else if (d.getpicNum () == picNum)
            return 0;
        else
            return 1;
    }


    public boolean equals (Card d)
    {
        if (d.getshortForm ().equals (shortForm) && d.getpicNum () == picNum)
            return true;
        else
            return false;
    }


    //Accessor
    public String getPicName ()
    {
        //-------------Care---------------//
        if (shortForm.equals ("Care 1"))
            return "carecard1";
        else if (shortForm.equals ("Care 2"))
            return "carecard2";
        else if (shortForm.equals ("Care 3"))
            return "carecard3";
        else if (shortForm.equals ("Care 4"))
            return "carecard4";
        else if (shortForm.equals ("Care 5"))
            return "carecard5";
        else if (shortForm.equals ("Care 6"))
            return "carecard6";
        else if (shortForm.equals ("Care 7"))
            return "carecard7";
        else if (shortForm.equals ("Care 8"))
            return "carecard8";
        else if (shortForm.equals ("Care 9"))
            return "carecard9";

        //-------------Create---------------//
        else if (shortForm.equals ("Create 1"))
            return "createcard1";
        else if (shortForm.equals ("Create 2"))
            return "createcard2";
        else if (shortForm.equals ("Create 3"))
            return "createcard3";
        else if (shortForm.equals ("Create 4"))
            return "createcard4";
        else if (shortForm.equals ("Create 5"))
            return "createcard5";
        else if (shortForm.equals ("Create 6"))
            return "createcard6";
        else if (shortForm.equals ("Create 7"))
            return "createcard7";
        else if (shortForm.equals ("Create 8"))
            return "createcard8";
        else if (shortForm.equals ("Create 9"))
            return "createcard9";

        //-------------Connect---------------//
        else if (shortForm.equals ("Connect 1"))
            return "connectcard1";
        else if (shortForm.equals ("Connect 2"))
            return "connectcard2";
        else if (shortForm.equals ("Connect 3"))
            return "connectcard3";
        else if (shortForm.equals ("Connect 4"))
            return "connectcard4";
        else if (shortForm.equals ("Connect 5"))
            return "connectcard5";
        else if (shortForm.equals ("Connect 6"))
            return "connectcard6";
        else if (shortForm.equals ("Connect 7"))
            return "connectcard7";
        else if (shortForm.equals ("Connect 8"))
            return "connectcard8";
        else if (shortForm.equals ("Connect 9"))
            return "connectcard9";

        //-------------Engage---------------//
        else if (shortForm.equals ("Engage 1"))
            return "engagecard1";
        else if (shortForm.equals ("Engage 2"))
            return "engagecard2";
        else if (shortForm.equals ("Engage 3"))
            return "engagecard3";
        else if (shortForm.equals ("Engage 4"))
            return "engagecard4";
        else if (shortForm.equals ("Engage 5"))
            return "engagecard5";
        else if (shortForm.equals ("Engage 6"))
            return "engagecard6";
        else if (shortForm.equals ("Engage 7"))
            return "engagecard7";
        else if (shortForm.equals ("Engage 8"))
            return "engagecard8";
        else if (shortForm.equals ("Engage 9"))
            return "engagecard9";

        //-------------Grow---------------//
        else if (shortForm.equals ("Grow 1"))
            return "growcard1";
        else if (shortForm.equals ("Grow 2"))
            return "growcard2";
        else if (shortForm.equals ("Grow 3"))
            return "growcard3";
        else if (shortForm.equals ("Grow 4"))
            return "growcard4";
        else if (shortForm.equals ("Grow 5"))
            return "growcard5";
        else if (shortForm.equals ("Grow 6"))
            return "growcard6";
        else if (shortForm.equals ("Grow 7"))
            return "growcard7";
        else if (shortForm.equals ("Grow 8"))
            return "growcard8";
        else if (shortForm.equals ("Grow 9"))
            return "growcard9";

        //-------------Surprise---------------//
        else if (shortForm.equals ("Surprise 1"))
            return "surprisecard1";
        else if (shortForm.equals ("Surprise 2"))
            return "surprisecard2";
        else if (shortForm.equals ("Surprise 3"))
            return "surprisecard3";
        else if (shortForm.equals ("Surprise 4"))
            return "surprisecard4";
        else if (shortForm.equals ("Surprise 5"))
            return "surprisecard5";
        else if (shortForm.equals ("Surprise 6"))
            return "surprisecard6";
        else if (shortForm.equals ("Surprise 7"))
            return "surprisecard7";
        else if (shortForm.equals ("Surprise 8"))
            return "surprisecard8";
        else if (shortForm.equals ("Surprise 9"))
            return "surprisecard9";

        //-------------Other---------------//
        else
            return "sabotagecard";
    }
}


