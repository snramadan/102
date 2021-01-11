public class Lab01
{
    public static void main(String[] args)
    {
        
        int x = 5;
        String y = "hello";
        double z = 9.8;
        int[] nums = {3, 6, -1, 2, 1};

        System.out.print("x: " + x + "\ny: " + y + "\nz: " + z + "\n");


        //int[] nums = {3, 6, -1, 2, 1};
        for (int num:nums)
        {
            System.out.print(num + "\n");
        }

        int numFound = charCount(y, 'l');
        System.out.print("\nFound: " + numFound + "\n");

        for (int i = 1; i < 11; i++)
        {
            System.out.print(i + "\n");
        }
        System.out.print("\n");
        
    }

    public static int charCount(String s, char c)
    {
        int count = 0;
        for (char ch:s.toCharArray())
        {
            if (ch == c)
            {
                count++;
            }
        }
        return count;
    }
} 


    
