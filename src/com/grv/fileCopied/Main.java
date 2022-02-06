package com.grv.fileCopied;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		String sourceDir = "D:\\Notes";
		String destDir = "D:\\zTestDir";
		
		File source = new File(sourceDir);
		File dest = new File(destDir);
		
		if(source.isDirectory()) {
			for(File f: source.listFiles()) {
				if(f.getName().contains("neo4j")) {
					copyFile(f,new File(destDir+"\\"+f.getName()));
				}
			}
		}
	}
	
	private static void copyFile(File f, File dest) {
		try {
			FileUtils.copyFile(f, dest);
			System.out.println("FIle Copied Successfully...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void copyDirectory(String sourceDirectoryLocation, String destinationDirectoryLocation) throws IOException {
	    File sourceDirectory = new File(sourceDirectoryLocation);
	    File destinationDirectory = new File(destinationDirectoryLocation);
	    FileUtils.copyDirectory(sourceDirectory, destinationDirectory);
	}
	
}
