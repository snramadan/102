public class Lab00
{
    public static void main(String[] args)
    {
        int x = 5;
        String y = "hello";
        double z = 9.8;
        int[] nums = {3, 6, -1, 2};
        
        System.out.print("x: " + x + "\ny: " + y + "\nz: " + z + "\n"); 

        for (int num:nums)
        {
            System.out.print(num + " ");
        }
        int numFound = char_count(y, 'l');
        System.out.print("\nFound: " + numFound + "\n");
        
        for (int i = 1; i < 11; i++)
	{
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    public static int char_count(String s, char c)
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
