//Rule 02. Expressions (EXP)
import java.io.File;

public void deleteFile() {

  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }

}