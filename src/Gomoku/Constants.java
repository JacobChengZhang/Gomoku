package Gomoku;

public class Constants {
    static boolean gameStarted = false;

    // TODO add differents ban rules
    private static boolean bans;

    public enum  Mode{
        PvP, PvAI, AIvAI,
    }
    private static Mode mode = Mode.PvAI;
    public static Mode getMode() {
        return mode;
    }
    static void setMode(Mode m) {
        if (!gameStarted) {
            mode = m;
        }
    }

    static final int minOrder = 11;
    static final int maxOrder = 19;
    private static int order = 15; // better between 11~19
    public static int getOrder() {
        return order;
    }
    static void setOrder(int i) {
        if (!gameStarted) {
            if (i >= minOrder && i <= maxOrder && i % 2 != 0) {
                // first, adjust border correspondingly
                border += ((order - i) * increment / 2);
                // change border
                order = i;
            }
        }
    }

    static final int minBorder = 25;
    private static int border = 101; // border when order = 15
    static int getBorder() {
        return border;
    }

    final static int increment = 38;
    final static int btnPaneHeight = 35;
    final static double pieceRadius = 16f;
    final static double lineWidth = 1f;
    final static double dotRadius = 4f;


    public final static String version = "1.1";
}