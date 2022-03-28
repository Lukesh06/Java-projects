package exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadUtility {

	public static void readContentFromFile(String filePath) throws IOException {

		File file = new File(filePath);

		FileInputStream inputStream = new FileInputStream(file);
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}

		}
		System.out.println(resultStringBuilder.toString());
	}
}