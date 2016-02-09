import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Writer {
	public static void main(String [] args) {
		try {
			String content = "This is the content to write into the file";
			File file = new File("filename.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
