import java.io.File;

import org.apache.http.HttpEntity;

import home.student.Downloads.org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class SinCos30 {
 
    int a = 30;
    double sinusA;
    double cosinusA;
    double rad;
    
    public SinCos30() {
        rad = gradInRag(a, Math.PI);
        sinus(rad);
        cosinusA(rad);
    }
 
    public double gradInRag(double a, double PI) {
        rad = (a * PI) / 180;
        return rad;
    }
 
    public double sinus(double rad) {
        sinusA = Math.sin(rad);
        return sinusA;
    }
 
    public double cosinusA(double rad) {
        cosinusA = Math.cos(rad);
        return cosinusA;
    }
 
    public static void print(SinCos30 rad) {
        System.out.println("sin " + rad.a + " = " + rad.sinusA);
        System.out.println("cos " + rad.a + " = " + rad.cosinusA);
    }
 
    public static void main(String[] args) {
        SinCos30 rad = new SinCos30();
        SinCos30.print(rad);
    }
}
