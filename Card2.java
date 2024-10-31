public class Card2
{
    private int picNum2;
    private String shortForm2;

    public Card2 ()
    {
        String names2[] = {"Care 1", "Care 2", "Care 3", "Care 4", "Care 5", "Care 6", "Care 7", "Care 8", "Care 9",
            "Create 1", "Create 2", "Create 3", "Create 4", "Create 5", "Create 6", "Create 7", "Create 8", "Create 9",
            "Connect 1", "Connect 2", "Connect 3", "Connect 4", "Connect 5", "Connect 6", "Connect 7", "Connect 8", "Connect 9",
            "Engage 1", "Engage 2", "Engage 3", "Engage 4", "Engage 5", "Engage 6", "Engage 7", "Engage 8", "Engage 9",
            "Grow 1", "Grow 2", "Grow 3", "Grow 4", "Grow 5", "Grow 6", "Grow 7", "Grow 8", "Grow 9",
            "Surprise 1", "Surprise 2", "Surprise 3", "Surprise 4", "Surprise 5", "Surprise 6", "Surprise 7", "Surprise 8", "Surprise 9",
            "Sabotage"};

        int num2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,
            10, 11, 12, 13, 14, 15, 16, 17, 18,
            19, 20, 21, 22, 23, 24, 25, 26, 27,
            28, 29, 30, 31, 32, 33, 34, 35, 36,
            37, 38, 39, 40, 41, 42, 43, 44, 45,
            46, 47, 48, 49, 50, 51, 52, 53, 54, 55};

        int rand2 = (int) (Math.random () * names2.length);

        shortForm2 = names2 [rand2];
        picNum2 = num2 [rand2];

    }


    public Card2 (String f, int n)
    {
        shortForm2 = f;
        picNum2 = n;
    }


    public String getshortForm2 ()
    {
        return shortForm2;
    }


    public int getpicNum2 ()
    {
        return picNum2;
    }


    public void setshortForm2 (String f)
    {
        shortForm2 = f;
    }


    public void setpicNum2 (int n)
    {
        picNum2 = n;
    }


    public String toString10 ()
    {
        return "                            Type: " + shortForm2;
    }


    public String toString20 ()
    {
        return "                              Number: " + picNum2;
    }


    public int compareTo (Card2 w)
    {
        if (w.getpicNum2 () > picNum2)
            return -1;
        else if (w.getpicNum2 () == picNum2)
            return 0;
        else
            return 1;
    }


    public boolean equals (Card2 w)
    {
        if (w.getshortForm2 ().equals (shortForm2) && w.getpicNum2 () == picNum2)
            return true;
        else
            return false;
    }


    public String getPicName2 ()
    {
        //-------------Care---------------//
        if (shortForm2.equals ("Care 1"))
            return "carecard1";
        else if (shortForm2.equals ("Care 2"))
            return "carecard2";
        else if (shortForm2.equals ("Care 3"))
            return "carecard3";
        else if (shortForm2.equals ("Care 4"))
            return "carecard4";
        else if (shortForm2.equals ("Care 5"))
            return "carecard5";
        else if (shortForm2.equals ("Care 6"))
            return "carecard6";
        else if (shortForm2.equals ("Care 7"))
            return "carecard7";
        else if (shortForm2.equals ("Care 8"))
            return "carecard8";
        else if (shortForm2.equals ("Care 9"))
            return "carecard9";

        //-------------Create---------------//
        else if (shortForm2.equals ("Create 1"))
            return "createcard1";
        else if (shortForm2.equals ("Create 2"))
            return "createcard2";
        else if (shortForm2.equals ("Create 3"))
            return "createcard3";
        else if (shortForm2.equals ("Create 4"))
            return "createcard4";
        else if (shortForm2.equals ("Create 5"))
            return "createcard5";
        else if (shortForm2.equals ("Create 6"))
            return "createcard6";
        else if (shortForm2.equals ("Create 7"))
            return "createcard7";
        else if (shortForm2.equals ("Create 8"))
            return "createcard8";
        else if (shortForm2.equals ("Create 9"))
            return "createcard9";

        //-------------Connect---------------//
        else if (shortForm2.equals ("Connect 1"))
            return "connectcard1";
        else if (shortForm2.equals ("Connect 2"))
            return "connectcard2";
        else if (shortForm2.equals ("Connect 3"))
            return "connectcard3";
        else if (shortForm2.equals ("Connect 4"))
            return "connectcard4";
        else if (shortForm2.equals ("Connect 5"))
            return "connectcard5";
        else if (shortForm2.equals ("Connect 6"))
            return "connectcard6";
        else if (shortForm2.equals ("Connect 7"))
            return "connectcard7";
        else if (shortForm2.equals ("Connect 8"))
            return "connectcard8";
        else if (shortForm2.equals ("Connect 9"))
            return "connectcard9";

        //-------------Engage---------------//
        else if (shortForm2.equals ("Engage 1"))
            return "engagecard1";
        else if (shortForm2.equals ("Engage 2"))
            return "engagecard2";
        else if (shortForm2.equals ("Engage 3"))
            return "engagecard3";
        else if (shortForm2.equals ("Engage 4"))
            return "engagecard4";
        else if (shortForm2.equals ("Engage 5"))
            return "engagecard5";
        else if (shortForm2.equals ("Engage 6"))
            return "engagecard6";
        else if (shortForm2.equals ("Engage 7"))
            return "engagecard7";
        else if (shortForm2.equals ("Engage 8"))
            return "engagecard8";
        else if (shortForm2.equals ("Engage 9"))
            return "engagecard9";

        //-------------Grow---------------//
        else if (shortForm2.equals ("Grow 1"))
            return "growcard1";
        else if (shortForm2.equals ("Grow 2"))
            return "growcard2";
        else if (shortForm2.equals ("Grow 3"))
            return "growcard3";
        else if (shortForm2.equals ("Grow 4"))
            return "growcard4";
        else if (shortForm2.equals ("Grow 5"))
            return "growcard5";
        else if (shortForm2.equals ("Grow 6"))
            return "growcard6";
        else if (shortForm2.equals ("Grow 7"))
            return "growcard7";
        else if (shortForm2.equals ("Grow 8"))
            return "growcard8";
        else if (shortForm2.equals ("Grow 9"))
            return "growcard9";

        //-------------Surprise---------------//
        else if (shortForm2.equals ("Surprise 1"))
            return "surprisecard1";
        else if (shortForm2.equals ("Surprise 2"))
            return "surprisecard2";
        else if (shortForm2.equals ("Surprise 3"))
            return "surprisecard3";
        else if (shortForm2.equals ("Surprise 4"))
            return "surprisecard4";
        else if (shortForm2.equals ("Surprise 5"))
            return "surprisecard5";
        else if (shortForm2.equals ("Surprise 6"))
            return "surprisecard6";
        else if (shortForm2.equals ("Surprise 7"))
            return "surprisecard7";
        else if (shortForm2.equals ("Surprise 8"))
            return "surprisecard8";
        else if (shortForm2.equals ("Surprise 9"))
            return "surprisecard9";

        //-------------Other---------------//
        else 
            return "sabotagecard";
    }
}


