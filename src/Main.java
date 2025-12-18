
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String text = "Рупа Рупи любит зелёный цвет, Рупа Рупи";
    String[] words = text.toLowerCase().replaceAll("[^а-яa-z\\s]", "").split("\\s+");
    Map<String, Integer> Count = new HashMap<>();
    int c = 0;
    for (String word : words) {

        Count.put(word, Count.getOrDefault(word, 0) + 1);
        c++;
    }

    System.out.println(c);
    List<String> uniqueWords = new ArrayList<>(Count.keySet());
    Collections.sort(uniqueWords);
    for (String word : uniqueWords) {
        System.out.println(word + " : " + Count.get(word));
    }
    System.out.println(Count.size());
    Storage<String> storage = new Storage<>();
    storage.add("Хлеб");
    storage.add("Молоко");
    storage.add("Батон");
    storage.add("Колбыса");
    storage.add("Сыр");
    storage.add("Ягер");
    storage.add("Крупа");

    storage.remove("Ягер");

    HashMap<String, Integer> stats = storage.statistics();
    for (Map.Entry<String, Integer> entry : stats.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    for (String stat : storage.getHistory()) {
        System.out.println(stat);
    }
}

