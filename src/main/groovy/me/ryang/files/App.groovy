/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package me.ryang.files

public class App {

  public static void main(String[] args) {
    def folder
    if (args.length > 0) {
      folder = args[0]
    }

    Utils.renameAllFiles(folder)
  }
}
