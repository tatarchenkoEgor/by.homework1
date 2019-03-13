package ormedia.src.main.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

class Service {

    private static final String TEST_PDF = "C:\\Users\\Admin\\IdeaProjects\\ormedia\\web\\files\\test.pdf";
    private static final String PDF = "application/pdf";
    private static final String TEST_JPG = "C:\\Users\\Admin\\IdeaProjects\\ormedia\\web\\files\\testImage.jpg";

    void download(OutputStream outputStream, String typeContent) throws IOException {
        String fileName;
        if(typeContent.equals(PDF)){
             fileName = TEST_PDF;
        }
        else{
            fileName = TEST_JPG;
        }

        File myFile = new File(fileName);
        FileInputStream inputStream = new FileInputStream(myFile);
        byte[] buffer = new byte[4096];
        int length;

        while ((length = inputStream.read(buffer)) > 0){
            outputStream.write(buffer, 0, length);
        }

        inputStream.close();
        outputStream.flush();
    }
}
