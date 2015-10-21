/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author xhyde
 */
public class Ventana {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Ventanasa a = new Ventanasa();
        a.setVisible(true);
        try (
                //Conexion al servidor
                //Lector teclado
                BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));) {
            String input;

            while ((input = stdin.readLine()) != null) {

                System.out.println("Enviado: " + input);

            }
        } catch (UnknownHostException e) {
            System.err.println("Host no alcanzado");
            System.exit(1);
        }
    }
}