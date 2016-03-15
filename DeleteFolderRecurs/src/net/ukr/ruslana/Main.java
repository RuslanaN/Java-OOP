package net.ukr.ruslana;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folderA = new File("A");
		folderA.mkdirs();
		File folderB = new File(folderA, "B");
		folderB.mkdirs();
		File folderC = new File(folderA, "C");
		folderC.mkdirs();
		
		File fileA = new File(folderA, "a.txt");
		System.out.println(fileA.getAbsolutePath());
		try {
			fileA.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		File fileB = new File(folderB, "b.doc");
		System.out.println(fileB.getAbsolutePath());
		try {
			fileB.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		File fileC = new File(folderB, "c.txt");
		System.out.println(fileC.getAbsolutePath());
		try {
			fileC.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		File fileD = new File(folderC, "d.pdf");
		System.out.println(fileD.getAbsolutePath());
		try {
			fileD.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		showParentFolder();
		delFolderRecurs(folderA);
		System.out.println();
		showParentFolder();
		
	}
	static void showParentFolder() {
		File parentFolder = new File(".");
		File[] files = parentFolder.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
	
	static void delFolderRecurs(File file) {
		if (file.isDirectory()) {
		    for (File f : file.listFiles()) {
		    	delFolderRecurs(f);
		    }
		}
		file.delete();
	}

}
