public class Ex2Lev1 {
    public static void main(String[] args) {
        /*
         * Написать програму которая вычислит и выведет на екран
         * площадь треугольника если извесны его стороны (Если известны его стороны, их не нужно вводить с клавиатуры)
         */
        int cathetOne = 2;
        int cathetTwo = 4;
        int cathetThree = 5;
        double halfPerimeter;
        double squareTriangle;

        halfPerimeter = (cathetOne + cathetTwo + cathetThree) / 2.0;

        squareTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - cathetOne) * (halfPerimeter - cathetTwo) * (halfPerimeter - cathetThree));
        System.out.println("The area of the triangle is " + squareTriangle);
    }
}
