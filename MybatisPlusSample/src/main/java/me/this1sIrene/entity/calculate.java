package me.this1sIrene.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class calculate {
    public static void main(String [] args) {
        String str = "3:145\n" +
                "7:184\n" +
                "10:295\n" +
                "38:921\n" +
                "107:196\n" +
                "13:165\n" +
                "2:44\n" +
                "2:315\n" +
                "2:224\n" +
                "96:1245\n" +
                "2:163\n" +
                "1:98\n" +
                "2:39\n" +
                "2:40\n" +
                "1:309\n" +
                "1:545\n" +
                "2:20\n" +
                "1:114\n" +
                "2:111\n" +
                "1:14\n" +
                "1:63\n" +
                "1:80\n" +
                "1:570\n" +
                "1:97\n" +
                "1:176\n" +
                "1:96" ;


        String result = str.replaceAll("\n", ",");

        String[] arr = result.split(",");
        int sum1 = 0;
        int sum2 = 0;
        for (String s:
             arr) {
            String[] split = s.split(":");
            int i = Integer.parseInt(split[0]);
            int j = Integer.parseInt(split[1]);
            sum1 += i;
            sum2 += j;
        }
        System.out.println("设备总数： " + sum1 + "        备件总数： " + sum2);

    }








}
