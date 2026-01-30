/**
 * connect 4 class that plays the game
 */
public class ConnectFour {

    /**
     * main function that plays the game
     * @param strings
     * @throws Exception
     */
    public static void main(String[] strings) throws Exception {
        int x = 200;
        int y = 200;
        int width = 600;
        int height = 400;
        // save layout info in a obj
        LayoutDetails ld = new LayoutDetails(x, y, width, height);

        // draw menu
        new DrawMenu(ld);

    }


}
