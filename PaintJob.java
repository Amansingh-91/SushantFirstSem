package javaTut;

public class PaintJob {
    public int getBucketCount(double width,double height, int areaPerBucket, int extraBucket){
        if(width <=0 || height <=0 || areaPerBucket <=0 || extraBucket <0){
            return -1;
        }
        int count = (int) ((width * height)/areaPerBucket) - extraBucket;
        return count;
    }
    public int getBucketCount(double width,double height, int areaPerBucket){
        if(width <=0 || height <=0 || areaPerBucket <=0 ){
            return -1;
        }
        int count = (int) ((width * height)/areaPerBucket) ;
        return count;
    }

    public int getBucketCount(int areaOfWall, int areaPerBucket){
        if(areaOfWall<=0 || areaPerBucket <=0 ){
            return -1;
        }
        int count =(areaOfWall/areaPerBucket) ;
        return count;
    }
}
