package org.example.strategy;

public class ImageStorage {
    Filter filter;
    Compressor compressor;

    public ImageStorage(Filter filter, Compressor compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }

    public void store() {
/*        if (compressor == "PNG"){
            System.out.println("Storing in PNG...");
        }
        if (compressor == "JPG"){
            System.out.println("Storing in JPG...");
        }
        if (filter == "BW"){
            System.out.println("Black and white...");
        }
        if (filter == "filter1"){
            System.out.println("filter1...");
        }*/

        filter.filter();
        compressor.compress();
        System.out.println("Storing...");
        System.out.println("Stored");
    }
}
