package pkg;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;

import static sbcc.Core.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.swing.*;
import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;

//import static org.apache.commons.compress.*;
import static java.lang.System.*;
import static org.apache.commons.io.FileUtils.*;

import java.io.*;
import java.util.*;

public class FileConverter {

	public static void main(String[] args) throws IOException {

		byte[] data = new byte[]{ 0, 1};

		println("Please put forth your file path: ");
		println("(Example: \"/Users/richiecastle/Desktop/goku.jpg\")");
		Scanner keyboard = new Scanner(System.in);
		String filePath = keyboard.nextLine(); // "/Users/richiecastle/Desktop/goku.jpg"

		println("\nWhich format would you like: zip or ?");
		String requestType = keyboard.nextLine();


		//chopOffExtension(filePath);



		ZipConverter zp = new ZipConverter();
		zp.write(filePath, data);

	}

	// chooses best strategy method
	public static StringBuilder chopOffExtension(String filePath){
		StringBuilder filePathWithOutExt = new StringBuilder();

		if(filePath.matches("(.*)jpg")){
			filePathWithOutExt.append(filePath);
			//filePathWithOutExt.replce(".jpg", "");
		} else {
			filePathWithOutExt.append(filePath);
		}
		return filePathWithOutExt;
	}

}