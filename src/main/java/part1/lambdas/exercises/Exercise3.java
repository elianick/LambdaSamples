/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1.lambdas.exercises;

/**
 * Transform code to use lambda expresiones
 *
 * @author aohz
 */
public class Exercise3 {

    public interface Operation {

        int calculate(int oper1, int oper2);
    }

    public static void main(String[] args) {
        System.out.print("Calculator... (4+6)+(-2*3) =");

        Operation sum = new Operation() {

            @Override
            public int calculate(int oper1, int oper2) {
                return oper1 + oper2;
            }

        };

        Operation sum1 = (a, b) -> a + b;
        Operation subs = new Operation() {

            @Override
            public int calculate(int oper1, int oper2) {
                return oper1 - oper2;
            }

        };
        Operation subs1 = (a, b) -> a - b;
        Operation mult = new Operation() {

            @Override
            public int calculate(int oper1, int oper2) {
                return oper1 * oper2;
            }

        };
        Operation mult1 = (a, b) -> a * b;
        int result = sum1.calculate(sum1.calculate(4, 6), mult1.calculate(subs1.calculate(0, 2), 3));

        System.out.println(" " + result);
    }

}
