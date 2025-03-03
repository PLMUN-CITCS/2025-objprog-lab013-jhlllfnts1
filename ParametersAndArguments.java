public class ParametersAndArguments {

    // Main method
    public static void main(String[] args) {
        // Variable declarations for room dimensions
        int roomWidth = 10;
        int roomHeight = 15;

        // Calling calculateArea method and storing the result
        int area = calculateArea(roomWidth, roomHeight);

        // Printing the calculated area
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate the area of a room
    public static int calculateArea(int width, int height) {
        int area = width * height;  // Calculating the area
        return area;  // Returning the area
    }
}
