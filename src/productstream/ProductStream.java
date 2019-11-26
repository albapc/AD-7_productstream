package productstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Alba
 */
public class ProductStream {

    private static FileOutputStream fos;
    private static BufferedOutputStream bos;
    private static DataOutputStream dos;
    private static DataInputStream dis;
    private static FileInputStream fis;
    private static BufferedInputStream bis;
    
    
    public static void main(String[] args) throws IOException {
        
            fos = new FileOutputStream("produtos.txt");
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            fis = new FileInputStream("produtos.txt");
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
    
        //objs de la clase products
        Products po1 = new Products("cod1", "parafusos", 3);
        Products po2 = new Products("cod2", "cravos", 4);
        Products po3 = new Products();

        
        ProductStream ps = new ProductStream();
        
        ps.escribir(po1);
        ps.escribir(po2);
        dos.close();
        ps.leer(po3);
        dis.close();    

    }
    
    public void escribir(Products pro) throws IOException {
        
            dos.writeUTF(pro.getCodigo());
            dos.writeUTF(pro.getDescricion());
            dos.writeDouble(pro.getPrezo());
            
    }
    
    public void leer(Products pro) throws IOException {

            while ((dis.available() != 0)) {
                pro.setCodigo(dis.readUTF());
                pro.setDescricion(dis.readUTF());
                pro.setPrezo(dis.readDouble());
                System.out.println(pro.getCodigo() + ", " + pro.getDescricion()
                        + ", " + pro.getPrezo());
            }
    }
}
