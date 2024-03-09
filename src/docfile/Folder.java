package docfile;

import java.io.File;
import java.util.Scanner;

public class Folder {
public Folder() {
	Scanner n = new Scanner(System.in);
	System.out.println(" nhap file muon biet do lon: ");
	String path = n.nextLine();
	File file = new File(path);
	if(file.exists()== true ) {
		System.out.println("true");
		System.out.println("ten file:" +file.getName());
		System.err.println("do lon la: " + file.length()+ " byte")	;
		}
	else
		System.out.println("false");
	
	
}
public static void main(String[] args) {
	new Folder();
}
}
