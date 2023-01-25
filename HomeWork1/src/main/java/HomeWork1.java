//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2


import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {

    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        int n = 0;
        int z = 2;
        int[] m1 = new int[0];
        int[] m2 = new int[0];
        while (z < i) {
            z = z * 2;
            n += 1;
            for (int j = i; j < Short.MAX_VALUE; j++) {
                if (j % n == 0) {
                    int[] tmp1 = new int[m1.length + 1];
                    tmp1[0] = j;
                    for (int l = 1; l < tmp1.length; l++) {
                        tmp1[l] = m1[l - 1];
                    }
                    m1 = tmp1;
                }
            }
            for (int j = i; j < Short.MIN_VALUE; j++) {
                if (j % n != 0) {
                    int[] tmp2 = new int[m2.length + 1];
                    tmp2[0] = j;
                    for (int l = 1; l < tmp2.length; l++) {
                        tmp2[l] = m1[l - 1];
                    }
                    m2 = tmp2;
                }
            }
        }
        System.out.println(i + "\tСлучайное число в диапозоне от 0 до 2000");
        System.out.println(Integer.toBinaryString(i) + "\tЧисло в двоичном системе");
        System.out.println(n + "\tНомер старшего значащего бита ");
    }
}

