package br.com.rd.zip;

import static br.com.rd.util.Zip.unzip;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

public class MainUnzip {

	private static final Logger LOG = Logger.getLogger(MainUnzip.class);

	private static final String[] AGENTS_ZIP = { "C:\\TC-Agent.zip", "C:\\agent-inventory.zip" };

	public static void main(String[] args) throws IOException {
		LOG.info("Iniciando Unzipzilla 1.0.0");
		for (int i = 0; i < AGENTS_ZIP.length; i++) {
			LOG.info(String.format("Extraindo arquivo:%s", AGENTS_ZIP[i].replace("C:\\", "")));
			unzip(new File(AGENTS_ZIP[i]));
		}
	}
}
