package SourcePackage;

import java.net.URL;

public class Taller{

    public Taller(){}

    public static void main(String[] args) {
        try{
            URL eval = new URL("https://campusvirtual.escuelaing.edu.co/moodle/pluginfile.php/222974/mod_resource/content/0/NamesNetworkClientService.pdf");
            System.out.println("Protocol: " + eval.getProtocol());
            System.out.println("Authority: " + eval.getAuthority());
            System.out.println("Host: " + eval.getHost());
            System.out.println("Port: " + eval.getPort());
            System.out.println("Path: " + eval.getPath());
            System.out.println("Query: " + eval.getQuery());
            System.out.println("File: " + eval.getFile());
            System.out.println("Ref: " + eval.getRef());
        }
        catch(Exception e){
            System.out.println("momento xd");
        }
    }
}