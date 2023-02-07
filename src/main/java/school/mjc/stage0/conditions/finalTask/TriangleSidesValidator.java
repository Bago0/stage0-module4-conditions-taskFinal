package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double biggest;
        if(firstSide > secondSide && firstSide > thirdSide){
            biggest = firstSide;
        }else if(secondSide > firstSide && secondSide > thirdSide){
            biggest = secondSide;
        }else{
            biggest = thirdSide;
        }
        if(biggest == firstSide) {
            if (secondSide+thirdSide > firstSide) {
                System.out.println("this is a valid triangle");
            } else {
                System.out.println("it's not a triangle");
            }
        } else if (biggest == secondSide) {
            if (firstSide+thirdSide > secondSide) {
                System.out.println("this is a valid triangle");
            } else {
                System.out.println("it's not a triangle");
            }
        } else {
            if (secondSide+firstSide > thirdSide) {
                System.out.println("this is a valid triangle");
            } else {
                System.out.println("it's not a triangle");
            }
        }
    }
}
