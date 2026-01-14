
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException {
  /*  String sousrse = "04_4D56.jpg";
    String des = "logo_copy.png";
    try(FileInputStream in = new FileInputStream(sousrse)) {
        FileOutputStream out = new FileOutputStream(des);
        byte[]buffer = new byte[8192];
        int bytesRead;
        while ((bytesRead= in.read(buffer))!=-1){
            out.write(buffer,0,bytesRead);
        }
        System.out.println("OK");
    }catch (IOException e){
        System.out.println("Error"+e.getMessage());
    }*/
   /* String filename = "savegame.bin";
    String PlayerName = "Alex";
    int score  =545;
    double recordTime =56.7;
    boolean isWinner =true;
    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))){

        dos.writeUTF(PlayerName);
        dos.writeInt(score);
        dos.writeDouble(recordTime);
        dos.writeBoolean(isWinner);
        System.out.println("OK");
    }catch (IOException e){
        System.out.println(e.getMessage());
    }*/
    /*String name = "input.txt";
    try (BufferedReader reader =new BufferedReader(new FileReader(name))){
        String line;
        while ((line = reader.readLine())!=null){
            System.out.println(line);
        }

    }catch (Exception ex){
        System.out.println(ex.getMessage());
    }

     */
   /* try(BufferedReader reader =new BufferedReader(new FileReader("sourse.txt"));
        BufferedWriter write = new BufferedWriter(new FileWriter("result.txt"))){
       String line;
        while ((line = reader.readLine()) != null){
            if(line.length()>10){
                write.write(line);
                write.newLine();
            }
        }
    }catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    */

}


