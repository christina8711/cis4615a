//Rule 13 Input Output (FIO)
//Example FIO02-J. Detect and handle file-related errors
File file = new File("file");
if (!file.delete()) {
  // Deletion failed, handle error
}
