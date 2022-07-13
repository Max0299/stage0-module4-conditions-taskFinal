package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double a, double b, double c) {

        if(a > 0 && b > 0 && c > 0 && (a+b) > c && (a+c) > b && (c+b) > a){
            System.out.println("this is a valid triangle");
        }else {
            System.out.println("it's not a triangle");
        }

    }
}
