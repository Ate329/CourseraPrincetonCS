public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty()) {
            String regionName = StdIn.readString();
            int vertices = StdIn.readInt();
            double[] xCoords = new double[vertices];
            double[] yCoords = new double[vertices];
            for (int i = 0; i < vertices; i++) {
                xCoords[i] = StdIn.readDouble();
                yCoords[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xCoords, yCoords);
        }

        System.out.println("Map drawn");
    }
}
