package Адаптер;

public class AdapterPatern {
    public static void main(String[] args) {
        Vector vector=new VectorAdapterFromRaster();
        vector.drawLine();
        vector.drawSquare();
        Vector vector1=new VectorAdapterFromRaster2(new RasterG());
        vector1.drawLine();
        vector1.drawSquare();
    }
}
interface  Vector{
    void  drawLine();
    void  drawSquare();


}
class RasterG{
    void drawRasterLine(){
        System.out.println("line");
    }

    void drawRasterSquare(){
        System.out.println("square");
    }
}
class  VectorAdapterFromRaster extends RasterG implements Vector{

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
class  VectorAdapterFromRaster2  implements Vector{

    RasterG rasterG=null;

    public VectorAdapterFromRaster2(RasterG rasterG) {
        this.rasterG = rasterG;
    }

    public void drawLine() {
         rasterG.drawRasterLine();
    }

    public void drawSquare() {
        rasterG.drawRasterSquare();
    }


}