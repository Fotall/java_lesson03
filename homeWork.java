import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class homeWork {
    public static void main(String[] args) {
        /**   Пусть дан произвольный список из 100 целых чисел. */ 
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt();
            numbers.add(k);

        }
        System.out.println("Наш список: " + numbers);
        // 2) Найти минимальное значение 
        // 3) Найти максимальное значение
        int k = numbers.get(0);
        int b = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) < k){
                k = numbers.get(i);
            }
            if(numbers.get(i) > b){
                b = numbers.get(i);
            }
        }
        System.out.println("Минимальное значение: " + k);
        System.out.println("Максимальное значение: " + b);
        // 4) Найти среднее значение
        // int sum = 0;
        int x = 0;
        for (int i = 0; i < numbers.size(); i++) {
            x += numbers.get(i);
        }
        int sum = x / numbers.size();
        System.out.println("Среднее значение: " + sum);
        // Нужно удалить из него чётные числа
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){ // get обраться к элементу списка
                numbers.remove(i);
            }
        }
        System.out.println("Список без четных чисел: " + numbers);
    }
}
