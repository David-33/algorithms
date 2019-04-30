package chapter1.part1;

import javafx.util.Pair;
import utils.StdIn;
import utils.StdOut;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by David on 25 Apr 2019, 11:25 PM
 */
public class Task21 {

    public static void main(String[] args) {
        final Map<String, Pair<Integer, Double>> map = new LinkedHashMap<>();

        for (String[] tokens; StdIn.hasNextLine(); ) {
            tokens = StdIn.readLine().split(" ");
            StringBuilder builder = new StringBuilder(tokens[0]);
            for (int i = 1, length = tokens.length - 2; i < length; i++) {
                builder.append(' ')
                        .append(tokens[i]);
            }
            map.put(builder.toString(), new Pair<>(Integer.parseInt(tokens[tokens.length - 2]),
                    Double.parseDouble(tokens[tokens.length - 1])));
        }

        for (Map.Entry<String, Pair<Integer, Double>> entry : map.entrySet()) {
            Pair<Integer, Double> pair = entry.getValue();
            StdOut.printf("%s %d %d %.3f\n", entry.getKey(), pair.getKey(), pair.getValue().intValue(),
                    pair.getKey() / pair.getValue());
        }
    }

}
