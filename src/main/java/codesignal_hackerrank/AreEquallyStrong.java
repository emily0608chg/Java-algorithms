package codesignal_hackerrank;

public class AreEquallyStrong {

    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        boolean result = false;

        if((yourLeft + yourRight) == (friendsLeft + friendsRight)){
            if(yourLeft == friendsLeft || yourLeft == friendsRight)
            {
                System.out.println("true");
                result = true;
            }
        } else
        {
            System.out.println("false");
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;

        areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight);
    }
}
