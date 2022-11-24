package javaTut;

public class Brand {
    private String brandName;
    private String ProoductType;

    // public Brand() {
    //     this.brandName = "unknown";
    //     this.ProoductType = "unknown";
    // }
    public Brand(String brandName, String prooductType) {
        this.brandName = brandName;
        ProoductType = prooductType;
    }

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getProoductType() {
        return ProoductType;
    }
    public void setProoductType(String prooductType) {
        ProoductType = prooductType;
    }




}
