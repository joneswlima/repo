package br.com.rd.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class Zip {

	private Zip() {	}

	private static final String DIR_FINAL = "C:\\";
	private static final Logger LOG = Logger.getLogger(Zip.class);

	public static void unzip(File file) throws IOException {
		ZipEntry ze;
		byte[] buff = new byte[16384];
		int readBytes;

		try(ByteArrayInputStream bis = new ByteArrayInputStream(FileUtils.readFileToByteArray(file));
				ZipInputStream zipStream = new ZipInputStream(bis);) {
			
			while ((ze = zipStream.getNextEntry()) != null) {
				String fileName = DIR_FINAL + ze.getName();
				if (ze.isDirectory()) {
					Files.createDirectories(Paths.get(fileName));
					continue;
				}

				try (FileOutputStream outFile = new FileOutputStream(fileName);) {

					while ((readBytes = zipStream.read(buff)) != -1) {
						outFile.write(buff, 0, readBytes);
					}
					LOG.info(String.format("Extraido:%s", fileName));
				}
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}
}
