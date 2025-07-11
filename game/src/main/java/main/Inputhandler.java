package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Inputhandler {
    public static int getUserInputInt(){
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true){
                String in = bufr.readLine();
                try {
                    return Integer.parseInt(in);
                } catch (NumberFormatException ignored){}
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
