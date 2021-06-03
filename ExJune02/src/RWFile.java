import java.io.*;

public class RWFile {
    public static void writeToFile(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("id, name, dob, gender, address, email, avgMark \n 1, Quan, 29/11/92, male, Ha Noi, ntq@cogeym, 9");
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader br = new BufferedReader(fileReader);
        String res ;
        while ((res = br.readLine()) !=null) {
            System.out.println(res);
        }
        br.close();
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        RWFile.writeToFile("Student.csv");
        readFromFile("Student.csv");

    }
}