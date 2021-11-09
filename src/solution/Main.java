package solution;

import solution.s1.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // ************************************************************************************
        Vector2D vector2D_1 = new Vector2D(2.0, 3.0);
        Vector2D vector2D_2 = new Vector2D(8.0, 5.0);

        System.out.println(vector2D_1);
        System.out.println(vector2D_2);
        System.out.println("Iloczyn skalarny = " + vector2D_1.cdot(vector2D_2) + "\n");

        // ************************************************************************************
        Polar2DAdapter vector2DA = new Polar2DAdapter(vector2D_1);

        System.out.println(vector2DA);
        System.out.println("Iloczyn skalarny = " + vector2DA.cdot(vector2D_1) + "\n");

        // ************************************************************************************
        Vector2DPolarInheritance vector2DPI = new Vector2DPolarInheritance(10, 15);

        System.out.println(vector2DPI);
        System.out.println("Iloczyn skalarny = " + vector2DPI.cdot(vector2DA) + "\n");

        // ************************************************************************************
        Vector3DInheritance vector3DI_1 = new Vector3DInheritance(11, 12, 13);
        Vector3DInheritance vector3DI_2 = new Vector3DInheritance(9, 8, 7);

        System.out.println(vector3DI_1);
        System.out.println(vector3DI_2);
        System.out.println("Iloczyn skalarny = " + vector3DI_1.cdot(vector3DI_2));
        System.out.println("Iloczyn wektorowy = " + vector3DI_1.cross(vector3DI_2) + "\n");

        // ************************************************************************************
        Vector3DDecorator vector3DD = new Vector3DDecorator(vector2DA, 6);

        System.out.println(vector3DD);
        System.out.println("Iloczyn skalarny = " + vector3DD.cdot(vector3DI_1));
        System.out.println("Iloczyn wektorowy = " + vector3DD.cross(vector3DI_2) + "\n");
    }
}
