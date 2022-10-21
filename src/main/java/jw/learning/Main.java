package jw.learning;

import jw.StringParser;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws Exception {
        if(args.length == 0)
        {
            System.out.println("Hello world!");
            return;
        }

        var parsers = new StringParser();
        Arrays.stream(parsers.parse(args)).toList().forEach(System.out::println);
    }
}