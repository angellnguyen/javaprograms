import java.io.*;

public class SplitLargeFile {

	public static void main(String[] args) throws Exception{

		if (args.length != 2) {
			System.out.println("Usage: Exercise19_10 SourceFile numberOfPieces");
			System.exit(0);
		}
		
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(args[0])));
		
		int numberOfPieces = Integer.parseInt(args[1]);
		
		System.out.println("File size:" + input.available() +" bytes");
		long fileSize = input.available();
		int splitFileSize = (int) Math.ceil(1.0 * fileSize / numberOfPieces);
		
		for (int i = 1; i <= numberOfPieces; i++) {
			BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(args[0] +".")));
			
			int value;
			int count = 0;
			
			while (count ++ < splitFileSize && (value = input.read()) != -1) {
				output.write(value);
				
			}
			output.close();
			
		}
		input.close();
	}

}
