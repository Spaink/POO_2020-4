package aula11.as09b.exercicio01;

import java.io.InputStream;

import org.xml.sax.ContentHandler;

public interface XMLReader {
	public void setContentHandler(ContentHandler handler);
	public void parse(InputStream is);
}
