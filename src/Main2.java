void main() {
   /* ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    byteBuffer.put((byte) 42);
    byteBuffer.flip();
    byte value = byteBuffer.get();
    byteBuffer.clear();

    */
   /* try(FileChannel file = FileChannel.open(Paths.get("input.txt"),StandardOpenOption.READ)){
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        file.position(0);
        int byteRead ;
        while ((byteRead = file.read(buffer))!= -1){
            buffer.flip();
            String data = StandardCharsets.UTF_8.decode(buffer).toString();
            System.out.println(data);
            buffer.clear();
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    */

    try(FileChannel file1 = FileChannel.open(Paths.get("source.bin"),StandardOpenOption.READ);
        FileChannel copy = FileChannel.open(Paths.get("copy.bin"),StandardOpenOption.CREATE_NEW,StandardOpenOption.WRITE))
        {
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        int byteRead ;
        while ((byteRead = file1.read(buffer))!= -1){
            buffer.flip();
            copy.write(buffer);
            System.out.println("Содержимое файла скопированно!");
            buffer.clear();
        }

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
}