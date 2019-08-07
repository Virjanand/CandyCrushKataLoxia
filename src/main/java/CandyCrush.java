import java.util.HashSet;
import java.util.Set;

public class CandyCrush {

    public boolean hasMovableFields(char[][] p) {
        char[] eersteRegel = p[0];
        return heeftDrieOpRij(eersteRegel);
    }

    private boolean heeftDrieOpRij(char[] gameRow) {
        char lastChar = gameRow[0];
        int counter = 0;
        for (char c : gameRow) {

            if (lastChar == c) {
                counter++;
                if (counter == 3) {
                    return true;
                }
            } else {
                lastChar = c;
                counter = 1;
            }
        }
        return false;
    }
}
