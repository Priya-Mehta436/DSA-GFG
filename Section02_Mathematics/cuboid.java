//Given length l, width b and height h of a cuboid. Your task is to return an array containing the total surface area and volume of the cuboid.

package Section02_Mathematics;

public class cuboid {
    public int[] find(int l, int b, int h) {
        // code here
        int SurfaceArea= 2 * (b * h + h * l + l * b );
        int Volume = l*b*h;
        return new int[]{ SurfaceArea, Volume};
    }
}
