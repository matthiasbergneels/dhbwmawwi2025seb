package excersises.chapter8;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class DebugFileWriter extends FileWriter {

  public DebugFileWriter(String fileName) throws IOException {
    super(fileName);
  }

  @Override
  public void close() throws IOException {
    System.out.println("Closing File: " + this);
    super.close();
  }

  @Override
  public void flush() throws IOException {
    //throw new IOException("flush() not supported");
    super.flush();
  }
}
