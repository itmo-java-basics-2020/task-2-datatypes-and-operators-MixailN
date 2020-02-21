package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        return realNumber % 1;
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        return c;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        return (a.intValue() == b.intValue());
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if(number == null || leftBound == null || rightBound == null || inclusively == null)
        {
            return false;
        }
        if(inclusively)
        {
            if(number.intValue() <= rightBound.intValue() && number.intValue() >= leftBound.intValue())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if(number.intValue() < rightBound.intValue() && number.intValue() > leftBound.intValue())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {

        return ((c1 <= 57 && c1 >= 48)||(c2 <= 57 && c2 >= 48)||(c3 <= 57 && c3 >= 48)); //your code here
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        double eps = 1e-10;
        return Math.abs(a - b) < eps; //your code here
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int result = 0;
        while (n > 0)
        {
            result += n % 10;
            n = n / 10;
        }
        return result; //your code here
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        return (n % 2 == 0) ? n + 2 : n + 1; //your code here
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        return ((int)Math.ceil(num1 / 2.) + (int)Math.ceil(num2 / 2.) + ((int)Math.ceil(num3 / 2.))); //your code here
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        int a = N % 10;
        N = N / 10;
        int b = N % 10;
        return a ^ b; //your code here
    }

}
