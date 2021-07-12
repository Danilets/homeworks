package stream.task2;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> surname = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        List<Person> persons = fillList(names, surname, 10_000);

        long youngCount = persons.stream()
                .filter(a -> a.getAge() < 18)
                .count();
        System.out.println("Количество несовершеннолетних " + youngCount);
        System.out.println();

        List<String> recruitList;
        recruitList = persons.stream()
                .filter(p -> p.getSex() == Sex.MAN)
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 27)
                .map(p -> p.getSurname())
                .collect(Collectors.toList());

        System.out.println("Список фамилий призывников");
        recruitList.stream().forEach(System.out::println);
        System.out.println();

        List<Person> readyToWorkList;
        Comparator<Person> comparator = (p1, p2) -> p1.getSurname().compareTo(p2.getSurname());
        readyToWorkList = persons.stream()
                .filter(p -> p.getEducation() == Education.HIGHER)
                .filter(p -> (p.getSex() == Sex.MAN && p.getAge() <= 65) || (p.getSex() == Sex.WOMAN && p.getAge() >= 18 && p.getAge() <= 60))
                .sorted(comparator)
                .collect(Collectors.toList());

        System.out.println("Работоспособные люди");
        readyToWorkList.stream().forEach(System.out::println);
    }

    private static List<Person> fillList(List<String> names, List<String> surname, int N) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < N; i++){
            result.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    surname.get(new Random().nextInt(surname.size())),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    new Random().nextInt(100),
                    Education.values()[new Random().nextInt(Education.values().length)]
            ));
        }
        return result;
    }
}