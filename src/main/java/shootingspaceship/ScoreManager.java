package shootingspaceship;

import java.io.*;
import java.util.*;

public class ScoreManager {

    private static final String FILE_PATH = "ranking.txt";

    public static void saveScores(List<PlayerScore> scores) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (PlayerScore ps : scores) {
                writer.write(ps.getPlayerName() + "," + ps.getScore());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PlayerScore> loadScores() {
        List<PlayerScore> scores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    scores.add(new PlayerScore(parts[0], Integer.parseInt(parts[1])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(scores);
        return scores;
    }
}
