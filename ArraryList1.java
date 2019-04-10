import java.util.*;

/**
 * Write a description of class ArraryList1 here.
 *
 * @author Qurrat-al-Ain Siddiqui
 */
public class ArraryList1
{
    public void main()
    {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Naomi");

        System.out.println(friends);

        System.out.println("Enter 3 more names");
        friends.add(keyboard.nextLine());
        friends.add(keyboard.nextLine());
        friends.add(keyboard.nextLine());

        System.out.println(friends);

        friends.add("Ain");        
        System.out.println(friends);

        friends.add(0, "Madison");
        System.out.println(friends);

        friends.add(3, "Jesse");
        System.out.println(friends);

        //friends.add(9, "Ashley");
        //System.out.println(friends);

        int size = friends.size();
        System.out.println("Size of this list is " + size);

        int counter = 1;

        for (int i = 0; i <= 6; i++)
        {           

            System.out.println("Friend " + counter + ":\t" + friends.get(i));
            counter ++;
        }

        friends.remove(0);
        System.out.println(friends);

        friends.remove(3);
        System.out.println(friends);

        friends.remove(4);
        System.out.println(friends);

        int maxLength = 0;
        String longestString = null;
        for (String s : friends) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;             
            }
        }
        System.out.println(longestString);
    }
}
