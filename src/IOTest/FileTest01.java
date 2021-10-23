package IOTest;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/22 8:15
 */
public class FileTest01 {
    public static void main(String[] args) throws IOException{
        byte[] data = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        try(CountInputStream input = new CountInputStream(new ByteArrayInputStream(data))){
            int n;
            while ((n = input.read()) != -1){
                System.out.println((char) n);
            }
            System.out.println("Tatal read " + input.getBytesRead() + " bytes");

        }


    }
}

class CountInputStream extends FilterInputStream{
    private int  count = 0;

    CountInputStream(InputStream in){
        super(in);
    }

    public int getBytesRead() {
        return this.count;
    }

    public int read() throws IOException{
        int n = in.read();
        if(n != -1){
            this.count ++;
        }
        return n;
    }

    public int read(byte[] b,int off,int len) throws IOException{
        int n = in.read(b,off,len);
        if( n != -1){
            this.count += n;
        }
        return n;
    }

}