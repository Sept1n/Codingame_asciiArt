import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        ArrayList<String> ar = new ArrayList<>();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            ar.add(ROW);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(T.length());
        for (int i = 0; i < T.length(); i++) {
            int number;
            switch(T.charAt(i)) {
                case 'A': case 'a': number = 0; break;
                case 'B': case 'b': number = 1; break;
                case 'C': case 'c': number = 2; break;
                case 'D': case 'd': number = 3; break;
                case 'E': case 'e': number = 4; break;
                case 'F': case 'f': number = 5; break;
                case 'G': case 'g': number = 6; break;
                case 'H': case 'h': number = 7; break;
                case 'I': case 'i': number = 8; break;
                case 'J': case 'j': number = 9; break;
                case 'K': case 'k': number = 10; break;
                case 'L': case 'l': number = 11; break;
                case 'M': case 'm': number = 12; break;
                case 'N': case 'n': number = 13; break;
                case 'O': case 'o': number = 14; break;
                case 'P': case 'p': number = 15; break;
                case 'Q': case 'q': number = 16; break;
                case 'R': case 'r': number = 17; break;
                case 'S': case 's': number = 18; break;
                case 'T': case 't': number = 19; break;
                case 'U': case 'u': number = 20; break;
                case 'V': case 'v': number = 21; break;
                case 'W': case 'w': number = 22; break;
                case 'X': case 'x': number = 23; break;
                case 'Y': case 'y': number = 24; break;
                case 'Z': case 'z': number = 25; break;
                default: number = 26;
            }
            arrayList.add(number);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < H; i ++) {
            for (int j = 0; j < arrayList.size(); j++) {
                stringBuilder.append(ar.get(i).substring(arrayList.get(j)*L, ((arrayList.get(j)*L) + (L))));
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}