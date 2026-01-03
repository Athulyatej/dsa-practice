package com.athul.dsa.recursion.friendsparty;

public class FriendsParty {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsParty(n));
    }

    private static int friendsParty(int n) {
        if (n <= 0) return 0;
        if (n == 2 || n == 1) return n;
        return friendsParty(n - 1) + (n - 1) * friendsParty(n - 2);
    }
}
