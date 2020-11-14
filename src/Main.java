import  java.util.*;
public class Main {

    public static void main(String[] args) {
            ArrayList<String> a = new ArrayList<>();
            ArrayList<String> b = new ArrayList<>();
            ArrayList<String> c = new ArrayList<>();

            Comparator<String> comparator = (o1, o2) -> {
                Integer i1 = o1.length();
                Integer i2 = o2.length();
                return i1.compareTo(i2);
            };
            addToCollection(a, 5);
            printOut(a);

            Iterator<String> iteratorA = a.iterator();
            addToCollection1(b, 5);
            printOut(b);

            Iterator<String> iteratorB = b.iterator();
            Collections.reverse(b);

            while (iteratorA.hasNext() && iteratorB.hasNext()) {
                c.add(iteratorA.next());
                c.add(iteratorB.next());
            }

            printOut(c);

            c.sort(comparator);
            printOut(c);
        }

        public static void addToCollection(Collection<String> collection, int quantity) {
            System.out.println("Напишите пять имён:");
            Scanner s = new Scanner(System.in);
            for (int i = 0; i < quantity; i++) {
                collection.add(s.nextLine());
            }
            System.out.println("Список A готов!");

        }

        public static void addToCollection1(Collection<String> collection, int quantity) {
            Scanner s = new Scanner(System.in);
            System.out.println("ГОТОВО!");
            for (int i = 0; i < quantity; i++) {
                collection.add(s.nextLine());
            }
            System.out.println("Список B готов!");
        }

        public static void printOut(Collection<String> collection) {
            Iterator<String> iterator = collection.iterator();
            System.out.println("________________");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                }
            }
            System.out.println("**************");
        }
    }

