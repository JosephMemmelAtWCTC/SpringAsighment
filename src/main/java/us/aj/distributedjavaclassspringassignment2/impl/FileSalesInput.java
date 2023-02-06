









package us.aj.distributedjavaclassspringassignment2.impl;

import us.aj.distributedjavaclassspringassignment2.Sale;
import us.aj.distributedjavaclassspringassignment2.iface.SalesInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSalesInput implements SalesInput {
	static private String INPUT_FILE_PATH = "sales.txt";

	@Override
	public List<Sale> getSales() {
		List<Sale> theSales = new ArrayList<>();

		File inputFile = new File(INPUT_FILE_PATH);

		BufferedReader bufferedReader;
//		Buffered Reader File Reading code is from www.geeksforgeeks.org/different-ways-reading-text-file-java/
		try{
			bufferedReader = new BufferedReader(new FileReader(inputFile));
		}catch(FileNotFoundException e){
			e.printStackTrace();
			throw new IllegalArgumentException();
//			return theSales;
		}

		String line;
		System.out.println("Generating Sales: ");
		while(true){
			try {
				line = bufferedReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
			if(line==null){
				break;
			}

			String[] splitLine = line.split(",",4);
			System.out.print(".");
			theSales.add(new Sale(splitLine[0], splitLine[1], Double.parseDouble(splitLine[2]), Double.parseDouble(splitLine[3])));

		}
		System.out.println("\n"+theSales.size()+" sales generated from file at "+INPUT_FILE_PATH);//Fix ... status printer to end on a new line
		return theSales;
	}

}
