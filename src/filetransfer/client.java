/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetransfer;

import java.net.*;
import java.io.*;

/**
 *
 * @author asus
 */
public class client {
     public static void main(String[] args) throws Exception{
         
        byte []b = new byte[20000];
        Socket sr = new Socket("localhost",06762);
        InputStream is = sr.getInputStream();
        FileOutputStream fr = new FileOutputStream("D:\\berhasil.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);
    }
    
}
