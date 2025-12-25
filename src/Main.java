
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
    List<Integer> even = nums.stream()
            .filter(n->n%2==1)
            .map(n->n*2)
            .collect(Collectors.toList());
        System.out.println(even);
    List<String> words = List.of( "python","java", "go", "java", "rust", "go");
    List<String> lang = words.stream()
            .filter(s -> s.length()>3 )
            .distinct()
            .sorted()
            .collect(Collectors.toList());
    System.out.println(lang);

}

