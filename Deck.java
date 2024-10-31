public class Deck
{
    private int count;
    private Card data[] = new Card [100];

   

    public Deck ()
    {
        count = 0;
    }


    public void shuffle ()
    {
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
            28, 29, 30, 31, 32, 33, 34, 34, 35, 36,
            37, 38, 39, 40, 41, 42, 43, 44, 45,
            46, 47, 48, 49, 50, 51, 52, 53, 54, 55};

        //Randomize the order of the arrays
        for (int i = 0 ; i < 100 ; i++)
        {
            int r1 = (int) (Math.random () * names.length);
            int r2 = (int) (Math.random () * names.length);
            //swap names array
            String temp = names [r1];
            names [r1] = names [r2];
            names [r2] = temp;
            //swap points array
            int temp1 = num [r1];
            num [r1] = num [r2];
            num [r2] = temp1;
        }
        count = 0;
        // push all (now in random order) into the Deck
        for (int i = 0 ; i < names.length ; i++)
        {
            Card d = new Card (names [i], num [i]);
            push (d);
        }
    }


    public void push (Card addMe)
    {
        data [count] = addMe;
        count++;
    }


    public int size ()
    {
        return count;
    }


    public boolean isFull ()
    {
        return (count == 40);
    }


    public Card pop ()
    {
        count--;
        return data [count];
    }


    public Card peek ()
    {
        return data [count--];
    }


    public boolean isEmpty ()
    {
        return count == 0;
    }


    public void clear ()
    {
        count = 0;
    }
}


