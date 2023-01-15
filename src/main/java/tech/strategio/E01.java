package tech.strategio;

import java.util.*;

public class E01 {
    public static int getNthFib(int n) {
        if (n==0||n==1)
        return 0;
        else if(n==2)
            return 1;
        return getNthFib(n - 1) + getNthFib(n - 2);
    }

    public static void main(String args[])
    {
        int n = 9;
        System.out.println(getNthFib(n));
    }
}
