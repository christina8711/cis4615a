//Rule 7 Exceptional Behavior (ERR)
//Example ERR00-J. Do not suppress or ignore checked exceptions
try {
  //...
} catch (IOException ioe) {
  ioe.printStackTrace();
}
