public class Deck2
{
    private int count2;
    private Card2 data[] = new Card2 [100];

   

    public Deck2 ()
    {
        count2 = 0;
    }


    public void shuffle2 ()
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
            28, 29, 30, 31, 32, 33, 34, 34, 35, 36,
            37, 38, 39, 40, 41, 42, 43, 44, 45,
            46, 47, 48, 49, 50, 51, 52, 53, 54, 55};

        //Randomize the order of the arrays
        for (int i = 0 ; i < 100 ; i++)
        {
            int r10 = (int) (Math.random () * names2.length);
            int r20 = (int) (Math.random () * names2.length);
            //swap names array
            String temp2 = names2 [r10];
            names2 [r10] = names2 [r20];
            names2 [r20] = temp2;
            //swap points array
            int temp3 = num2 [r10];
            num2 [r10] = num2 [r20];
            num2 [r20] = temp3;
        }
        count2 = 0;
        // push all (now in random order) into the Deck
        for (int i = 0 ; i < names2.length ; i++)
        {
            Card2 w = new Card2 (names2 [i], num2 [i]);
            push2 (w);
        }
    }


    public void push2 (Card2 addMe)
    {
        data [count2] = addMe;
        count2++;
    }


    public int size2 ()
    {
        return count2;
    }


    public boolean isFull2 ()
    {
        return (count2 == 40);
    }


    public Card2 pop ()
    {
        count2--;
        return data [count2];
    }


    public Card2 peek ()
    {
        return data [count2--];
    }


    public boolean isEmpty2 ()
    {
        return count2 == 0;
    }


    public void clear2 ()
    {
        count2 = 0;
    }
}
