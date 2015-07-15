package com.sebastianaudet.saneprinting;

/**
 * @author Sebastian Audet
 * @version on 7/15/15.
 */
public class PrintUtils {
  public static void pl(Object s){
    System.out.println(s);
  }
  public static void ple(Object s){
    System.err.println(s);
  }
  public static void p(Object s){
    System.out.print(s);
  }
  public static void pe(Object s){
    System.err.print(s);
  }
}
