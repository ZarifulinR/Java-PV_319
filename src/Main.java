
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException {
    Path path = Paths.get("simple.txt");
    List<String> data = Arrays.asList("Masha@Dasha");
    Files.write(path,data,StandardOpenOption.CREATE);

    Path path1 = Paths.get("log.txt");
    Files.write(path1,data,StandardOpenOption.APPEND,StandardOpenOption.CREATE);
    List<String> data1 = Arrays.asList("Sasha@Dasha");
    Files.write(path1,data1,StandardOpenOption.APPEND,StandardOpenOption.CREATE);
    List<String> data2 = Arrays.asList("Petya@Dasha");
    Files.write(path1,data2,StandardOpenOption.APPEND,StandardOpenOption.CREATE);
    Path path2 = Paths.get("report.txt");
    List<String> data3 = Arrays.asList("Tolya@Dasha");
    try {
        Files.write(path2,data3,StandardCharsets.UTF_8,StandardOpenOption.CREATE_NEW);
    }catch (Exception e){
        System.out.println("Файл уже существует");
    }

}

