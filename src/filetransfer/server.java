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
public class server {
    public static void main(String[] args) throws Exception{
        ServerSocket s = new ServerSocket(06762);
        Socket sr = s.accept();
        FileInputStream fr = new FileInputStream("D:\\khafid.txt");
        byte b[]= new byte[20000];
        fr.read(b, 0, b.length);
        OutputStream os = sr.getOutputStream();
        os.write(b, 0, b.length);
        
    }
    
}
